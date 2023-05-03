import java.util.Random;
public class stars {
    static void starrec(int n){
        
        if(n>0){
            starrec(n-1);
            
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
           
        
        
        
    
        
        
    public static void main(String[] args) {
    starrec(19);
    
            
}    
}
