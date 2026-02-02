package dec_batch;
interface demo9{ //interface object not create
//    use method+body
//    default void zzz(){
//        System.out.println("show");
//    }
////    By private keyword
//    private void get(){
//        System.out.println("get");
//    }
////    By use static keyword
//    static void display(){
//        System.out.println("display");

    }

//    java 9 updated feature we can create object of interface..
@FunctionalInterface
interface display{
    void show();
}

public class abstration_feb2 {
    public static void main(String args[]){
        display d=new display() {
            //    static void display(){
            //        System.out.println("display");
            @Override
            public void show() {
                System.out.println("show");
            }
        };
      d.show();

    }
}
