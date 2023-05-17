package de.hska.iwi.ads.solution.sorting;

public class Mergesort<E extends Comparable<E>> extends baseMergeSort<E> {
    protected void verschmelzen(E[] a,int left, int mid, int right) {
        int l = left;
        int r = mid+1;
        //a[] split in a[] and b[]
        for (int i=left;i<=right;i++) {
            if(r>right ||
                    (l<=mid && (a[l].compareTo(a[r]))<=0) ) {
                        b[i] = a[l];
                        l += 1;
            } else {
                b[i] = a[r];
                r = r+1;
            }
        }
        for (int i=left;i<=right;i++) {
            a[i] = b[i];
        }
    }
}
