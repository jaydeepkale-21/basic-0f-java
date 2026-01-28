package dec_batch;
//Private access modifer possible in only same class.
class base{
    protected int x;
    base(int x){
        this.x=x;
    }
    void display(){
        System.out.println(x);
    }
}
//not acces on sub class
class JD extends base{
    JD(int x){
        super(x);
    }
    void show(){
        System.out.println(x);
    }
}

//another example in peotected
class o{
    protected int x=27;
}
class oo extends o{
    void display(){
        System.out.println(x);
    }
}
public class Access_modifer {
    public static void main(String args[]){
//        base b1=new base(4);
//        b1.display();
//        JD a=new JD(10);
//        a.show();

        oo o1=new oo();
        o1.display();
    }
}
