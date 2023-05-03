import java.util.*;
public class commonprefix {
    public static String solution(String[] strs){
        if(strs.length==0|| strs==null){
            return "";
        }
        Arrays.sort(strs);
        System.out.println("array after sorting \n");
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        String smallest = strs [0];
        String largest = strs [strs.length-1];
        int c =0;
        while(c<smallest.length()){
            if(smallest.charAt(c)==largest.charAt(c)){
                c++;
            }
            else {
                break;
            }
        }

        return c==0? "empty ans" : smallest.substring(0,c);
        
    }
    public static void  main(String[] args) {
        String [] strs = {"flower","flight","fight","fike"};
        String ans = solution(strs );
        System.out.println("printing the answer \n");
        System.out.println(ans);
        
        
    }
}
