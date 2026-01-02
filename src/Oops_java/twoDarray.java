package Oops_java;

import java.util.Scanner;

public class twoDarray {
    public static void main(String agrs[])
    {
//        int sum=0;
//        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int k=0;
//        for(int i=0;i<c[k].length;i++){
//            k++;
//            for(int j=0;j<c.length;j++){
//                sum+=c[i][j];
//                System.out.print(sum+" ");
//            }
//
//            System.out.println();
//


//Two array sum store in thrird array store
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter which opertion to perform: ");
//        String op=sc.next();
//        int a1[][]={{1,2,3},{5,6,7}};
//        int a2[][]={{1,2,3},{5,6,7}};
//        int a3[][]=new int[2][3];
//        for(int i=0;i<a1.length;i++){
//            for (int j=0;j<a1[i].length;j++){
//                switch (op){
//                    case "+":
//                        a3[i][j]=a1[i][j]+a2[i][j];
//                        break;
//                    case "-":
//                        a3[i][j]=a1[i][j]-a2[i][j];
//                        break;
//                    case "*":
//                        a3[i][j]=a1[i][j]*a2[i][j];
//                        break;
//                    case "/":
//                        a3[i][j]=a1[i][j]/a2[i][j];
//                        break;
//                    default:
//                        System.out.println("no valid");
//                }
//
//            }
//        }
//        for (int i=0;i<a3.length;i++){
//            for(int j=0;j<a3[i].length;j++){
//                System.out.print(a3[i][j]+" ");
//            }
//            System.out.println();
//        }


////column wise addtio perform
//        int c[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int j = 0; j < c[0].length; j++) {   // outer loop for columns
//            int sum = 0;
//            for (int i = 0; i < c.length; i++) {  // inner loop for rows
//                sum += c[i][j];
////                System.out.print(c[i][j] + " ");
//            }
//            System.out.println( sum);
//        }


//        Minimum number find in 2D array
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int min=arr[0][0];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(arr[i][j]<min) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Minimum number is: "+min);

//To printing Digonal element
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
//        Brute fore approch
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++) {
//                if(i==j){
//                    System.out.println("digonal element is: "+arr[i][j]);
//                }
//            }
//        }

//        Effective way
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i][i]);
//        }
    }

}
