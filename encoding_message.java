import java.util.*;
public class encoding_message{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int N=sc.nextInt();
            String txt=sc.nextLine();
            char[] ch=txt.toCharArray();
            for(int i =0;i<N-1;i+=2){
		        char temp=ch[i];
		        ch[i]=ch[i+1];
		        ch[i+1]=temp;
		    }
            for (int i=0;i<N;i++){
                System.out.println(ch[i]);
            }
        T--;
        }
        sc.close();
}
}

    