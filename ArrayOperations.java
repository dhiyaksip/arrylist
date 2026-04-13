import java.util.Arrays;

public class ArrayOperations {

    // Traversal
    public static void traversal(int[] arr) {
        System.out.println("Array Traversal: " + Arrays.toString(arr));
    }

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (array harus sorted)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Insert
    public static int[] insert(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        return newArr;
    }

    // Delete
    public static int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);

        return newArr;
    }
}