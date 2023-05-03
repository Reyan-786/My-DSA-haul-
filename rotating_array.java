public class rotating_array {
    public static void main(String[] args) {
        int [] arr = {9 ,10,24,21,45,75,12};
        int k=1;
        int [] temp= new int [arr.length]; 
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length]=arr[i];
        }
        arr=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
