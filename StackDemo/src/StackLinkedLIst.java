
import java.util.Scanner;
class NODEEEE{
    NODEEEE next;
    int data;
}

public class StackLinkedLIst 
{   
    NODEEEE top;
    StackLinkedLIst()
    {
        top = null;
    }
    void push(int data)
    {   
        NODEEEE newnode = new NODEEEE();
        newnode.data = data;
        newnode.next = null;
        
        if(top == null)
        {
            top = newnode;
        }
        else
        {
            newnode.next = top;
            top = newnode;
        }
    }
    
    public int pop()
    {   int val;
        if(isEmpty()) return -1;
        if(top.next == null)
        {
            
            val = top.data;
            top = null;
        }
        else
        {
            val = top.data;
            top = top.next;
        }
        return val;
        
    }
    
    public int peek()
    {   
        if(isEmpty()) return -1;
        return top.data;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    public void transverse()
    {   
        if(isEmpty()) System.out.println("Stack is Empty");
        else
        {
            for(NODEEEE current = top;current!=null;current = current.next)
            {
                System.out.print(current.data+" ");
                
            }
            System.out.println();  
        }
    }
    public static void main(String[] args)
    {
       StackLinkedLIst obj = new StackLinkedLIst();
       Scanner sc = new Scanner(System.in);
       while(true)
       {
           System.out.println("\nPress 1 for push ");
           System.out.println("Press 2 for pop");
           System.out.println("Press 3 for transverse");
           System.out.println("Press 4 for exit");
           System.out.println("Press 5 for peek");
           
           System.out.println("\nEnter your choice");
           int ch = sc.nextInt();
           switch(ch)
           {
               case 1:
                   System.out.println("Enter data");
                   obj.push(sc.nextInt());
                   break;
               case 2 : 
                   System.out.println(obj.pop());
                   break;
               case 3 : 
                   obj.transverse();
                   break;
               case 4:
                   System.exit(0);
                   break;
               case 5:
                   System.out.println(obj.peek());
                   break;
               default:
                   System.out.println("Wrong Choice");
                           
                           
           }
       }
       
       
       
   }
    
}
