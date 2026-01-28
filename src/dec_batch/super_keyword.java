package dec_batch;
//Super keyword use in variable
class student{
    String name="jaydeep";
}
class person1 extends student{
    String name="kale";
    void show(){
        System.out.println(name);
        System.out.println(super.name);// super_keyword -> it referce to parent variable value
    }
}
public class super_keyword {
    public static void main(String args[]){
        person1 p1=new person1();
        p1.show();
    }
}
