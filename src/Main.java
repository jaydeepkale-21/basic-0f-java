import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//          condition statement
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a:");
    a=sc.nextInt();
//    System.out.println("enter b");
//    int b=sc.nextInt();
    if(99<a && 1000>a){
        System.out.println("number is three digit");
    }
//    else if(a<b){
//        System.out.println("numbre b is greater");
//    }
    else{
        System.out.println("number is not three digit");
    }


    }
    }