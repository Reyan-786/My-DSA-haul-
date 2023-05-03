import java.util.*;
public class String_Protocol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            String str= sc.nextLine();
            int count=0;
            for(int i=0;i<N;){
                if (i<N-1 && str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i+=2;

                   }
                   else {
                       count ++;
                       i+=1;
                   }
            }
 System.out.println(count);
        }
    }
}
