import java.util.*;
public class codechef_buying_tablets {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        while (t-->0){
            int N=sc.nextInt();
            int B=sc.nextInt();
            int [] width=new int[N];
            int [] height=new int[N];
            int [] price=new int[N];

            for (int i=0;i<N;i++){
                width[i]=sc.nextInt();
                height[i]=sc.nextInt();
                price[i]=sc.nextInt();
            }
            int Areaoftablet[]= new int[N];
            for (int i=0;i<N;i++){
                if(price[i]<=B){
                    Areaoftablet[i]=width[i]*height[i];

                }
                else{

                }
            }
            for (int i=0;i<N-1;i++){
                if (Areaoftablet[i]>Areaoftablet[i+1]){
                    int temp=Areaoftablet[i];
                    Areaoftablet[i]=Areaoftablet[i+1];
                    Areaoftablet[i+1]=temp;

                }
                
            }
            int count=0;
            for (int i=0;i<N;i++){
                if (price[i]>B){
                    count++;
                }
                
            }
            if(count==N){
                System.out.println("no tablet");
            }
            else {
                System.out.println(Areaoftablet[N-1]);
            }

        }
    }
}
