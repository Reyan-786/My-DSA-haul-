//  abstract class Pen{
//     abstract void write();
//     abstract void refill();

// }
// class GelPen extends Pen{
//     void write(){
//         System.out.println("writtting.");
//     }
//     void refill(){
//         System.out.println("refilling..");
//     }
//     void changeNib(){
//         System.out.println("Changing Nib");
//     }
// }

class monkey{
    void Bite(){
        System.out.println("Biting");
    }
    void Jump(){
        System.out.println("Jumping");
    }


}
interface BasicAnimal{
   public void Eat();
    public void Sleep();
}
class Human extends monkey implements BasicAnimal{
public void Eat(){
    System.out.println("EAT");
}
public void Sleep(){
    System.out.println("SLEEPING");
}
}
public class CWH_60_Practice_Set_abstract{
    public static void main(String[] args) {
        Human h= new Human();
        h.Eat();
        h.Sleep();
        h.Bite();
        
    }
}