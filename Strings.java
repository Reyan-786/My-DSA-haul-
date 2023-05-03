class Strings{
    public static void main(String[] args) {
        String s="Iamacoder";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.println(res);
    }
}