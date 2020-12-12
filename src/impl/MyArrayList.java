package impl;

import intf.MyList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private int size;
    private int lengthCounter = 10;
    private Object arr[] = new Object[size+lengthCounter];


    @Override
    public void add(E e) {

        if (lengthCounter == size) {
            Object[] alterArr = Arrays.copyOf(arr, lengthCounter);
            lengthCounter += 10;
            arr = new Object[size+lengthCounter];
            for (int i = 0; i < alterArr.length; i++) {
                arr[i] = alterArr[i];
            }
        }
        arr[size] = e;
        size++;
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public void set(int index) {

    }

    @Override
    public MyList<E> get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (i == size-1) {
                sb.append(arr[i]);
                break;
            }
            sb.append(arr[i]+ ", ");
        }
        return "["+sb.toString() +"]";
    }
}
