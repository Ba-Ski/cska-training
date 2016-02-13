package org.arkadiy.cska.baski.sort;

public interface SortAlgorithm<T extends Comparable<T>> {

    void sort(T[] array);
}
