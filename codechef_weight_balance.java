import java.util.*;
public class codechef_weight_balance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int M=sc.nextInt();
            int increment =w2-w1;
            int minincrease=x1*M;
            int maxincrease=x2*M;
            if (increment>=minincrease && increment<=maxincrease){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }

        }        
    }
}
