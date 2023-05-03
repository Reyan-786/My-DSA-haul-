import java.util.Scanner;

public class CWH20_method {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =  sc.nextInt();
        // int [] fibarr= new int [100];
        int [] fibarr= new int [1000];
        fibarr[0]=0;
        fibarr[1]=1;
        for ( int i=2;i<n;i++){
            fibarr[i]=fibarr[i-1]+fibarr[i-2];




        }   
        for (int i=0;i<=n-1;i++){
            System.out.print("  " +fibarr[i]);





        }
    }
}
