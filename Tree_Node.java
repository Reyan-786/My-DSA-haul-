import java.util.*;
public class TreeNode {
    String data ;
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();
    public TreeNode(String data){
        this.data = data ;
        this.children = new ArrayList<TreeNode>();
    }
    public void insert(TreeNode node ){
        this.children.add(node);
    }
    public String print(int level){
        String ret;
        ret = "  ".repeat(level)+data+"\n";
        for(TreeNode node: this.children ){
            ret+=node.print(level+1);
        }
        return ret;
    }


    public static void main(String[] args) {
           Tree_Node Drinks = new Tree_Node("Drinks");
           Tree_Node hot = new Tree_Node("Hot");
           Tree_Node cold= new Tree_Node("Cold");
           Drinks.children(hot);
           Drinks.children(cold);
           System.out.println(Drinks.children);
           
    }
}
