/*
 * Copyright 2004-2013 H2 Group. Multiple-Licensed under the H2 License,
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.glowroot.agent.shaded.h2.command.dml;

import org.glowroot.agent.shaded.h2.api.ErrorCode;
import org.glowroot.agent.shaded.h2.command.CommandInterface;
import org.glowroot.agent.shaded.h2.command.ddl.SchemaCommand;
import org.glowroot.agent.shaded.h2.engine.Database;
import org.glowroot.agent.shaded.h2.engine.Right;
import org.glowroot.agent.shaded.h2.engine.Session;
import org.glowroot.agent.shaded.h2.expression.Expression;
import org.glowroot.agent.shaded.h2.message.DbException;
import org.glowroot.agent.shaded.h2.schema.Schema;
import org.glowroot.agent.shaded.h2.schema.Sequence;
import org.glowroot.agent.shaded.h2.table.Column;
import org.glowroot.agent.shaded.h2.table.Table;

/**
 * This class represents the statement
 * ALTER SEQUENCE
 */
public class AlterSequence extends SchemaCommand {

    private Table table;
    private Sequence sequence;
    private Expression start;
    private Expression increment;
    private Boolean cycle;
    private Expression minValue;
    private Expression maxValue;
    private Expression cacheSize;

    public AlterSequence(Session session, Schema schema) {
        super(session, schema);
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isTransactional() {
        return true;
    }

    public void setColumn(Column column) {
        table = column.getTable();
        sequence = column.getSequence();
        if (sequence == null) {
            throw DbException.get(ErrorCode.SEQUENCE_NOT_FOUND_1, column.getSQL());
        }
    }

    public void setStartWith(Expression start) {
        this.start = start;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
    }

    public void setCycle(Boolean cycle) {
        this.cycle = cycle;
    }

    public void setMinValue(Expression minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(Expression maxValue) {
        this.maxValue = maxValue;
    }

    public void setCacheSize(Expression cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Override
    public int update() {
        Database db = session.getDatabase();
        if (table != null) {
            session.getUser().checkRight(table, Right.ALL);
        }
        if (cycle != null) {
            sequence.setCycle(cycle);
        }
        if (cacheSize != null) {
            long size = cacheSize.optimize(session).getValue(session).getLong();
            sequence.setCacheSize(size);
        }
        if (start != null || minValue != null ||
                maxValue != null || increment != null) {
            Long startValue = getLong(start);
            Long min = getLong(minValue);
            Long max = getLong(maxValue);
            Long inc = getLong(increment);
            sequence.modify(startValue, min, max, inc);
        }
        // need to use the system session, so that the update
        // can be committed immediately - not committing it
        // would keep other transactions from using the sequence
        Session sysSession = db.getSystemSession();
        synchronized (sysSession) {
            db.update(sysSession, sequence);
            sysSession.commit(true);
        }
        return 0;
    }

    private Long getLong(Expression expr) {
        if (expr == null) {
            return null;
        }
        return expr.optimize(session).getValue(session).getLong();
    }

    @Override
    public int getType() {
        return CommandInterface.ALTER_SEQUENCE;
    }

}
