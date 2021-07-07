
import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows...");              //1
        int rows = sc.nextInt();                                        //2 5  
        for(int i = 1;i <= rows; i++){                                  //3 6 8
            int num = i;                                                //4 7 9 10
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num = num + rows - j;
            }
        System.out.println();
        }
        sc.close();
    }
    }
