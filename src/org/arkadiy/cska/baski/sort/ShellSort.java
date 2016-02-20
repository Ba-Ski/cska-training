package org.arkadiy.cska.baski.sort;

/**
 * Created by baski on 13.02.16.
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public  void sort(T[] array){
        int N = array.length;
        int h = 1;
        while (h < N/3) h = h*3 + 1;
        while (h>=1){
            for(int i = h; i < N; i++) {
                for (int j = i ; j >= h && less(array[j], array[j-h]); j--){
                    exchange(array, j, j-h);
                }
            }
            h /= 3;
        }
    }
}
