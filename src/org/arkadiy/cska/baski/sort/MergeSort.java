package org.arkadiy.cska.baski.sort;

/**
 * Created by baski on 13.02.16.
 */
public class MergeSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] array){
        sort(array, 0, array.length -1);
    }
    private void sort(T[] array, int lo, int hi){
        if( hi <= lo ) return;
        int mid = lo + (hi - lo)/2;
        sort(array, lo, mid);
        sort(array, mid + 1, hi);
        merge(array,lo ,mid, hi);
    }
}
    
 
