/*
Write a program to find whether the user entered number is a prime number or not.
*/


import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    sc.close();                                             //Prime number n will only be divisible by 1 and n itself.
    int c = 0;                                                      
    for (int i = 1; i<=n; i++) {                            //Counting the number of values the given number is divisible by
        if (n % i == 0) {
            c += 1;
        }
    }
    if (c==2) {                                             //2 means it is prime else non prime
        System.out.println("Prime");
    }
    else {
        System.out.println("Not prime");
    }
    }
    
}

