import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class WorktechSolutionLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        int T = scanner.nextInt();
    for (int i=0;i<T;i++){
        int num= scanner.nextInt();
        for(int j=0;j<num;j++){
            int count= scanner.nextInt();
            l1.add(count);
            
        }
        Iterator it =l1.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
            
        }
        System.out.print("\n");
        for (int k=0;k<num;k++){
            l1.remove();
        }
        

    }

    }
}
