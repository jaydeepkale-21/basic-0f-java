//package Oops_java;
//
//public class arrayassinment {
//    public static void  main(String args[]){
//        int a[]={6,7,8,9,10};
//        int b[]=new int[a.length];
//        int index=0;
//        for(int i=0;i<a.length;i++){  //i=1 i=2 i=3 i=4 i=5f
//            if(a[i]%2==0) {           //6%2==0t 7%2==0f 8%2==0t 9%2==0f 10%2==0t
//                b[index++] = a[i];
//                //index=0   value=6
//                //index=1   value=8
//                //index=2   value=10
//                //index=3
//            }
//        }
//        for(int i=0;i<a.length;i++){ //i=1 i=2 i=3 i=4 i=5f
//            if(a[i]%2!=0){          //6%2!=0f 7%2!=0t 8%2!=0f 9%2!=0t 10%2!=0f
//                b[index++]=a[i];
//                //index=3   value=7
//                //index=4   value=9
//            }
//    }
//        for (int i=0;i<b.length;i++){
//            System.out.print(b[i]+ " ");
//        }
//}
//}
