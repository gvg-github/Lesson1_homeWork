package metods;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by GVG on 15.08.2017.
 */
public class GenericMetods {
    public static void main(String[] args) {

        String[] arr = new String[]{"1", "2", "3", "4"};
        System.out.println("New array: " + Arrays.toString(arr));
        new GenericMetods().swapElements(arr, 2, 3);
        System.out.println("Array after swap 2 elements: " + Arrays.toString(arr));

        ArrayList<?> newList = new GenericMetods().arrayToList(arr);
        System.out.println("List from array: " + Arrays.toString(newList.toArray()));

    }

    public <T> void swapElements(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public <T> ArrayList<T> arrayToList(T[] arr) {
        ArrayList<T> list = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
