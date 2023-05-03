import java.util.*;
public class codechef_where_it_all_began {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            if (n>6){
                System.out.println("YES");
            }
            else if (n<=6){
                System.out.println("NO");
            }
        }
    }
}
