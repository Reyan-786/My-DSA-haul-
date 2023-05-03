import java.util.*;

public class ex1 {
    public static boolean stringcomp(String s, String k) {
        if (s.length() != k.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = k.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        List<List<String>> ans = new ArrayList<List<String>>();

        String s1 = new String(a);
        String k1 = new String(b);
        return (s1.equals(k1));

    }

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        // if (strs.length == 0) return new ArrayList();
        // Map<String,ArrayList<String>> ans = new HashMap<String,ArrayList<String>>();
        // for (String s : strs) {
        //     char[] ca = s.toCharArray();
        //     Arrays.sort(ca);
        //     String key = String.valueOf(ca);
        //     System.out.println(key);
        //     if (!ans.containsKey(key))
        //         ans.put(key, new ArrayList());
        //     ans.get(key).add(s);
        // }
        // System.out.println(ans.values());
        char [] a= strs[0].toCharArray();
        Arrays.sort(a);
        System.out.println(a);
        String key =String.valueOf(strs[0]);
        System.out.println(key);

    }
}
