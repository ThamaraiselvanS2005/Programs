package Programs;

import java.util.Arrays;

public class Reverse{
    public static void main (String args[]) {

        int[] arr = {12,23,45,34,2,};
        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            rev(arr,start,end);//normal swaping happen 
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void rev(int arr[],int start ,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

