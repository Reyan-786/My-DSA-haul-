class base{
    
    public base(){
        System.out.println(" i am a constructor!");
    }
    public base(int x){
        System.out.println(" i am an overloaded  constuctor with  the value of x as :"+x);
    }


    
}
class derived1 extends base{
    public derived1(){
        // super(100);
        System.out.println("I M A DERIVED CLASS CONST");
    }
    public derived1(int x, int y){
        super(x);
        System.out.println(" i am an overloaded constructor with the value of y as  :  "+y);
    }
}
public class CWH_46_constructor_in_inheritance {
    public static void main(String[] args) {
        derived1 d= new derived1(14,9);

    }
}
