class Phone{
    public void name(){
        System.out.println("my name is java!");
    }
}
class SmartPhone extends Phone{
    public void name(){
        System.out.println(" my name is java kotlin in class 2");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
    Phone o= new SmartPhone();
    o.name();
    }
}
