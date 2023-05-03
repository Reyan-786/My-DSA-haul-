import java.util.*;

public class Tanu_and_head_bob {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int T=sc.nextInt();
    while (T-->0){
        int n=sc.nextInt();
        String gesture = new String();
        int countI=0;
        int countY=0;
        int countN=0;

        gesture=sc.next();
        for(int i=0;i<n;i++){
            if (gesture.charAt(i)=='I'){
                countI++;
            }
            else if (gesture.charAt(i)=='Y'){
                countY++;
            }
            else if (gesture.charAt(i)=='N'){
                countN++;
            }
            

    }
    if (countI>0){
        System.out.println("INDIAN");
    }
    else if (countN>0 && countY>0 && countI==0){
        System.out.println("NOT INDIAN");
    }
    else if (countN==n){
        System.out.println("NOT SURE");
    }
    else if (countY==n){
        System.out.println("NOT INDIAN");
    }
   
}
}
}