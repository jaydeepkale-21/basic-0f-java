import java.util.*;
public class Main {

//    Bineary to decimal convertion
//    public static void getdecimal(int n){
//        int i=0;
//        int decimal=0;
//        while(n>0){
//            int rev=n%10;
//            decimal+=rev*(int)Math.pow(2,i);
//            i++;
//            n/=10;
//        }
//        System.out.println("decimal is: "+decimal);
//
//    }

//    Decimal to Bineary convertion
    public static void getbinery(int n){
        String decimal="";
        while (n>0){
//            int q=n/2;
            int rem=n%2;
            decimal=decimal+rem;
            n=n/2;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        int n=2;
        getbinery(n);

    }}
