import java.util.*;
public class CWH19{
    public static void main(String[] args){
        int min=Integer.MAX_VALUE;
        int [] marks = {10,12,14,144,150,167,900};
        int count=0;
        for(int i=0;i<marks.length-1;i++){
            if (marks[i]<marks[i+1]){
                count--;
            }       
            else {
                count++;
            }  
            
        }
        if (count>0){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
    }
}