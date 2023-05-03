import java.util.*;
public class remove_element2 {
   
    public static void main(String[] args) {
        int [] nums={0,0,0,1,1,2,2,2,3,3,4,4,4,4,5,5,5,5};

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;nums[i]!=nums[j];j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                int k=0; 
                if(nums[i]!=nums[j]){
                    k=j-1;
                }
                for(int l=k;l>i;l--){
                    nums[l]=nums[j+1];
                }
            }
            
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
