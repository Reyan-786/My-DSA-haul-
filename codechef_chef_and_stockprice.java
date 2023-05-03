import java.util.*;
public class codechef_chef_and_stockprice {
public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int T=sc.nextInt();
    while(T-->0){
        int s=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int l=(s*c)/100;
        int buyprice=s+l;
        if (buyprice>=a && buyprice<=b){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}    
}
