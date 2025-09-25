package Oops_java;

import java.util.Scanner;

public class oop_concept_1 {
    public static void main(String[] args){
        demo t1=new demo();
        t1.get();
        t1.get(42);
        t1.get(34f);

    }
}
//class demo{
//    void num(float n){
//        System.out.println(n);
//    }
//    void name(int age,String name){
//        System.out.println(age+" "+name);
//    }
//    void num1(double i,int j){
//        System.out.println(i+" "+j);
//    }
//}
//class test1 {
//    void get(int age, String name) {
//        System.out.println(name+" age is: "+age);
//    }
//    void set(){
//        System.out.println("Hello");
//    }
//}
class demo{
    void get(){
        System.out.println("Get");
    }
    void get(int a){
        System.out.println("int");
    }
    void get(float b){
        System.out.println("float");
    }
}

