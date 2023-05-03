import java.util.*;
public class string_match {
    public static void main(String[] args) {
        // String s="adc";
        // String t="axdcbe";
        // if(s.length()!=t.length()){
        //     System.out.println("false");
        // }
        // ArrayList<Character> seen = new ArrayList<>();
        // // for(int i=0;i<s.length();i++){
        // //     if(!seen.contains(s.charAt(i))){
        // //         seen.add(s.charAt(i));
        // //         s.replace(s.charAt(i),t.charAt(i));
        // //     }
        // // }
        // // System.out.println(t);
        // s=s.replace(s.charAt(1), t.charAt(1));
        // System.out.println(s);
        String s="TOILET";
        String t="MAKINA";
        for(int i=0;i<s.length();i++){
            List <Integer> index = new ArrayList<>();
            
            for(int j=i+1;j<t.length();j++){
                if(t.charAt(i)==t.charAt(j)){
                    index.add(j);
                }
            }
            for(int j=1;j<index.size();j++){
                char c= s.charAt(index.get(0));
                if(!(s.charAt(j)==c)){
                    System.out.println("false");
                    break;
                }
            }
        }
        

    }
}
