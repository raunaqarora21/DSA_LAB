import java.util.Scanner;


class Node{
    int data;
    Node next;
}
public class SinglyQueueLinkedList 
{   
    Node front,rear;
    SinglyQueueLinkedList()
    {
        front = rear = null;
    }
    
    void insert()
    {
        System.out.println("Enter data");
        
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        
        if(front == null || rear == null)
        {
            front = rear = newnode;
        }
        else
        {
            Node current = front;
            while(current.next!=null){
                current = current.next;
            }
            
            current.next = newnode;
                 
        }
        System.out.println("data inserted..");
                
    }
    
    void transverse()
    {
        
        if(front == null || rear == null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(Node current = front;current!=null;current = current.next){
                System.out.print(current.data+" ");
            }
            System.out.println();
        }
    }
    
    void delete()
    { 
        
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Deleted : "+front.data);
            front = front.next;
        }
        
    }
    
    void peek()
    {
        
    }
    
    void poll()
    {
        
    }
    public static void main(String[] args)
    {
        SinglyQueueLinkedList obj = new SinglyQueueLinkedList();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Press 1 for insert"); 
            System.out.println("Press 2 for delete"); 
            System.out.println("Press 3 for transverse"); 
            System.out.println("Press 4 for exit"); 
            System.out.println("Press 5 for peek"); 
            System.out.println("Press 6 for poll"); 
            
            
            
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
