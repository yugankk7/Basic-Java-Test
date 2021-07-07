/*
Write a program to sort an array of integers in descending order you need to write the
sorting loop yourself not use a library function.
*/

import java.util.Arrays;
import java.util.Scanner;

public class b {

    static void bubbleSort(int arr[]) {                 //Using bubble sort 
        int n = arr.length;
        int temp;                                       //2 For loops which increase the time complexity to O(n^2) but easier to implement
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) {
                    temp = arr[j];                      //Swapping the two values if the first value is smaller
                    arr[j] = arr[j+1];                  //than the second value using a temp variable
                    arr[j+1] = temp;
                } 
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of the array : ");
        for (int i = 0;i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(arr);                                  //Calling the function     

        System.out.println("The array sorted in descending order is " + Arrays.toString(arr));
    }
    
}
