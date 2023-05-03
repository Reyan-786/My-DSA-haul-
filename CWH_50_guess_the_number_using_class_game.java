import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int numberofguesses;
    // public int getnumberofguesses(){
    //     return numberofguesses;
    // }
    // public void  setnumberofguesses(int numberofguesses){
    //     this.numberofguesses=numberofguesses;
    // }

    // constructor for the game class
    public game(){
        Random random = new Random();
        this.number=random.nextInt(0,100);

    }
    //method to take input from user
    public void takeuserinput(){
        System.out.println("Guess The Number:");
        Scanner sc=new Scanner(System.in);
        inputnumber = sc.nextInt();
        
    }
    // method to  check the inputted number by the user against the generated number by the computer .
    public boolean isCorrect(){
        numberofguesses++;
        if (inputnumber == number){
            System.out.format("you guesses it right ,the number was %d and your score is :%d",number,numberofguesses);
            return true;
            

        }
        else if (inputnumber<number){
            System.out.println("too low...");
        }
        else if (inputnumber>number){
            System.out.println("too high...");
        }
        return false;
} 

}
public class CWH_50_guess_the_number_using_class_game {
 public static void main(String[] args) {
     game g= new game();
    
     boolean b=false ;
     while(!b){
        g.takeuserinput();
        b = g.isCorrect();
        
       
    }

 }   
}
