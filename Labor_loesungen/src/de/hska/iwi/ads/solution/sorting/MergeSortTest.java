package de.hska.iwi.ads.solution.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void testFunc(){
        Mergesort<Integer> ms = new Mergesort<>();
        Integer[] a = {2,3,4,5,1};
        ms.sort(a);
        Integer[] b = {1,2,3,4,5};
        assertArrayEquals(b,a);
    }
    @Test
    void testReversesame(){
        Mergesort<Integer> ra = new Mergesort<>();
        Integer[] arr = new Integer[]{4,3,2,1};
        ra.sort(arr);
        Integer[] exp = new Integer[]{1,2,3,4};
        assertArrayEquals(exp,arr);
    }
}
