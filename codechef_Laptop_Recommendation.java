// not solved first do hash map  completely.
import java.util.*;

import java.util.HashSet;
public class codechef_Laptop_Recommendation {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] recommend= new int [n];
            for (int i=0;i<n;i++){
                recommend[i]=sc.nextInt();
            }
            HashSet<Integer> recommendhash= new HashSet<>();
            for (int i=0;i<n;i++){
                recommendhash.add(recommend[i]);
            }
            // System.out.print(recommendhash);
            int [] count=  new int [recommendhash.size()];
            for (int item:recommendhash){

                for(int i=0;i<n;i++){
                int m=0;

                    if (item==recommend[i]){
                        m++;
                    }
                    else{
                        continue;
                    }
                    int k=0;
                    count[k]=m;
                    k++;
                }

            
                
            }
            for (int i=0;i<count.length;i++){
                System.out.println(count[i]);
            }
            

            }
        }
}
