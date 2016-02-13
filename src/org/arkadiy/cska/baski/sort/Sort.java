package org.arkadiy.cska.baski.sort;

import java.util.Arrays;

/**
 * Created by baski on 13.02.16.
 */
public class Sort<T extends Comparable<T>> implements SortAlgorithm<T>
{
    public void sort(T[] array){}
    
    protected static<T extends Comparable<T>> boolean less (T v, T w){
        return v.compareTo(w) < 0;
    }
    
    protected static <T extends Comparable<T>> void exchange(T[] array, int i, int j){
        T buff = array[i];
        array[i] = array[j];
        array[j] = buff;  
    }
    
    protected static <T extends Comparable<T>> void merge(T[] array, int lo, int mid, int hi )
    {
        T[] aux = Arrays.copyOfRange( array, lo, hi+1 );
        int i = 0, j = mid - lo + 1;
        
        for( int k = lo; k <= hi; k++ ){
            if( j > hi -lo )                        array[k] = aux[i++];
            else if( i > mid -lo )                  array[k] = aux[j++];
            else if ( less( aux[j], aux[i]) )   array[k] = aux[j++];
            else                                array[k] = aux[i++];                    
        }
    }
}
