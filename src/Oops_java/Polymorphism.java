package Oops_java;

public class Polymorphism {
    public static void main(String args[]){
    person p1=new person();
    p1.person();
//    p1.person();
    }
}
//class human{
////    void person(int a){
////        System.out.println(a);
////    }
////    void person(float b){
////        System.out.println(b);
////    }
//    void person(int a){
//        System.out.println(a);
//}
//    float person(float b){ //same parameter but differnt return type --> it not possible
//       return b;
//    }
//}

//    Method Overrinding
//class person{
//        void person(){
//        System.out.println("parent class method");
//    }
//}
//class student extends person{
//    void person(){
//        super.person();
//        System.out.println("child class method");
//    }
//}

//Static overriding
    //Static have no need of object but overriding is possible throw Is-a relation than it is not possible.
class person{
    static void show(){
        System.out.println("parent method");
    }
}
class student extends person{
    static void show(){
        System.out.println("Child method");
    }
}
