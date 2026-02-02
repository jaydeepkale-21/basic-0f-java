package dec_batch;
class person2{
    private String name;
    private int age;
    public void set_name(String name){
        this.name=name;
    }
    public void get_name(){
        System.out.println("person name is :"+name);
    }
    public void set_age(int age){
        this.age=age;
    }
    public int get_age(){
//        System.out.println("person age is :"+age);
        return age;
    }

}
public class encapulation_oops {
    public static void main(String args[]){
    person2 p=new person2();
    p.set_name("Jaydeep");
    p.get_name();
    p.set_age(18);
    System.out.println("person age is :"+p.get_age());
    }
}
