import java.util.*;
class price_after_discount {
    public static boolean isPrice(String s){
         if(s.startsWith("$") && s.substring(1).matches("\\d+"))
             return true;
         
         else 
             return false;
     }
     public static void main(String args[]) {
        // String sentence="there are $10 shoes in the market";
        // int discount =100;
        //  String x []= sentence.split(" ");
        //  for(int i=0;i<x.length;i++){
        //      if(isPrice(x[i])){
        //          double  price = Double.parseDouble(x[i].substring(1));
        //          double afterdiscount=price-price*discount/100;
        //          System.out.println(afterdiscount);
        //          x[i]="$"+Double.toString(afterdiscount);
        //      }
        //  }
        //  String res ="";
        //  for(int i=0;i<x.length;i++){
        //      res = res +x[i]+" ";
        //  }
        //  System.out.println(res.trim());
        String s="add";
        String t="egg";
        if(s.length()!=t.length()) System.out.println("false");;
        ArrayList<Character> seen = new ArrayList<>();
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            if(!seen.contains(c)){
                s.replace(s.charAt(i),c);
            }
        }
        if(s.equals(t)) System.out.println("true");
        else System.out.println("false");

     }
 }