import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //sum of number 1 To 10
//        int sum=0;
//    for (int i=1;i<=10;i++){
//      sum+=i;
//    }
//        System.out.println("sum of 1 to 100 is:" + sum);

//        factorical of number
//        int num;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any to find factorical:");
//        num=sc.nextInt();
//        int fact=1;
//        for (int i=1;i<=num;i++){
//            fact*=i;
//            //fact=fact*i;
////            1*1=1
////            1*2=2
////            2*3=6
////            6*4=24
////            24*5=120
//
//        }
//        System.out.println("factorical value is:"+ fact);

//        odd even addtion
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        num=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        for (int i=1;i<=num;i++){
            if (i%2==0){
                even_sum+=i;
            }
            else {
                odd_sum+=i;
            }
        }
        System.out.println("sum of even number:"+even_sum);
        System.out.println("sum od odd number:"+odd_sum);


    }
    }