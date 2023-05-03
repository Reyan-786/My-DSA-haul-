import java.lang.reflect.Array;
import java.util.*;

public class prime_numbers {
    public static void main(String[] args) {
        int n=24;
        int count;
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
             if (i % j == 0) {
              count++;
              break;
             }
            }
         
            if (count == 0) {
             prime.add(i);
            }
         
           }
           for(int i=0;i<prime.size();i++){

               System.out.print(prime.get(i)+" ");
           }
           




          }
          
         
       
        
        
       
    
}
