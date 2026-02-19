package Array;

import java.util.Scanner;
class day_temp{
    Scanner sc=new Scanner(System.in);
    void day_temp(){
        System.out.println("Enter the day: ");
        String str[]=new String[7];
        int temp[][]=new int[7][2];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
            System.out.println("Enter day max temp: ");
           temp[i][0]=sc.nextInt();
            System.out.println("Enter day min temp: ");
            temp[i][1]=sc.nextInt();

            sc.nextLine();
        }
//
        for (int i=0;i<temp.length;i++){
            System.out.println(str[i]+" "+temp[i][0]+" "+temp[i][1]);
        }
    }
}
public class feb2_arraypro {
    public static void main(String args[]){

//        String floors[][]=new String[5][10];
//        int m=0;
//        String name[]=new String[50];
//        System.out.println("Enter customer count: ");
//        int count= sc.nextInt();
//        for (int i=0;i<=count;i++){
//            name[i]=sc.nextLine();
//            for(int k=0;k<floors.length;k++) {
//                for (int j = 0; j < floors[k].length; j++) {
//                    floors[i][j] = name[m];
//                    m++;
//                }
//            }
//        }
//        for(int k=0;k<floors.length;k++) {
//            for (int j = 0; j < floors[k].length; j++) {
//                System.out.println(floors[k][j]);
//            }
//        }

//        String floors[][]=new String[5][10];
//
//        System.out.println("Enter customer name: ");
//        String names=sc.nextLine();
//        System.out.println("Enter customer room no: ");
//        int room_no=sc.nextInt();
//        int floor=room_no/10;
//        int room=room_no%10;
//        floors[floor][room]=names;
//        System.out.println(floors[4][0]);
//
//        }
        day_temp d=new day_temp();
        d.day_temp();


    }
}
