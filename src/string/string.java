package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class string {
    public static void main(String args[]) {
//        Repalce the charter form the string

//       char ch='k';
//       String strcopy="";
//       for (int i=0;i<str.length();i++){
//           if(str.charAt(i)=='a'){
//               strcopy=strcopy+ch;
//           }
//           else {
//               strcopy=strcopy+str.charAt(i);
//           }
//       }
//        System.out.println(strcopy);


//        replace char from string using array

//        char ch1[]=str.toCharArray();
//        for (int i=0;i<ch1.length;i++){
//            if(ch1[i]=='a'){
//                ch1[i]='j';
//            }
//        }
//        System.out.println(ch1);

//        check prsent or not'
//        String str="abcde";
//        char c='z';
//        int count=0;
//        for (int i=0;i<str.length();i++){
//            if(str.charAt(i)==c){
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println("charter not present");
//        }
//        else{
//            for(int i=0;i<str.length();i++){
//                if(str.charAt(i)=='a'){
//                    str=str+c;
//                }
//            }
//        }


//        another sting sort
//        String s1="dfggSDF";
//        for (char ch1='A';ch1<='Z';ch1++) {
//            for (char ch = 'a'; ch <= 'z'; ch++) {
//                for (int i = 0; i < s1.length(); i++) {
//                    if (ch1 == s1.charAt(i)) {
//                        System.out.print(ch1+" ");
//
//                    }
//                    if(ch==s1.charAt(i)){
//                        System.out.print(ch+" ");
//                    }
//                }
//            }
//        }
//
//        Predefine sorting
//        First logic

//        int cout = 0;
//        boolean bol = false;
//        if (s1.length() == s2.length()) {
//            for (int i = 0; i < s1.length(); i++) {
//                char ch = s1.charAt(i);
//                for (int j = 0; j < s2.length(); j++) {
//                    if (ch != s2.charAt(i)) {
//                        break;
//                    } else {
//                        bol = true;
//                    }
//                }
//            }
//
//        if (bol == true) {
//            System.out.println("anagram");
//        } else {
//            System.out.println("not anagram");
//        }
//    }
//        else {
//            System.out.println("not anagram");
//        }

//        sencond way
        String s1 = "Jaydeep";
        String s2 = "Jaydeep";
//        char ch1[]=s1.toCharArray();
//        char ch2[]=s2.toCharArray();
//        int cout=0;
//        for(int i=0;i<ch1.length;i++){
//           if(ch1[i]==ch2[i]){
//               cout++;
//           }
//        }
//        if(cout==s1.length()){
//            System.out.println("angram");
//        }
//        else {
//            System.out.println("not anagram");
//        }
//

//        3rd way
        if(s1.length()==s2.length()){
            char ch1[]=s1.toLowerCase().toCharArray();
            char ch2[]=s2.toLowerCase().toCharArray();
            if(Arrays.equals(ch1,ch2)){
                System.out.println("anagram");
            }

        }
        else{
            System.out.println("length is not same not anagram");
        }


    }

}
