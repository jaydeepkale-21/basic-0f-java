import java.lang.String;
public class string {
    public static void string_to_char(String str) {
//        char ch[] = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//            System.out.println(ch[i]);
//        }
        //        predefine method
        char ch[]=str.toCharArray();
        System.out.println(ch);
    }
    public static void char_to_str(char ch[]) {
        String a=new String(ch);
        System.out.println(a);

    }
    public static void main(String agrs[]){
//
        String str="Hello";
        string_to_char(str);
//        char ch[]={'h','e','l','l','o'};
//        char_to_str(ch);
    }
}
