import java.util.*;
class Node
{
    int data;
    Node next;
}

public class StackExampleLinkedList
        
{   
    Node top;
    StackExampleLinkedList()
    {
        
        top = null;
    }

    void push()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int newitem = sc.nextInt();
        
        Node newnode = new Node();
        newnode.data = newitem;
        newnode.next = top;
        
        top = newnode;
        System.out.println("Data inserted...");
        
        
        
    }
    void pop()
    {
        if(top ==null){
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted element is "+top.data);
            top = top.next;
        }
        
        
    }
    void transverse()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {   Node current;
            for(current = top;current!=null;current = current.next)
            {
                System.out.println(current.data);
            }
        }
        
        
    }
   public static void main(String[] args)
   {
       StackExampleLinkedList obj = new StackExampleLinkedList();
       Scanner sc = new Scanner(System.in);
       while(true)
       {
           System.out.println("\nPress 1 for push ");
           System.out.println("Press 2 for pop");
           System.out.println("Press 3 for transverse");
           System.out.println("Press 4 for exit");
           System.out.println("\nEnter your choice");
           int ch = sc.nextInt();
           switch(ch)
           {
               case 1:
                   obj.push();
                   break;
               case 2 : 
                   obj.pop();
                   break;
               case 3 : 
                   obj.transverse();
                   break;
               case 4:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Wrong Choice");
                           
                           
           }
       }
       
       
       
   }
}


