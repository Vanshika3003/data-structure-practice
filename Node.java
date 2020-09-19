import java.util.LinkedList; 
import java.util.Queue; 

    class Node
    {
        int data;
        Node left,right;
        Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    class BinaryTree
    {
        Node root;
        int treeheight(Node node)
        {
        Queue <Node> q=new LinkedList <>();
        int h=0;
    
        q.add(node);
        while(1==1)
        {
        int count=0;
        count=q.size();
        if(count==0)
        return h;
        else
        h++;
        while(count>0)
        {
            Node newn=q.peek();
            q.remove();
            if(newn.left!=null)
            q.add(newn.left);
            if(newn.right!=null)
            q.add(newn.right);
            count--;
        }
        }
    }
    
    public static void main(String args[])  
    { 
        BinaryTree tree = new BinaryTree(); 
          
        // Let us create a binary tree shown in above diagram 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        System.out.println("Height of tree is " + tree.treeheight(tree.root)); 
    } 
}