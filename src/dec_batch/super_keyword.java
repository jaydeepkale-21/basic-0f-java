package dec_batch;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

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
//Super function
class s1{
    void show(){
        System.out.println("parent show");
    }
}
class a1 extends s1{
    void show(){
        super.show();
        System.out.println("child show");
    }
}

//Paramerized constructor
class c1{
    c1(){
        System.out.println("parent constructor");
    }
//    paramerized constructor
    c1(int a){
        System.out.println("parent constrictor :"+a);
    }
}
class c2 extends c1{
    c2(){
        super(2);
        System.out.println("child constructor");
    }
}
public class super_keyword {
    public static void main(String args[]){
        c2 p1=new c2();

    }
}
