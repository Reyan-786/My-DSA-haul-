import java.util.Iterator;
import java.util.LinkedList;

import java.util.Stack;
public class Llist{
    public static void main(String[] args){
        Stack<Integer> s1= new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.print(s1+" ");
    }
}
public class Llist{
    public static void main(String[] args){
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(0,2);
        l1.add(1,3);
        l1.add(2,4);
        
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}