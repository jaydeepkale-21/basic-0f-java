package string;

public class pangram {
    public static void panagram(String str){
        int count=0;
        for (char i='a';i<='z';i++){
            if(str.indexOf(i)!=-1){
                count++;
            }
        }
        if(count==26){
            System.out.println("panagram");
        }
        else {
            System.out.println("not panagram");
        }
    }
    public static void main(String args[]){
        String str="zzzzzzzzxcVbnmasdf848ghjklqwertyuiop";
        panagram(str.toLowerCase());
    }
}
