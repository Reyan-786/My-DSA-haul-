public class String_Mutiplication {
    public static void main(String[] args) {
        // String S="9012";
        // int num1=0;
        // int multiplier1=1;
        // int size1=S.length();
        // for(int i=0;i<size1;i++){
        //     int temp=S.charAt(i)-'0';
        //     num1=num1*10+temp;
        // }
        // System.out.println(num1);
        // int num2=0;
        // String S2="289";
        // // int multiplier1=1;
        // int size2=S2.length();
        // for(int i=0;i<size2;i++){
        //     int temp=S2.charAt(i)-'0';
        //     num2=num2*10+temp;
        // }
        // System.out.println(num2*num1);
        // int ans =num2*num1 ;
        // String ans1 = Integer.toString(ans);
        // System.out.println(ans1);
     int a=12;
     String a1="";
       a1=(char)((a%10)+'0')+a1;
       a=a/10;

       a1=(char)((a%10)+'0')+a1;
       System.out.println(a1);
    }
}
