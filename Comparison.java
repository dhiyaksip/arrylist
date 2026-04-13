import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Traversal
        ArrayOperations.traversal(arr);
        ArrayListOperations.display(list);

        // Search
        long start = System.nanoTime();
        int indexArr = ArrayOperations.linearSearch(arr, 30);
        long end = System.nanoTime();
        System.out.println("Search Array index: " + indexArr);
        System.out.println("Waktu Array: " + (end - start) + " ns");

        start = System.nanoTime();
        int indexList = ArrayListOperations.search(list, 30);
        end = System.nanoTime();
        System.out.println("Search ArrayList index: " + indexList);
        System.out.println("Waktu ArrayList: " + (end - start) + " ns");

        // Insert
        arr = ArrayOperations.insert(arr, 25, 2);
        list.add(2, 25);

        System.out.println("Array setelah insert: " + Arrays.toString(arr));
        System.out.println("ArrayList setelah insert: " + list);

        // Delete
        arr = ArrayOperations.delete(arr, 2);
        list.remove(2);

        System.out.println("Array setelah delete: " + Arrays.toString(arr));
        System.out.println("ArrayList setelah delete: " + list);

        // Sorting
        ArrayListOperations.sort(list);
        System.out.println("ArrayList setelah sorting: " + list);
    }
}