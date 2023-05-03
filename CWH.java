import java.util.*;
import java.lang.*;
// import collections.;

public class CWH{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       float income = sc.nextFloat();
       if (income<2.5){
           System.out.println("no income tax");
       }
       else if (income>=2.5 && income<5.0){
           float incometax1 = 0.05f * (income);
           System.out.println("income tax = " + incometax1);

       }
       else if (income>=5.0 && income<10.0){
           float incometax2=0.2f * (income);
           System.out.println("income tax ="+ incometax2 );

       }
       else if (income >10.0){
           float incometax3=0.3f * (income);
           System.out.println("income tax = "+incometax3); 
       }
        
}

}