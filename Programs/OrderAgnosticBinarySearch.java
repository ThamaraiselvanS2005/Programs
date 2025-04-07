
package Programs;


import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String args[]) {
        //Array must be sorted
        int[] arr = {34,2,5,44,86,37,85,54,99,64};
//        int[] arr = {97,76,54,44,32,29,12,9,6,4,1,-5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element do you want to find : ");
        int target = scan.nextInt();
        int result = search(arr,target);
        if(result == -1)
        {
            System.out.println("Element not found in the array ");
        }
        else{
            System.out.println("element found at the index : "+result);
        }
    }
    public static int search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start <= end) {
            //mid = (start+end)/2;
            mid = start +(end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if(arr[start] < arr[end])
            {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
