import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Workattech{
    public static void main(String[] args){
        LinkedList<Integer> l1=new LinkedList<>();
        Scanner in=new Scanner(System.in);

        int T=in.nextInt();
        for (int i=0;i<T;i++){
            int tn=in.nextInt();
            int[] num=new int[tn];
            for (int k=0;k<tn;k++){
                num[k]=in.nextInt();

            }
            Iterator it= new iterator();
            while (it.hasNext()){
                System.out.print(l1+" ");

            }
            for (int j=0;j<tn;j++){
                l1.remove();
            }
        }
    }
}