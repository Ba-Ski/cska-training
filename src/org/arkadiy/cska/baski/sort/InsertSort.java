package org.arkadiy.cska.baski.sort;

/**
 * Created by baski on 13.02.16.
 */
public class InsertSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] array) {
        int N = array.length;
        for( int i = 1; i < N; i++){
            for( int j = i; j > 0 && less(array[j], array[j-1]); j--){
                exchange(array, j, j-1);
            }
        }
    }
}
