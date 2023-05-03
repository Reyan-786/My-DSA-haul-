import java.util.Scanner;

public class Candies_And_Bears {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int l;
        int b;
       
        while (t-->0){
            l=sc.nextInt();
            b=sc.nextInt();
            int tl=0;
            int tb=0;
            int li=1;
            int bo=2;
            int fl=0;
            int fb=0;
            while (true){
                tl+=li;
                tb+=bo;
                li+=2;
                bo+=2;
                if (tl>l){
                    fl=1;
                    break;
                }
                if (tb>b){
                    fb=1;
                    break;
                }

            }
            if (fl==1){
                System.out.println("Bob");
            }
            if (fb==1){
                System.out.println("Limak");
            }
            
        }
    }
    
}
