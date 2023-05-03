import java.util.Scanner;
public class codechef_heaven_to_earth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            double n=sc.nextInt();
            double v1=sc.nextInt();
            double v2=sc.nextInt();
		    double t1 = (Math.sqrt(2)*n)/v1;    // time taken by the stairs.
            double t2 = (2*n)/v2;                  //time taken by the elevator.
		    if(t2>t1){
		     System.out.println("Stairs");  
		}else{
		    System.out.println("Elevator");
		}
        }
    }
}
