/*
 * Artificial Intelligence for Humans
 * Volume 2: Nature Inspired Algorithms
 * Java Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh
 *
 * Copyright 2014 by Jeff Heaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.genetic.genome;

import com.heatonresearch.aifh.evolutionary.genome.Genome;

/**
 * An array genome represents an array of "something", this allows array
 * operators such as crossover and mutate to work on the genome.
 */
public interface ArrayGenome extends Genome {

    /**
     * Copy elements from another array genome into this one.
     *
     * @param source      The source genome.
     * @param sourceIndex The source index.
     * @param targetIndex The target index.
     */
    void copy(ArrayGenome source, int sourceIndex, int targetIndex);

    /**
     * Swap two elements in this genome.
     *
     * @param iswap1 The first element index to swap.
     * @param iswap2 The second element index to swap.
     */
    void swap(int iswap1, int iswap2);

}
