import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class codechef_election_in_chefland {
 public static void main(String[] args) {
     Scanner sc=  new Scanner (System.in);
     int T=sc.nextInt();
     while (T-->0){
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if (A+B+C==101){
            if (A>=50){
                System.out.println("A");
            }
            else if (B>=50){
                System.out.println("B");
            }
            else if (C>=50){
                System.out.println("C");
            }
    
        }
        else{
            break;
        }
     }
 }   
}
