package Array;

public class feb_14_String {
    public static void main(String args[]){
        String str="jay  deep  ";
//        uppercase
//        System.out.println(str.toUpperCase());
////        lower case
//        System.out.println(str.toLowerCase());
////        trim->remove staring and ending space
//        System.out.println(str.trim());
////        charAt->print each char at index
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }

//        lastindexof --> they return last index of charter
//        System.out.println(str.lastIndexOf("e"));
//
////        endWith -> they check at last charte ,rreturn true and false
//        System.out.println(str.endsWith("p")); //-> true

//        System.out.println(str.replace('j','s'));
        System.out.println(str.replaceAll(" ","k"));

    }
}
