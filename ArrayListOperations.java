import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void add(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void remove(ArrayList<Integer> list, int value) {
        list.remove(Integer.valueOf(value));
    }

    public static int search(ArrayList<Integer> list, int key) {
        return list.indexOf(key);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void display(ArrayList<Integer> list) {
        System.out.println("ArrayList Traversal: " + list);
    }
}