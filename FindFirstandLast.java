
import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array



public class FindFirstandLast {
    public static void main(String[] args) {
        int[] arr = {12,23,45,45,45,45,78,89};
        int target = 45;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target,true);
        if(ans[0] != -1){
            ans[1] = search(nums ,target ,false);
        }
        return ans;
    }

    public static int search(int[] nums , int target,boolean what){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end)
        {
            int mid = start +(end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(what){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else if(nums[mid] < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}


//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]