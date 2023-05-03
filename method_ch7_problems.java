public class method_ch7_problems {
    // 1) problem 1.
    // static void table(int a){
        
    //     for(int i=1;i<=10;i++){
    //          System.out.print(a+"x"+i+"="+a*i);
    //          System.out.println("\n");
    //     }
    // }
    //problem 2.
    // static void printstars(){
    //     for (int i=0;i<4;i++ ){
    //         for (int j=0;j<4-i;j++){
    //             System.out.print("*");
                
    //         }
    //         System.out.println("\n");
    //     }
    // }
    // Problem 3.
    // static int sumRec(int n){
    //     if (n==1){
    //         return 1;
    //     }
    //     else {
    //         return n+sumRec(n-1);
    //     }
    //     }
        
    // }
    //problem 4.

    // static int nthterm(int n){
    //     int[] fibarr=new int[1000];
    //     fibarr[0]=1;
    //     fibarr[1]=1;
    //     for(int i=2;i<n;i++){
    //         fibarr[i]=fibarr[i-1]+fibarr[i-2];

    //     }
    //     if (n==1){
    //         return 0;
    //     }
    //     else if (n==2){
    //         return 1;
    //     }
    //     else{
    //         return nthterm(n-1)+nthterm(n-2);
    //     }
    //     }
    // problem 5.
    // static float average(int ...arr){
    //     float sumavg=0;
    //     for (float element :arr){
    //         sumavg+=element;
    //     }
    //     float avg = sumavg/arr.length;
    //     return avg;
    // }
    //problem 6. VVV IMPORTANT
//     static void printstars(int n){
        
//         if (n>0){
//             printstars(n-1);

//         for (int i=0;i<n;i++){
//             System.out.print("*");
//         }
//         System.out.print("\n");
//     }
// }
    
    public static void main(String[] args){
        // table(9); problem 1.
        // printstars(); problem 2.
        // int c = sumRec(4);// problem3.
        // System.out.println(c);//problem 3.
        // int c = nthterm(2); problem 4.
        // int c = nthterm(2); problem 4.
        // System.out.println(c);problem 4.
        // float d = average(9,8,8,5);problem 5.
        // System.out.println(d);//problem 5.
        // printstars(7);
    }
}