package nov_5;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {

//Col       1 2 3
//          | | |
//Row  1-> {1,2,3}
//Row  2-> {4,5,6}
//Row  3-> {7,8,9}
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the row size: ");
//        int row=sc.nextInt();
//        System.out.println("enter the col size: ");
//        int col=sc.nextInt();
//        int arr[][] = new int[row][col];
//        System.out.println("Enter the value: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//
//        System.out.println("Print the value: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//
//            }
//            System.out.println();



//        Addtion of Array
        int a[][]={{1,2},{3,4}};
        int b[][]={{5,6},{7,8}};
        int result[][]=new int[a.length][a[0].length];
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
//        Print the addtion
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}