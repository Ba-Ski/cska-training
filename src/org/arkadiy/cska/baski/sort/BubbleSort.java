package org.arkadiy.cska.baski.sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] array) {
        boolean exchanged;
        do {
            exchanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (less(array[i+1], array[i])) {
                    exchange(array, i, i + 1);
                    exchanged = true;
                }
            }
        } while (exchanged);
    }
}
