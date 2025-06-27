package Programs;
import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 1;
        Arrays.sort(a);
        int result = search(a, key);
        System.out.println("elment founde at index : " + result);

    }

    public static int search(int a[], int key) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while (start <= end)
        {
            mid = start + (end - start) / 2;

            if (key == a[mid])
            {
                return mid;
            }
            else if (key < a[mid])
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

