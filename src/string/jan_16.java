package string;

public class jan_16 {
        //    Check panagram-> string conting all 26v alphabet
        public static void check_albhbet(String str) {
            int count = 0;
            for (int i = 'a'; i <= 'z'; i++) {
                if (str.indexOf(i) != -1) {
                    count++;
                }
            }
            if (count == 26) {
                System.out.println("panagram");
            } else {
                System.out.println("not");
            }
        }

//        remove duplicate
    public static void remove_duplicate(String str){
            int frq=0;
        int c=0;
            for (int i=0;i<str.length();i++){
                int count=0;
                for (int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(str.charAt(i)+" "+i);
                    frq++;
                    for(int k=0;k<str.length();k++){
                        if(str.charAt(k)==str.charAt(i)){
                            c++;
                        }
                    }
                    System.out.println(str.charAt(i)+":"+c);
                }

            }
//        System.out.println("original char frq :"+frq);
    }
    public static void main(String agrs[]) {
            String str = "aabb";
            remove_duplicate(str);
        }
}
