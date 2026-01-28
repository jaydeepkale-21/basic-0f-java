//package dec_batch;
//class person{
////    method overloding --> Same class multiple method with same name but differnt parameter
//    void get(int a){
//        System.out.println("First get :"+a);
//    }
//    void get(){
//        System.out.println("second get");
//    }
//}
//class student extends person{
////    method overring -->Differnt class same method name also same parameter
//    void get(){
//        System.out.println("child get");
//    }
//}
//
////Aggregation Has-a relationship
//class a{
//    void a(){
//        System.out.println("parent class");
//    }
//}
//
//class  b{
//    a a1=new a();
//    void b(){
//        System.out.println("child class 1");
//    }
//}
//class c{
//    b b1=new b();
//    void c(){
//        System.out.println("child class 2");
//    }
//}
//public class jan_27 {
//    public static void main(String args[]){
//     c c1=new c();
//     c1.c();
//     c1.b1.b();
//     c1.b1.a1.a();
//
//    }
//}
