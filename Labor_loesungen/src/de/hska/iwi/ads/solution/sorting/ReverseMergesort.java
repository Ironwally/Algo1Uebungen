package de.hska.iwi.ads.solution.sorting;

public class ReverseMergesort<E extends Comparable<E>> extends baseMergeSort<E> {

    @Override
    protected void verschmelzen(E[] a,int left, int mid, int right) {
        int l = left;
        int r = right;
        ReverseArray<E> ra = new ReverseArray<>();
        ra.reverse(a,mid+1,right);
        //a[] split in a[] and b[]
        for (int i=left;i<=right;i++) {
            if((a[l].compareTo(a[r]))<=0) {
                b[i] = a[l];
                l += 1;
            } else {
                b[i] = a[r];
                r--;
            }
        }
        for (int i=left;i<=right;i++) {
            a[i] = b[i];
        }
    }
}
