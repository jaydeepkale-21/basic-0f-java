package Array;

import java.util.Arrays;

public class feb19_str {
    public static void anagramMY_metho(String str1,String str2){
        int count=0;
        if(str1.length()==str2.length()){
            for (int i=0;i<str1.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                    }
                }
            }
            if(count==str1.length()){
                System.out.println("anagram");
            }
            else{
                System.out.println("not angram");
            }
        }
        else{
            System.out.println("not anagram");
        }
    }

//    check Anagaram
    public static void anagram(String str1,String str2){
        if(str1.length()==str2.length()){
            char arr1[]=str1.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            char arr2[]=str2.toLowerCase().toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
    }
//    Remove dupllicate -> print element last one original
    public static void remove_dup1(String str1){
        for(int i=0;i<str1.length();i++){
            int count=0;
            for (int j=i+1;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println("original: "+str1.charAt(i)+" "+i);
            }
        }
    }

//    Remove duplicate -> print element start one original
    public static void remove_dup2(String str1){
        for (int i=0;i<str1.length();i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
            if(count==0){

                for (int k=0;k<str1.length();k++){
                    if(str1.charAt(i)==str1.charAt(k)){
                        count++;
                    }
                }
                System.out.println(str1.charAt(i)+" "+count);
//                System.out.println("Orignal: "+str1.charAt(i)+" "+i);
            }
        }
    }

//    feq of element
    public static void feq(String str1){
        int ch[]=new int[26];
        for(int i=0;i<str1.length();i++){
            ch[str1.charAt(i)-'a']++;
        }
        for (int i=0;i<ch.length;i++){
            if(ch[i]>0) {
                System.out.println("element and feq: " +(char)(i + 'a') + " " + ch[i]);
            }
        }
    }
    public static void main(String args[]) {
        String str1 = "aabbcac";
        String str2 = "Acb";
//        anagram(str1, str2);
        remove_dup2(str1);

    }
}
