class A{
public void meth1(){
System.out.println(" i am a method of class A.");
}

}
class B extends A{
    @Override
    public void meth1(){
        System.out.println(" i am a method of class B.");
    }
}

public class CWH_47_method_overriding {
    public static void main(String[] args) {
        B b= new B();
        b.meth1();
        A a = new A();
        a.meth1();
    }
}
