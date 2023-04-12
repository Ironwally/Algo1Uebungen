package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

import java.util.Collection;
import java.util.Collections;

public class BinarySearch<E extends Comparable<E>> implements Search {

    @Override
    public int search(Comparable[] a, Comparable key, int left, int right) {

        left = 0;
        right = a.length;

        int i = left + (right - left)/2;                   //Kein Cast nötig, int macht alles für dich
        while (left<right) {
            int go = key.compareTo(a[i]);

            if (go == 0) return i;

            if (go > 0) {
                left = i+1;
                i = left + (right - (i+1))/2;
            } else {
                right = i-1;
                i = left + (right - (i+1))/2;
            }
        }
        return 0;
    }

}
