

import java.util.Scanner;

public class c {

        public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");                      //              1
        int n = in.nextInt();                                       //          1   2   1
        in.close();                                                 //     1    2   3   2   1
        for(int i = 1; i <= n; i++) {                               //1    2   3    4   3   2   1
          
            for(int j = i ;j <= n-1; j++) {                                  
            System.out.print(" ");
          
        }
          for(int j = 1; j <= i; j++) {
            
            System.out.print(j);
          
        }
          for(int j = i-1; j >= 1; j--) {
            
            System.out.print(j);
          
        }
          System.out.println();
        }
      }
}
