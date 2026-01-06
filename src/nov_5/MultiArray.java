//package nov_5;
//
//import java.util.Scanner;
//
//public class MultiArray {
//    public static void Addtion_3D(int a[][][],int b[][][],int result[][][]{
//        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i][j].length; k++) {
//                    System.out.print("First array value: ");
//                    a[i][j][k]=sc.nextInt();
//                    System.out.println("Enter second array element: ");
//                    b[i][j][k]=sc.nextInt();
//
//                }
//            }
//        }
//
//        System.out.println("Enter the array element: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i][j].length; k++) {
//                    result[i][j][k]=a[i][j][k]+b[i][j][k];
//                }
//            }
//        }
//
////    Print the array
//        System.out.println("Print the array element");
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                for (int k = 0; k < result[i][j].length; k++) {
//                    System.out.print(result[i][j][k]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//    }
//    public static void odd_Even(int[][][] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i][j].length; k++) {
//                    if (a[i][j][k] % 2 == 0) {
//                        System.out.println("Even number: " + a[i][j][k]);
//                    }
//                }
//            }
//        }
//    }
//
//
//
//
//
//    public static void main(String args[]){
//
//        int a[][][]={
//                {
//                        {1,2,3},
//                        {4,5,6}
//                },
//                {
//                        {7,8,9},
//                        {1,2,3}
//                }
//        };
////        int b[][][]=new int[2][2][2];
////        int result[][][]=new int[2][2][2];
////        Addtion_3D(a,b,result);
//        odd_Even(a);
//
//}
//}
//
