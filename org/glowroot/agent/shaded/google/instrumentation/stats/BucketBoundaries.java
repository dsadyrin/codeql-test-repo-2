/*
 * Copyright 2017, Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.glowroot.agent.shaded.google.instrumentation.stats;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkArgument;
import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The optional histogram bucket boundaries for a {@link Distribution}.
 */
public final class BucketBoundaries {
  private final List<Double> bucketBoundaries;

  /**
   * @param bucketBoundaries the boundaries for the buckets in the underlying {@link Distribution}.
   * @return a new {@code BucketBoundaries} with the specified boundaries.
   * @throws NullPointerException if {@code bucketBoundaries} is null.
   * @throws IllegalArgumentException if {@code bucketBoundaries} is not sorted, or has zero length.
   */
  public static final BucketBoundaries create(List<Double> bucketBoundaries) {
    checkNotNull(bucketBoundaries, "bucketBoundaries list should not be null.");
    List<Double> bucketBoundariesCopy = new ArrayList<Double>(bucketBoundaries);  // Deep copy.
    checkArgument(!bucketBoundariesCopy.isEmpty(), "Zero length bucket boundaries");
    double lower = bucketBoundariesCopy.get(0);
    for (int i = 1; i < bucketBoundariesCopy.size(); i++) {
      double next = bucketBoundariesCopy.get(i);
      checkArgument(lower < next, "Bucket boundaries not sorted.");
      lower = next;
    }

    return new BucketBoundaries(Collections.unmodifiableList(bucketBoundariesCopy));
  }

  /**
   * @return a list of histogram bucket boundaries.
   */
  public final List<Double> getBoundaries() {
    return bucketBoundaries;
  }

  private BucketBoundaries(List<Double> bucketBoundaries) {
    this.bucketBoundaries = bucketBoundaries;
  }
}
