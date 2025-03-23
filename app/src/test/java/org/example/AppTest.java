package org.example;

import static org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class FuzzyFinderTest {=
    @Test
    void testLinearSearchSorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = finder.linearSearch(sortedFuzzies);
        assertTrue(index >= 0, "Golden fuzzy should be found in a sorted list using linear search.");
    }
    @Test
    void testBinarySearchSorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = finder.binarySearch(sortedFuzzies);

        assertTrue(index >= 0, "Golden fuzzy should be found in a sorted list using binary search.");
    }
    @Test
    void testLinearSearchRandom() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.linearSearch(randomFuzzies);
        assertTrue(index >= 0, "Golden fuzzy should be found in a random list using linear search.");
    }
    @Test
    void testBinarySearchRandom() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.binarySearch(randomFuzzies);
        assertEquals(-1, index, "Binary search should fail on a random list.");
    }
}

