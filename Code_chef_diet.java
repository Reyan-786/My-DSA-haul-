//VeryGood question********
import java.util.*;
public class Code_chef_diet {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int T=sc.nextInt();

        while(T-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] A= new int [n];
    for (int j=0;j<n;j++){
        A[j]=sc.nextInt();
    }            
            int c=0;
            int x=0;
            for (int i=0;i<n;i++){
                if (A[i]+c<k){
                    x=i+1;
                    break;
                }
                else if (A[i]>k){
                    c+=A[i]-k;
                }
                else if (A[i]<k){
                    c-=k-A[i];
                }
            }
            if (x==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO "+x);
            }
        }
           }

            
        
        }
        
    


    

