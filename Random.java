import java.awt.*;
import java.util.Scanner;

public class Random{

    public static void main(String[] args){
    int [][] ndim= new int[3][3];
    Scanner scanner = new Scanner(System.in);
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
        int count= scanner.nextInt();
        ndim[i][j]=count;
    }
}
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.print(ndim[i][j]+" ");
            
        }
        System.out.print("\n");
    }
    

    
    
    }
}