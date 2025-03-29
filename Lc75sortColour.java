package Programs;

//This code beats 100%
import java.util.Arrays;

public class Lc75sortColour {
public static void main(String[] args) {
    int[] nums  = {1,2,0,1,0,2};
    sortColors(nums);
}
public static void sortColors(int[] nums) {
    //Arrays.sort(nums);
    int start = 0, mid = 0 , end = nums.length-1;
    while(mid <= end){
        if(nums[mid]==0)
        {
            swap(nums,start,mid);
            start++;
            mid++;

        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,end,mid);
            end--;
        }
    }
    System.out.println(Arrays.toString(nums));
}

private static void swap(int[] nums ,int i , int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

}
/*
this code beats 14%
public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
 */

