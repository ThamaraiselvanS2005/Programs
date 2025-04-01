
import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the array : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));

        System.out.println("Maximum element");
        int result = max(arr);
        System.out.println(result);


    }

    public static int max(int[] arr) {

        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

}

