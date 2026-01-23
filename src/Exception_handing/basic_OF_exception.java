package Exception_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class basic_OF_exception {
    public static void arithmetic_exception(){
        try
        {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after exception handling.");
    }
    public static void numbermissmatch_exception(){
        Scanner sc=new Scanner(System.in);
        try {
            int a = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("error: number missmatch exception"+e);
        }
        System.out.println("error resolve");

    }
    public static void main(String args[]){
//     arithmetic_exception();
        numbermissmatch_exception();
}
}
