/*
Write a program to find the sum of two 3x3 matrices entered by the user.
*/


import java.util.Arrays;
import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        int arr1[][] = new int[3][3];                                                           //Declaring all 3 matrices
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for the first matrix below  : ");
        for (int i = 0; i < 3; i++) {                                                           //Taking in the first matrix
            System.out.println("Enter row " + (i+1));
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the details for the second matrix below  : ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter row " + (i+1));                                           //Taking in the second  matrix
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                                                       //Adding the 2 matrices
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("After adding the two mateices, we get : ");
        for (int[] i : arr3) {
            System.out.println(Arrays.toString(i));
        }

    }
    
}
