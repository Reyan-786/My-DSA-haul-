import java.util.Scanner;
public class codechef_friends_meetup {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            
            int i=1;
            int j=2;
            while (true){
                if(x1==x2)
            {
                System.out.println("YES");
                break;
                
            }
            else if (x2>x1){
                System.out.println("NO");
                break;
            }
                x1+=i;
                x2+=j;
                if(x1==x2){
                    System.out.println("YES");
                    // System.out.println(x1);
                    // System.out.println(x2);
                    break;
                }
                else{
                    continue;

                }
            }
            }
            
        }
    }

