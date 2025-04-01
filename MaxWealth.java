

public class MaxWealth {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 3, 4},
                {5, 6, 4,},
                {6, 4}
        };
        int result = maximumWealth(mat);
        System.out.println(result);

    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
//                System.out.print(accounts[row][col] + " ");
            }

            if (sum > max)
                max = sum;
        }
        return max;
//            System.out.println(" ");
        }

    }


    /*
    leetcode
    class Solution {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int customer = 0 ;customer < accounts.length ;customer ++){
        int sum = 0;
         for(int account = 0 ; account < accounts[customer].length;account++)
         {
                sum = sum + accounts[customer][account];
         }
         if(sum> max)
         {
            max = sum;
         }

        }
       return max;
    }
}
     */


/* enhanced method
class Solution {

    public int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;
        for(int[] row : accounts){
        int sum = 0;
         for(int col:row)
         {
                sum += col;
         }
         maxi = Math.max(maxi,sum);
        }
       return maxi;
    }
}
 */



