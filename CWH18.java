import java.util.*;

// import javax.sound.sampled.SourceDataLine;
public class CWH18{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        float [][] marks1= {{12,12,32,34,44,56},{1,2,1,2,3,2,}};
        float [][] marks2= {{12,34,32,44,65,67},{1,3,2,3,3,3}};
        float [][] marks3={};
        for (int i=0;i<=1;i++){
            for (int j=0;j<=5;j++){
                marks3[i][j]=marks1[i][j] + marks2[i][j];
            }
        }
        for (int m=0;m<2;m++){
            for (int n=0;n<6;n++){
                System.out.print(marks3[m][n]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        // float avgsum=0;
        // // float k=sc.nextInt();
        //  for (float element:marks){
        //     avgsum=avgsum+element;
        // }
        // float avgmarks=(avgsum)/marks.length;
        // System.out.println(avgsum);
        // System.out.println(avgmarks);
        // for (int i=0;i<2;i++){
        //     for(int j=0;j<6;j++){
        //         System.out.print(marks[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("\n");
        // }








































        

















        

    }
}