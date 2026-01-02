package Oops_java;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
//        int arr[]={1,4,5,7,8,2,10};
//        int min=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("Max element is: "+min);
//        Scanner sc= new Scanner(System.in);
//        int arr[]=new int[3];
//        System.out.println("Enter the element in arr :");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//           if(arr[i]%2==){
//               System.out.println();
//           }
//        }
//    }
//        int a[]={1,2,3,4,5,6};
//        int b[]=new int[a.length];
//        for(int i=0;i<a.length;i++){
//            b[i]=a[i];
//            System.out.println("Printing copy array: "+b[i]);
//        }
        int arr[][]={{1,2,3},{4,5,6},{5,6,7}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
