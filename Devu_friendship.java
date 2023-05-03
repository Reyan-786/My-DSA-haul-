import java.util.*;
public class Devu_friendship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            HashSet <Integer> set=new HashSet<>();// HashSet in java is an array to store all the unique elements of array.//
            for (int i=0;i<n;i++){
                set.add(sc.nextInt());
            }
            int count=0;
            for (Integer I:set){
                count++;
            }
System.out.println(count);
            
        } 
 }   
}
