package de.hska.iwi.ads.solution.search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class bsTest {
    @Test
    void testSearchFunc() {
        BinarySearch bS = new BinarySearch<Integer>();
        Comparable[] a = new Comparable[]{1, 2, 3, 4, 5, 6};

        int i = bS.search(a,5,0,a.length-1);
        assertEquals(5,i);
    }
}
