import java.util.*;
public class airline_restriction {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int T=sc.nextInt();
    for (int i=0;i<T;i++){
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();
        if (A+B<D || A+C<D || B+C<D){
            if (B<E || C<E || A<E){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // else {
        //     System.out.println("NO");
        // }

    }
}    
}
