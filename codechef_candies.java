import java.util.Scanner;
public class codehef_candies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int totallimak=1;
            int totalbob=2;
            while(A!=totallimak || B!=totalbob){
                totallimak+=2;
                totalbob+=2;
                if(totalbob==B){
                    System.out.println("LIMAK WINS");
                }
                else {
                    System.out.println("BOB WINS");
                }
            }

                
            
            
            

                

            
            
            

        }
        

    }
}
