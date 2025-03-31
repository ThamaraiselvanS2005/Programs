import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[])
    {
        int[] arr = {78,56,15,718,5,7,-11,-5,69};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int target = scan.nextInt();
        int result = linear(arr,target);
        if (result == -1 ){
            System.out.println("Element no found in this array");
        }
        else {
            System.out.println("Element found at the index :" + result);
        }
    }
    public static int linear(int[] arr,int target)
    {
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;

    }
}

/*
import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class HereYouTryAll {
    public static void main(String args[])
    {
        int[] arr = {78,56,15,718,5,7,-11,-5,69};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int target = scan.nextInt();
        int result = linear(arr,target);
        if (result == Integer.MAX_VALUE ){
            System.out.println("Element no found in this array");
        }
        else {
            System.out.println("Element found at the index :" + result);
        }
    }
    public static int linear(int[] arr,int target)
    {
        for(int ref : arr)
        {
            if(ref == target)
            {
                return ref;
            }
        }
        return Integer.MAX_VALUE;
    }
}

*/

