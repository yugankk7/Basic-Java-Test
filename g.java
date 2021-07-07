/*
The square root n^2 of a perfect square is sum of first n odd numbers. For example
1+3 =4 which is sum of first 2 odd numbers hence square root of 4 is 2
1+3+5 = 9 which is sum of first 3 odd numbers hence square root of 9 is 3
1+3+5+7 = 16 which is sum of first 4 odd numbers hence square root of 16 is 4.
Assuming you will be given a perfect square as an input, use above given algortihm to find
the square root.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class g {
    static int arrSum(ArrayList<Integer> arr) {                 //method to calculate the sum or array
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }


    static int findSqroot(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();          //method to see if the sum is equal to given number
        int i = 1;
        while (arrSum(arr) != n) {                                  //if it is, then stop the loop and count the number of items in array
            arr.add(i);
            i += 2;
        }
        return arr.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");                   //as stated in the question the assumption is made that only 
        int num = sc.nextInt();                                     //perfect squares are given as input
        sc.close();                                                 
        System.out.println("The square root of " + num + " is " + findSqroot(num));
    }
}
