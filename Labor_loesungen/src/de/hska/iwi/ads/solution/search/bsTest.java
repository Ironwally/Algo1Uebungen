package de.hska.iwi.ads.solution.search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class bsTest {
    @Test
    void testSearchFunc() {
        BinarySearch bS = new BinarySearch<Integer>();
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6};

        int i = bS.search(a,6,0,a.length-1);
        assertEquals(5,i,0);
    }
    @Test
    void testSearchOverRight() {
        BinarySearch bS = new BinarySearch<Integer>();
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6};

        int i = bS.search(a,8,0,a.length-1);
        assertEquals(6,i,0);
    }
    @Test
    void testSearchUnderLeft() {
        BinarySearch bS = new BinarySearch<Integer>();
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6};

        int i = bS.search(a,0,0,a.length-1);
        assertEquals(-1,i,0);
    }
    @Test
    void testSearchUnderLeft1() {
        BinarySearch bS = new BinarySearch<Integer>();
        Integer[] a = new Integer[]{1, 2, 3, 4, 6};

        int i = bS.search(a,5,0,a.length-1);
        assertEquals(4,i,0);
    }
    @Test
    void testSearchUnderLeft2() {
        BinarySearch bS = new BinarySearch<Integer>();
        Integer[] a = new Integer[]{0,0,0,1, 2, 3, 4, 6};

        int i = bS.search(a,0,0,a.length-1);
        assertEquals(0,i,0);
    }
}
