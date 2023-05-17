package de.hska.iwi.ads.solution.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest {
    @Test
    void test() {
        ReverseArray<Integer> r = new ReverseArray<>();
        Integer[] arr = new Integer[]{1,2,3,4,5};
        r.reverse(arr,0,4);
        Integer[] exp = new Integer[]{5,4,3,2,1};
        assertArrayEquals(arr,exp);
    }
    @Test
    void partial() {
        ReverseArray<Integer> r = new ReverseArray<>();
        Integer[] arr = new Integer[]{1,2,3,4,5};
        r.reverse(arr,3,4);
        Integer[] exp = new Integer[]{1,2,3,5,4};
        assertArrayEquals(arr,exp);
    }
}
