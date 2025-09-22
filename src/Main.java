import java.util.*;

public class Main {
    public static void main(String[] args) {

// int j=1;
// do {
//     System.out.println(j);
//     i++;
// }while (j<=10);

//        10 to 1
//        int k=10;
//        do {
//            System.out.println(k);
//            k--;
//        }while (k>=1);


//        printing table 5
//        Scanner sc=new Scanner(System.in);
//        int i=1;
//        System.out.println("Enter a number to give it's table:");
//        int num=sc.nextInt();
//        do {
//            System.out.println(i+" * 5: "+(i*num));
//            i++;
//        }while (i<=10);



//        switch and do while
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//        int ch;
//        do {
//            System.out.println("1.Even_odd, 2Positive_negative, 3.exit");
//            System.out.println("Enter your choose:");
//            ch = sc.nextInt();
//            switch(ch) {
//                case 1:
//                    if (num % 2 == 0) {
//                        System.out.println("Even number");
//                    } else {
//                        System.out.println("odd number");
//                    }
//                    break;
//                case 2:
//                    if (num > 0) {
//                        System.out.println("number is positive");
//                    } else if (num < 0) {
//                        System.out.println("number is negative");
//                    } else {
//                        System.out.println("number is zero");
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("Exit");
//                    break;
//                default:
//                    System.out.println("Invalid");
//            }
//        }
//            while(ch!=3);

        for (int i=65;i<=69;i++){
            for (int j=i;j<=69;j++){
                System.out.print(" ");
            }
            for (int k=65;k<=i;k++){
                if(i==65 || k==i) {
                    System.out.print((char)65);
                }
                else {
                    System.out.print((char)k+" ");
                }
            }
            System.out.println();
        }

    }
}


