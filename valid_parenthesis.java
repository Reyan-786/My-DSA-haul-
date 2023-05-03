import java.util.ArrayList;
import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s="[)";
        Stack<Character> stack= new Stack<Character>();
        for(char c :s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            if(c=='{'){
                stack.push('}');
            }
            if(c=='['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != c){
			    System.out.println("false ");
            }
            
        }
        System.out.println(stack);
        // stack.pop();
        System.out.println(stack);

        // System.out.println(stack);
        // System.out.println(stack.pop());
        // boolean ans = stack.isEmpty();
        // if(ans ){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false ");
        // }

    }
}
