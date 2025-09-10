import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number to check prime or not:");
//        a = sc.nextInt();
//        int count = 0;
//        int number = 0;
//    for (int i=1;i<=a;i++){
//        if (a%i==0){
//            count++;
//            number=i;
//        }
//    }
//    if(count==2){
//        System.out.println("this is prime number"+number);
//    }
//    else {
//        System.out.println("this not prime");
//    }
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2){
              sum+=i;
            }
        }
        System.out.println("sum is:"+sum);


//        Printing 1 TO 100 prime number
//        for (int i = 1; i <= 100; i++) {
//            int count=0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.println("prime number are:"+i);
//            }
//        }
    }
        }

