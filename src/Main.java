import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        upper  design
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=5;k++){
//                System.out.print("*");
//            }
//            for (int r=i;r<=5;r++){
//                System.out.print(" ");
//            }
//            for (int h=i;h<=5;h++){
//                System.out.print(" ");
//            }
//            for (int w=1;w<=5;w++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
////        lower degin
//    for (int i=1;i<=5;i++){
//        for (int k=i;k<=5;k++){
//            System.out.print(" ");
//        }
//        for (int j=1;j<=5;j++){
//            System.out.print("*");
//        }
//        for (int f=1;f<=i;f++){
//            System.out.print(" ");
//        }
//        for (int s=1;s<=i;s++){
//            System.out.print(" ");
//        }
//        for (int e=1;e<=5;e++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


//
//        for (int i=1;i<=10;i++){
//            for (int j=1;j<=i*2-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
        for (int i=1;i<=5;i++){
            for (int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=i*2-1;k<=9;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }


