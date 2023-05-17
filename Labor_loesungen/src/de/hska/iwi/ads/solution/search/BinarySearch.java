package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] a, E key, int left, int right) {
        int mid = left + (right - left)/2;                   //Kein Cast nötig, int macht alles für dich
        if(key.compareTo(a[left]) < 0) return left-1;
        else if(key.compareTo(a[right]) > 0) return right+1;

        while (left<=right) {
            int go = key.compareTo(a[mid]);

            if (go == 0) {
                if (mid!=0 && key.compareTo(a[mid - 1])==0) {
                    right=mid-1;
                    mid = left + (right - left)/2;
                } else {
                    return mid;
                }
            }
            else if (go > 0) {
                left = mid+1;
                mid = left + (right - left)/2;
            } else {
                right = mid-1;
                mid = left + (right - left)/2;
            }
        }
        return left;
    }

}
