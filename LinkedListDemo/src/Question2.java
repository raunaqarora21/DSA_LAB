
import java.util.Scanner;

class Nodeee
{   
    int data;
    Nodeee next;
}
public class Question2 

{   Nodeee Start;
    Question2()
    {
        Start = null;
    }
    
    void addNode()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();
        
        Nodeee newnode = new Nodeee();
        newnode.data = data;
        newnode.next = Start;
        Start = newnode;
    }
    
 void deleteNodeEnd()
    {   if(Start == null)
        {
            System.out.println("List is empty");
        }
    else{
        System.out.println("Last element deleted");
        Nodeee current = Start;
        //boolean flag = true;
        try{
        while(current.next.next!=null)
          { 
            current = current.next;
          }
        current.next = null;
        
        }
        catch(Exception e){
            //System.out.println("List is empty");
            Start = null;
        }
                
    }
       
    }
    void transverse()
    {
        if(Start == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            for(Nodeee current = Start; current!=null;current = current.next)
            {
                System.out.print(current.data + " ");
            }System.out.println();
        }
                
    }
    public static void main(String[] args)
    {
        Question2 obj = new Question2();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for exit");
            System.out.println("Press 4 for transverse");
            
            System.out.println("\nEnter your choice");
            
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                    obj.addNode();
                    break;
                case 2 : 
                    obj.deleteNodeEnd();
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4: 
                    obj.transverse();
                    break;
                default : System.out.println("Invalid choice");
        }
        
    }
    }
}
