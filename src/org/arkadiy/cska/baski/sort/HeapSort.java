package org.arkadiy.cska.baski.sort;

/**
 * Created by baski on 20.02.16.
 */
public class HeapSort<T extends Comparable<T>> extends Sort<T> {

    private T[] _array;
    private  int _length;

    @Override
    public void sort(T[] array){
        _array = array;
        _length = array.length;
        for(int k = _length/2 - 1; k >= 0; k--){
            siftDown(k);
        }
        while(_length>0){
            exchange(0, --_length );
            siftDown(0);
        }
    }

    private void siftDown(int v) {
        int i;
        while (v * 2 + 1 < _length) {
            i = v * 2 + 1;
            if (i + 1 < _length) {
                if(less(i,i + 1)) i++;
            }
            if(!less(v,i)) break;
            exchange(v,i);
            v = i;
        }
    }

    private void siftUp(int v){
        int parent = parent(v);
        while (v > 0 && less(parent,v)){
            exchange(parent, v);
            v = parent;
            parent = parent(v);
        }
    }

    private int parent(int v){
        int parent = v / 2;
        if(v % 2 == 0 && parent != 0) parent--;
        return parent;
    }

    private boolean less(int v, int w){
        return _array[v].compareTo(_array[w]) < 0;
    }

    private void exchange(int i, int j){
        T buff = _array[i];
        _array[i] = _array[j];
        _array[j] = buff;
    }
}
