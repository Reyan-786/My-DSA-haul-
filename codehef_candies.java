import java.util.Scanner;
public class codehef_candies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt ();
        int l;
        int b;
        int tl=0;
        int tb=0;
        int count=0;
        for  (int i=0;i<T;i++){
            l=sc.nextInt();
            b=sc.nextInt();
            while(tl<l&&tb<b){
                count++;
                tl+=count;
                count++;
                tb+=count;

            }
            if (tl>l && tb>b){
                System.out.println("BOB");
            }
            else if (tl>l){
                System.out.println("BOB");
            }
            else {
                System.out.println("LIMAK");
            }
        }
                
            
            
            

                
        

        
        

    }
}
