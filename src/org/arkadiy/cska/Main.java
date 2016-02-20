package org.arkadiy.cska;

import org.arkadiy.cska.baski.sort.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sort<Integer> integerBubbleSort = new HeapSort<>();
        Integer[] array = {5, 1, 3, 7, 1337, 2};
        integerBubbleSort.sort(array);

        System.out.print(Arrays.toString(array));
    }
}
