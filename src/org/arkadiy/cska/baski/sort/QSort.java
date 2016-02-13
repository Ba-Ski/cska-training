  package org.arkadiy.cska.baski.sort;

import java.util.Random;

/**
 * Created by baski on 13.02.16.
 */
public class QSort<T extends Comparable<T>> extends Sort<T> {
    
    @Override
    public void sort(T[] array){
        sort(array, 0, array.length -1);
    }
    
    private void sort(T[] array, int lo, int hi){
        if ( hi <= lo ) return;
        int j = partition(array,lo, hi);
        sort(array, lo, j-1);
        sort(array, j+1, hi);
        
    }
    
    private static <T extends Comparable<T>> int partition(T[] array, int lo, int hi){
        Random rand = new Random();
        
        int base_ind = rand.nextInt((hi - lo) + 1) + lo;
        int i = lo, j = hi + 1;
        
        T base = array[base_ind];
        array[base_ind] = array[lo];
        array[lo] = base;
        
        while( 2 < 3){
            while(less(array[++i], base)) if ( i == hi) break;
            while(less(base, array[--j])) if ( j == lo) break;
            if ( i >= j ) break;
            exchange(array, i, j);
        }
        exchange(array, lo, j);
        return j;
    }
}
