package Array;

public class feb_14_str {
    public static void string_function(){
        String name="jaydeep";
        char ch[]=new char[name.length()];
        for(int i=0;i<ch.length;i++){
            ch[i]=name.charAt(i);
            System.out.println("Elemet char arr: "+ch[i]);
        }
    }

    public static void check_count(String str){

        for(int i=0;i<str.length();i++){
            boolean bol=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    bol=true;
                    break;
                }
            }
            if(bol) continue;
            int count=0;
            for(int k=0;k<str.length();k++){
                if(str.charAt(i)==str.charAt(k)){
                    count++;
                }
            }

            System.out.println(" Elemet occure: "+str.charAt(i)+" "+count);
        }
    }
    public static void check_count1(String str){
        int feq[]=new int[26];
        for(int i=0;i<str.length();i++){
            feq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(feq[i]>0){
                System.out.println("Elemet occur " + (char)(i+'a') + " " + feq[i]);
            }
        }
    }
    public static void main(String args[]){
       String str="aaaaabbccdd";
       check_count(str);
    }
}
