/*
Using a stack check whether a string is a palindrome or not. You may use the built-in
stack class or create you own stack using array.
*/


import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class i {

    static String rev(String s) {
        Stack<Character> stk1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {          //pushing characters of the string in the stack
            stk1.push(s.charAt(i));
        }
        String revStr = "";
        Iterator i = stk1.iterator();
        while (i.hasNext()) {                           //popping those chars and storing them in them in a string variable
            revStr += stk1.pop();
        }
        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        sc.close();
        String rev_s = rev(s);                           //checking if given string and the string made from popped characters is equal
        if (s.equals(rev_s)) {
            System.out.println("It is a palindrome..."); //equal means a palindrome 
        }                                               
        else {
            System.out.println("It is not a palindrome...");
        }

    }
}
