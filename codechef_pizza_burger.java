import java.util.*;
public class codechef_pizza_burger {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int t=sc.nextInt();
    while(t-->0){
        int money=sc.nextInt();
        int pizzaprice=sc.nextInt ();
        int burgerprice=sc.nextInt();
        if (money>=pizzaprice){
            System.out.println("PIZZA");
        }
        else if (money<=pizzaprice && money>=burgerprice){
            System.out.println("BURGER");
        }
        else if (money<pizzaprice && money<burgerprice){
            System.out.println("NOTHING");
        }
    }
}    
}
