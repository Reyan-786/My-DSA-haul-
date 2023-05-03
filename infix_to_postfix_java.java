import java.util.Stack;
import java.util.*;
public class infix_to_postfix_java {
    // Stack<Character> stack= new Stack<>();

    public static int precedence(char c){
        if(c=='#'){
            return 1;
        }
        else if(c=='+'|| c=='-'){
            return 2;
        }
        else  if(c=='*'|| c=='/'){
            return 3;
        }
        return -1;
        
    }
    public static Boolean isoperator(char ch){
        if(ch=='+'|| ch=='-'||ch=='*'|| ch=='/'){
            return true;
        }
        return false;
    }
    public static String infix2postfix(String s){
        String postfix="";
        char ch,elem;
        s.trim();
        Stack<Character> stack= new Stack<>();
        stack.push('#');
        for(int i=0;i<s.length();i++){
         ch=s.charAt(i);
            if(ch=='('){
                stack.push('(');
            }
            else if(isoperator(ch)){
                while(precedence(stack.peek())>=precedence(ch)){
                    postfix=postfix+stack.pop();
                }
                stack.push(ch);
            }
            else if(ch==')'){
                while(stack.peek()!='('){
                    postfix=postfix+stack.pop();
                }
                elem=stack.pop();
            }
            else{
                postfix =postfix+ch;
            }
            
        }
        while(stack.peek()!='#'){
            postfix =postfix+stack.pop();
        }
        return postfix;

    }
    public static int evaluate (String s ){
        char ch;
        int op1,op2;
        Stack<Integer> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch)){
                ans.push(ch-'0');
            }
            else {
                op2=ans.pop();
                op1=ans.pop();
                if(ch=='+'){
                    ans.push(op1+op2);
                }
                if(ch=='-'){
                    ans.push(op1-op2);
                }
                if(ch=='*'){
                    ans.push(op1*op2);
                }
                if(ch=='/'){
                    ans.push(op1/op2);
                }
            }
            
        }
        return ans.peek();
    }
    
    public static void main(String[] args) {
        String s= "1-2*3+5/4-6*7";
        
        String res =infix2postfix(s);
        System.out.println(res);
        int ans =evaluate(res);
        System.out.println(ans);


    }
}
