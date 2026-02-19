package Array;

import java.util.Stack;

public class feb17_strClass {
    public static void str_builder()
    {
        StringBuilder name=new StringBuilder("jaydeep");
//        .append  -> add value at the end of string
        name=name.append(" kale");

//        .reverse -> Reverse the string
//        name=name.reverse();

//        .insert(old,new); -> Add value at deseried position
        name=name.insert(7," xyz");

//        /replace(start,end,new) ->
        name=name.replace(0,7,"abc");

//        .delete(start,end) -> delete the value form start to end
        name.delete(0,4);

//        .deleteCharAt(position);
        name.deleteCharAt(1);

//        .capacity ->how many characters it can store before resizing
        System.out.println(name.capacity());

//
        System.out.println(name);
    }    public static void main(String args[]){
        str_builder();
    }
}
