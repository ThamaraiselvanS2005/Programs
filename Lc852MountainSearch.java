package Programs;

public class Lc852MountainSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,24,45,100,88,54,21,10,3,0};
        int result =  peakIndexInMountainArray(arr);
        System.out.println(result);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        //while loop based on array index initially 0<10; then it continues until start = end

        while(start <end){
            int mid = start +(end - start)/2;
            //ex: arr[mid] = 100; and arr[mid+1] = 88; then it is decrease part of array
            //we don't need second part because we want peak element
            if(arr[mid] > arr[mid +1])
                end = mid;
            else{
                //if mid<mid +1 true then we are in increase part of array so we don't need
                //first part of array because we want peak element
                start = mid +1;
            }

        }
        return start;
    }
}
