import java.util.*;
public class hackerrank1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int [] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> a= new HashSet<>();
    for(int i=0;i<10;i++){
        for(int j=i+1;j<10;j++){
            int sum=0;
            sum=arr[i]+arr[j];
            if((sum%k)!=0){
                a.add(arr[i]);
                a.add(arr[j]);
            }
        }
    }
    System.out.println(a);

    }
}
