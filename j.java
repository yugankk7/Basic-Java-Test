/* 
Find the factorial of a given number using java ternary operator.
*/

import java.util.Scanner;

public class j {
    static int fact(int n) {
        return (n==0 || n==1) ? 1 : n*fact(n-1);  //using ternary operator for finding factorial
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("The factorial of " + num + " is " + fact(num));
    }
}
