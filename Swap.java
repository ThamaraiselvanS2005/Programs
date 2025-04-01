

import java.util.Scanner;

public class Swap {
    public static void main (String args[]) {

//
        @SuppressWarnings("resource")//extra content added by vs code
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1 = ");
        int num1 = scan.nextInt();
        System.out.println("enter number 2 = ");
        int num2 = scan .nextInt();
        System.out.println("before swap");
        System.out.println(num1 +","+ num2);
//        int temp;
//        temp = num1;
//        num1 = num2;
//        num2 = temp;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;



        System.out.println("after swap");
        System.out.println(num1 +","+ num2);



    }

}
