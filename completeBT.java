import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Queue; 
 class completeBT {
    static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int d)
        {
             right=null;
             left=null;
        }
    }
     static boolean check(Node root)
    {
        if(root == null) 
            return true; 
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(temp.left!=null)
            {
                if(flag==true)
                return false;
                q.add(temp.left);
            }
            else
            flag= true;
            //Node temp=q.remove();
            if(temp.right!=null)
            {
                if(flag==true)
                return false;
                q.add(temp.right);
            }
            else
            flag= true;
        }
        
        return true;
    }
    public static void main(String[] args)  
    { 
          
        /* Let us construct the following Binary Tree which 
          is not a complete Binary Tree 
                1 
              /   \ 
             2     3 
            / \     \ 
           4   5     6 
        */
       
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.right = new Node(6); 
          
        if(check(root) == true) 
            System.out.println("Complete Binary Tree"); 
        else
            System.out.println("NOT Complete Binary Tree"); 
     } 
}