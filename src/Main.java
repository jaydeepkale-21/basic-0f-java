import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
//        while(a>0){
//            int rem=a%10;
//            sum=sum+rem;
//            a/=10;
//
//        }
//      if(temp%sum==0){
//          System.out.println("Harshad number");
//      }
//      else{
//          System.out.println("not hash");
//      }

//        ------> Pailndrome number <---------
        int rev=0;
        while(a>0){        //121>0     //12>0       //1>0           //0>0 false
            int rem=a%10;  //121%10=1  //12%10=2    //1%10=1
            rev=rev*10+rem;//0*10+1=1  //1*10+2=12  //12*10+1=121
            a/=10;         //121/10=12 //12/10=1    //1/10=0

        }
        if (temp==rev){ //121==121-true
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }}


