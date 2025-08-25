package org.glowroot.agent.shaded.ning.compress.lzf;

import org.glowroot.agent.shaded.ning.compress.CompressionFormatException;

public class LZFException extends CompressionFormatException
{
    private static final long serialVersionUID = 1L;

    public LZFException(String message) {
        super(message);
    }

    public LZFException(Throwable t) {
        super(t);
    }

    public LZFException(String message, Throwable t) {
        super(message, t);
    }
}
