package dec_batch;

class person{
    void add(int a){
        System.out.println("intger is: "+a);
    }
    void add(float a){
        System.out.println("float is: "+a);
    }
    void add(char ch){
        System.out.println("charecter is :"+ch);
    }
}
class bike{
    void run(){
        System.out.println("ruuning");
    }
}
class splender extends bike{
    void run(){
        System.out.println("running safely with 60 km");
    }
}
public class polymorphism {
    public static void main(String args[]){
      splender b=new splender();
      b.run();

    }
}
