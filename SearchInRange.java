import java.util.Scanner;

public class SearchInRange {
    public static void main(String args[])
    {
        int[] arr = {78,56,15,718,5,7,-11,-5,69};
        int start = 1;
        int end = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int target = scan.nextInt();
        int result = linear(arr,target,start,end);
        if (result == -1 ){
            System.out.println("Element no found in this array");
        }
        else {
            System.out.println("Element found at the index :" + result);
        }
    }
    public static int linear(int[] arr,int target,int start ,int end)
    {
        for(int i = 2 ; i< 6 ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;

    }
}

