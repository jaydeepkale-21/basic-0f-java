//package dec_batch;
//
////single inheritance
////class a{
////    void a(){
////        System.out.println("single_inherit_parant");
////    }
////}
////class b extends a{
////    void b(){
////        System.out.println("single_inherit_child");
////    }
////}
////
//////Multilevel inheritance
////class a1{
////    void a1(){
////        System.out.println("multi_inhert_parant");
////    }
////}
////class b1 extends a1{
////    void b1(){
////        System.out.println("multi_inhert_child");
////    }
////}
////class c1 extends b1{
////    void c1(){
////        System.out.println("multi_inhert_child");
////    }
////}
////
//////Hierchical
////class a2{
////    void a2(){
////        System.out.println("Hierchical_parant");
////    }
////}
////class b2 extends a2{
////    void b2(){
////        System.out.println("Hierchical_child");
////    }
////}
////class c2 extends a2{
////    void c2(){
////        System.out.println("Hierchical_child");
////    }
////}
//
////    multiple inheritance-> not possiable in inheritance but possiabl in interface
////    class a{
////        void a(){
////            System.out.println("parant_a");
////        }
////}
////class b{
////        void b(){
////            System.out.println("parant_b");
////        }
////}
////class c extends a extends b{    //-> It show error
////        void c(){
////            System.out.println("child_c");
////        }
////}
//
////    Hybrid inhertance--> Combimation of two inheritance
////                      --> single + hierarchical inheritance
////    class a{
////        void get(){
////            System.out.println("get");
////        }
////}
////    class b extends a{
////        void get1(){
////            System.out.println("get1");
////        }
////    }
////    class c extends b{
////        void get2(){
////            System.out.println("get2");
////        }
////    }
////    class d extends b{
////        void get3(){
////            System.out.println("get3");
////        }
////    }
//
////    hybrid -> hierarchical + multilevel
//class a{
//    void get(){
//        System.out.println("get");
//    }
//}
//class b extends a{
//    void get1(){
//        System.out.println("get1");
//    }
//}
//class z extends b{
//    void show(){
//        System.out.println("show");
//    }
//}
//class c extends z{
//    void get2(){
//        System.out.println("get2");
//    }
//}
//class d extends z{
//    void get3(){
//        System.out.println("get3");
//    }
//}
//public class inheritance {
//    public static void main(String args[]){
////        single inheritance
////        b b1=new b();
////        b1.b();
////        b1.a();
////
//////        multilevel
////        c1 c2=new c1();
////        c2.c1();
////        c2.b1();
////        c2.a1();
////
//////        hierarchical
////        b2 b3=new b2();
////        b3.a2();;
////        b3.b2();
////
////        c2 c3=new c2();
////        c3.c2();
////        c3.a2();
////        multiple inhertance
////        c c1=new c();
////        c1.b();
////        c1.a();
//
//////        Hybrid -> single + hierarchical
////        c c1=new c();
////        c1.get();;
////        c1.get1();
////        c1.get2();
////
////        d d1=new d();
////        d1.get();
////        d1.get1();
////        d1.get3();
//        //        Hybrid -> multievel+  hierarchical
//        c c1=new c();
//        c1.get();;
//        c1.get1();
//        c1.show();
//        c1.get2();
//
//        d d1=new d();
//        d1.get();
//        d1.get1();
//        d1.show();
//        d1.get3();
//    }
//
//}
