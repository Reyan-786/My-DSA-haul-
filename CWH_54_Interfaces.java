interface bicycle{
    void ApplyBrake(int decrement);
    void SpeedUp(int increment);
}
class AvonCycle implements bicycle{
        int speed=7; 
        public void ApplyBrake(int decrement){
            speed= speed -decrement;
            System.out.println("Your new spped is :"+speed);
        }
        public void SpeedUp(int increment){
            speed = speed + increment;
            System.out.println("Your new speed after speed up is :"+speed);
        }
}
public class CWH_54_Interfaces{
public static void main(String[] args) {
    AvonCycle c= new AvonCycle();
    c.ApplyBrake(5);
    c.SpeedUp(19);
    c.ApplyBrake(90);
}
    
}
