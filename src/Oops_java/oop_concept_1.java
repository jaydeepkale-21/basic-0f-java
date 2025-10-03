package Oops_java;

import java.util.Scanner;
//class Static_overrding{
//    static void get(int a){
//        System.out.println("outer: "+a);
//    }
//    static void get(float b){
//        System.out.println("outer: "+b);
//    }
//    static void get(String name){
//        System.out.println("outer: "+name);
//    }
//}


//Convertion Local to Goble
//class outer{
//    int g;
//    String j;
//    void get(int n,String name){
//        g=n;
//        j=name;
//    }
//    void set(){
//        System.out.println(j+" "+g);
//    }
//}


//Return datatype
class return_type {
    int set(int a) {
        return a;
    }

    float set1(float a) {
        return a;
    }

    String set2(String a) {
        return a;
    }

    byte set3(byte a) {
        return (byte)a;
    }

    char set4(char ch) {
        return ch;
    }

    short set8(int a) {
        return (short)a;
    }

    long set5(long a) {
        return a;
    }

    double set6(double a) {
        return a;
    }

    boolean set7(boolean a) {
        return a;
    }
}
public class oop_concept_1 {
    public static void main(String[] args){
    return_type t1=new return_type();
    System.out.println("Int: "+t1.set(10));
        System.out.println("float: "+t1.set1(10.2f));
        System.out.println("String: "+t1.set2("String"));
//        System.out.println("byte: "+t1.set3(10));
        System.out.println("char: "+t1.set4('J'));
        System.out.println( "long: "+t1.set5(10));
        System.out.println( "short: "+t1.set8(11));
        System.out.println("double: "+t1.set6(20.55555555555555));
        System.out.println("boolen: "+t1.set7(true));



    }
}


