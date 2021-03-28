import java.util.*;
class NODE{
    int data;
    NODE next;
}
public class SinglyQueue 
{   int ar[];
    int front,rear;
    
    SinglyQueue()
    {
        ar = new int[5];
        front = rear = -1;
    }
    
    void insert()
    {
        if(rear == 4)
        {
            System.out.println("Queue is full");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data");
            int data = sc.nextInt();
            if(front == -1) front = 0;
            rear = rear + 1;
            ar[rear] = data;
            System.out.println("data inserted..");
        }
    }

    void delete()
    {
        if(front == -1 || rear == -1){
            System.out.println("Queue is empty");
        }
        else
        {
           if(front == rear)
           {   
               System.out.println("deleted element: "+ar[front]);
               front = rear = -1;
           } 
           else
           {
               System.out.println("deleted element: "+ar[front]);
               front = front + 1;
           }
           
        }
        
    }
    
    void transverse()
    {
        if(front == -1 || rear == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i = front;i<=rear;i++)
            {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
            
    }
    
    void peek()
    {
        if(front == -1 || rear == -1)
        {
           System.out.println("Queue is empty"); 
        }
        else
        {
            System.out.println("Last element : "+ar[rear]);
        }
    }
    
    void poll()
    {
        if(front == -1 || rear == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("First element: "+ar[front]);
        }
    }
        
    public static void main(String[] args)
    {   
        
        SinglyQueue obj = new SinglyQueue();
        while(true)
        {
            System.out.println("Press 1 for insert"); 
            System.out.println("Press 2 for delete"); 
            System.out.println("Press 3 for transverse"); 
            System.out.println("Press 4 for exit"); 
            System.out.println("Press 5 for peek"); 
            System.out.println("Press 6 for poll"); 
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1: 
                    obj.insert();
                    break;
                case 2: 
                    obj.delete();
                    break;
                case 3 : 
                    obj.transverse();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                    
                case 5: 
                    obj.peek();
                    break;
                case 6: 
                    obj.poll();
                    break;  
                default:System.out.println("Invalid Choice");
                     
            }
        }
    }
}
