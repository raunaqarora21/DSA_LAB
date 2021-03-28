import java.util.*;
public class Sample 
{   int ar[];
    int top;
    Sample()
    {
        ar = new int[5];
        top = -1;
        
    }
    
    public void push(int data)
    {
        if(top == 4) System.out.println("Stack is full");
        else
        {
            ar[++top] = data;
        }
            
    }
    
    public int pop()
    {   
        if(isEmpty()) 
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else 
            return ar[top--];
    }
    
    public int peek()
    {   
        if(isEmpty()) 
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else 
            return ar[top];
    }
    
    public void transverse()
    {   if(isEmpty()) 
        {
            System.out.println("Stack is Empty");
           
        }
        else
        {
        
    
        for(int i = top;i>=0;i--)
        {
            System.out.print(ar[i]+" ");
        }System.out.println();
        }
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public static void main(String[] args)
    {
       
       Sample obj = new Sample();
       Scanner sc = new Scanner(System.in);
       while(true)
       {
           System.out.println("\nPress 1 for push ");
           System.out.println("Press 2 for pop");
           System.out.println("Press 3 for transverse");
           System.out.println("Press 4 for exit");
           System.out.println("Press 5 for peek");
           System.out.println("Press 6 to check empty");
           System.out.println("\nEnter your choice");
           int ch = sc.nextInt();
           switch(ch)
           {
               case 1:
                   int data = sc.nextInt();
                   obj.push(data);
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
               case 6:
                   System.out.println(obj.isEmpty());
                   break;
               default:
                   System.out.println("Wrong Choice");
                           
                           
           }
       }
       
              

       
    }

    
}
