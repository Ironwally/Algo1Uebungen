package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {

    @Override
    public void reverse(E[] a, int from, int to) {
        E tmp;
        int j = to;
        for (int i=from;i<=j;i++) {
            tmp=a[i];
            a[i] = a[j];
            a[j] = tmp;
            j--;
        }

    }
}
