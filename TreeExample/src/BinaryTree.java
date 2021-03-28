import java.util.Scanner;

public class BinaryTree 
{   nODE root;
    static class nODE
    {
        int data;
        nODE left;
        nODE right;
        public nODE(int data)
            {
                this.data = data;
                this.left = this.right = null;
            }
    }
    
    BinaryTree()
    {
        this.root = null;
    }
    
    nODE insert(nODE root,int data)
    {
        if(root == null)
        {   
            
            root = new nODE(data);
            return root;
        }
        
        if(data < root.data)
        {
            root.left = insert(root.left,data);
        }
        
        if(data > root.data)
        {
            root.right = insert(root.right,data);
        }
        
        return root;
    }
    nODE delete(nODE root,int val)
    {
         if(root == null) return root;
         if(val < root.data)
         {
             root.left = delete(root.left,val);
         }
         else if(val > root.data)
         {
             root.right = delete(root.right,val);
         }
         else
         {
             if(root.left == null) return root.right;
             if(root.right == null) return root.left;
             root.data = min(root);
             root.right = delete(root.right,root.data);
         }
         return root;
         
    }
    
    int min(nODE root)
    {
        
        while(root.left != null)
        {   
            
            root = root.left;
            
        }
        return root.data;
    }
     
    void inorder(nODE root)
    {
         if(root!=null)
         {
             inorder(root.left);
             System.out.print(root.data+ " ");
             inorder(root.right);
         }
    }
     
    void preorder(nODE root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
     
    void postorder(nODE root)
    {
         if(root!=null)
         {
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data + " ");
                    
         }
    }
    public static void main(String[] args)
    {
        BinaryTree obj = new BinaryTree();
        nODE root = obj.root;
        while(true)
        {   Scanner sc = new Scanner(System.in);
            
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for preorder");
            System.out.println("Press 3 for postorder");
            System.out.println("Press 4 for inorder");
            System.out.println("Press 5 for exit");
            System.out.println("Press 6 for delete");
            System.out.println("Press 7 for Minimum Value");
            
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            
            
            switch(ch)
            {
                case 1: 
                    System.out.println("Enter value to be inserted ");
                    root = obj.insert(root,sc.nextInt());
                    break;
                case 2: 
                    obj.preorder(root);
                    System.out.println();
                    break;
                case 3: 
                    obj.postorder(root);
                    System.out.println();
                    break;
                case 4:
                    obj.inorder(root);
                    System.out.println();
                    break;
                
                case 5: 
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Enter value to be deleted");
                    root = obj.delete(root, sc.nextInt());
                    break;
                case 7: 
                    System.out.println(obj.min(root));
                    break;
                default: System.out.println("Wrong choice");
                           
                
            }
        }
    }
}
