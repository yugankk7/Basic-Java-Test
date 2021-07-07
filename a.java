/*
Write a program to implement this formula C(n,r) = n! /((n-r)! * r!), use as much recursion
as possible,if the program is not done using recursion it will not be given any marks.
*/


import java.util.Scanner;

public class a {
    static int ncr(int n, int r) {
        if (r == 0 || r == n) {                     //Base case for the recursion
            return 1;
        }
        else {
            return ncr(n-1, r-1) + ncr(n-1, r);    //
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of 'r' : ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("The value for nCr is : " + ncr(n, r));
    }
}
