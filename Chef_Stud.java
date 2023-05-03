import java.util.*;
import java.lang.*;
public class Chef_Stud {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0){
        // int n=sc.nextInt();
        String s=sc.next();
        int count =0;
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)=='<' && s.charAt(i+1)=='>'){
                count ++;
            }

        }
        System.out.println(count);
        
    }
}    
}
