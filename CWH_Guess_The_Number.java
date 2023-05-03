import java.util.*;
import java.util.Random;

public class CWH_Guess_The_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();
        int c= random.nextInt(0,100);
        int count=0;
        while(true){
            System.out.println("guess the number");

            int d=sc.nextInt();

            if(c==d){
                System.out.println("you guessed the number correctly");
                break;
            }
            else if(d>c){
                System.out.println("oops,you guessed a wrong number!,guess a smaller number");
                count++;

            }
            else if (d<c){
                System.out.println("oops,you guessed a wrong number!,guess a bigger number");
                count++;
            }
        
        }
        System.out.println("computer guessed the number as :"+c);
        System.out.println("Your Score is :"+count);
            
    }
}
