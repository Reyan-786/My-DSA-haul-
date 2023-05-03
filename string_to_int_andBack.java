public class string_to_int_andBack {
    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        int number1=0;
        int number2=0;

        for(int i=0;i<num1.length();i++){
            int num = num1.charAt(i)-'0';
            number1=number1*10+num;
            
        }
        for(int i=0;i<num2.length();i++){
            int num = num2.charAt(i)-'0';
            number2=number2*10+num;
            
        }
        System.out.println(number1);
        System.out.println(number2);
        int ans = number2*number1;
        String res =Integer.toString(ans);
        // return res;

    }
}
