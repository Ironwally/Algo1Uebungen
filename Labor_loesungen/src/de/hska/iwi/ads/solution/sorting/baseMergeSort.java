package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public abstract class baseMergeSort<E extends Comparable<E>> extends AbstractMergesort<E> {
    @Override
    protected void mergesort(E[] a, int left, int right) {
        if(left<right) {
            int mid = (left+right)/2;
            mergesort(a,left,mid);
            mergesort(a,mid+1,right);
            verschmelzen(a,left,mid,right);

        }
    }
    protected abstract void verschmelzen(E[] a, int left, int mid, int right);
}
