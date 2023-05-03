import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        int [] nums= {0,3,1};
        int size=nums.length;
        Arrays.sort(nums);
        // System.out.println(size);
        nums = new int [size];
        int k=0;
        for(int i=0;i<size;i++){
            if(nums[i]!=i){
                k=i;
                break;
            }
        }
        System.out.println(k);
    }
}
