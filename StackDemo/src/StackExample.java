import java.util.*;
public class StackExample 
        
{   int ar[];
    int top;
    StackExample()
    {
        ar = new int[5];
        top = -1;
    }

    void push()
    {   
        
        //System.out.println("push fn is working");
        if(top == 4)
        {
            System.out.println("Stack is full");
        }
        else
        {  Scanner sc = new Scanner(System.in);
           System.out.println("Enter data");
           ar[++top] = sc.nextInt();
           System.out.println("Data inserted...\n");
        }
        
    }
    void pop()
    {
        //System.out.println("pop fn is working");
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {   System.out.println("Deleted element : "+ar[top]);
            top = top - 1;
            
        }
        
    }
    void transverse()
    {
        //System.out.println("transverse fn is working");
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else
        {
           for(int i = top;i>=0;i--){
               System.out.print(ar[i]+" ");
           } System.out.println();
        }
        
    }
   public static void main(String[] args)
   {
       StackExample obj = new StackExample();
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
