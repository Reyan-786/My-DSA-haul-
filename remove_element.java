public class remove_element {
    public static void main(String[] args) {
        int [] nums={3,2,2,3};
        int val=3;
        int size=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                size--;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==val){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
