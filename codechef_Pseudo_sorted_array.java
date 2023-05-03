import java.util.Scanner;
public class codechef_Pseudo_sorted_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int [] arr= new int[N];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int temp=0;
            int count=0;
            for(int k=0;k<N;k++){
                if(arr[k]>arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                    break;
                }
            }
            for(int m=1;m<N;m++){
                if (arr[m-1]>arr[m]){
                    count++;
                }
               
            }
            if(count>0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

            }
            
        }
    }

