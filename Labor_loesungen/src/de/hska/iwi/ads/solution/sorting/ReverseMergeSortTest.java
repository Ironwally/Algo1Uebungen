package de.hska.iwi.ads.solution.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseMergeSortTest {
    @Test
    void test() {
        ReverseMergesort<Integer> ra = new ReverseMergesort<>();
        Integer[] arr = new Integer[]{4,3,2,1};
        ra.sort(arr);
        Integer[] exp = new Integer[]{1,2,3,4};
        assertArrayEquals(exp,arr);
    }
    @Test
    void testBig() {
        ReverseMergesort<Integer> ra = new ReverseMergesort<>();
        Integer[] arr = new Integer[100000];
        for (int i=0;i<arr.length;i++) {
            arr[i] = 0;
        }
        System.out.println("SORTING!");
        Integer[] exp = arr.clone();
        ra.sort(arr);

        assertArrayEquals(exp,arr);
    }
}
