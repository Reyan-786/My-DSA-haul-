import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class infernos {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int T=sc.nextInt();    
    while(T-->0){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int  multitime=0;
        int singletime=0;
        int [] hp= new int [n];
        for (int i=0;i<n;i++){
            hp[i]=sc.nextInt();
            if (hp[i]<x){
                singletime+=1;
            }
            else if (hp[i]%x==0){
                singletime+=(hp[i]/x);
            }
           else {
               singletime+=hp[i]/x;
           }
        
        }
        Arrays.sort(hp);
        multitime=hp[n-1];
        
        if(multitime>singletime){
            System.out.println(singletime);

        }
        else{
            System.out.println(multitime);
        }


}
 }   
}
