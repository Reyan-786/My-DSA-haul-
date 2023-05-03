public class number_power {
    // public static double myPow(double x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     double ans =1;
    //     while(n>0){
    //         ans = x*myPow(x, n-1);
    //     }
    //     return ans  ;

    // }
    public static void main(String[] args) {
        int reverse =0;
        
        int x=-121;
        while(x>0){
            int remainder = x%10;
            reverse = reverse *10+remainder;
            x=x/10;
        }
        System.out.println(x==reverse );
        

    }
}
