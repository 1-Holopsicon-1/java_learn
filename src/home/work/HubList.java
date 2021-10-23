package home.work;

import java.util.Arrays;
import java.util.Comparator;

class HubList<E> implements HubListImpl<E>{
    private int size = 0;
    E[] arr;

    public HubList() {
        arr = (E[]) new Object[this.size];
    }

    public void add(E element) {
        size++;
        E[] arr2 = (E[]) new Object[this.size];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[this.size-1] = element;
        arr = arr2;
    }

    public E removeAt(int index) {
        E out = arr[index];
        arr[index] = null;
        E[] arr2 = (E[]) new Object[size - 1];
        for (int i = 0; i < index ; i++)
                arr2[i] = arr[i];
        for (int i = index + 1; i < arr.length ; i++)
                arr2[i - 1] = arr[i];
        size--;
        arr = arr2;
        return out;
    }

    public void sort(Comparator<? super E> c) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (0 < c.compare(arr[i], arr[j])) {
                    E old = arr[i];
                    arr[i] = arr[j];
                    arr[j] = old;
                }
            }
        }
    }

    public int find(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(arr[i]))
                return i;
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(arr, 0, size));
    }
}
