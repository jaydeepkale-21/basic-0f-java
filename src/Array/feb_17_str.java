package Array;

public class feb_17_str {
    public static void check_string(String str1, String str2) {
        System.out.println(str1.hashCode());                // -> hashcode
        System.out.println(System.identityHashCode(str1));  // -> base memory address
        System.out.println();

        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str2));
        System.out.println();

//        == -> it check the base address as well as content
        if (str1 == str2) {
            System.out.println("check with == sign");
        } else if (str1.equals(str2)) {
            System.out.println("check with equal: ");
        } else {
            System.out.println("not equal" +
                    "");
        }
    }
        public static void str_conversion () {
//        Coversion of char array to string
            char ch[] = {'j', 'a', 'y', 'd', 'e', 'e', 'p'};
            String str = new String(ch);
            System.out.println(str);

//            Conversion of string to char array
            String str1="jaydeep";
            char ch1[]=new char[str1.length()];
            for (int i=0;i<ch.length;i++){
                ch1[i]=str1.charAt(i);
            }
            for (int i=0;i<ch.length;i++){
                System.out.println(ch1[i]);
            }

//            .tochararray -> string to char array
            String s="hello";
            char ch2[]=s.toCharArray();
            System.out.println(ch2);
        }

        public static void printChar_dubble(){
        String str="Jaydeep";
        String str1="";
        for (int i=0;i<str.length();i++){
            str1+=str.charAt(i)+""+str.charAt(i);
            System.out.println(str1);
        }

        }

    public static void main(String args[]){
        String str1="Jaydeep";
        String str2=new String("Jaydeep");
//        check_string(str1,str2);
//        str_conversion();
        printChar_dubble();
    }
}
