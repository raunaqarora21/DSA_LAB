
import java.util.Scanner;
class NoDe
{
    NoDe  next;
    int data;
}

public class QueueDemo 
{   
    NoDe front,rear;
    QueueDemo()
    {
        front = rear = null;
    }

    public void insert(int data)
    {
        NoDe newnode = new NoDe();
        newnode.data = data;
        newnode.next = null;
        if(front == null || rear == null)
        {
            front = rear = newnode;
        }
        else
        {
            NoDe current = front;
            while(current.next!= null){
                current = current.next;
            }
            current.next = newnode;
        }
    }
    
    public int delete()
    {   int ans;
        if(isEmpty()) return -1;
        if(front == null) return -1;
        if(front.next == null){
            
            ans = front.data;
            front = null;
            rear = null;
        }
        
        else{
            ans = front.data;
            front = front.next;
        }
        
        return ans;
    }
    
    public boolean isEmpty(){
        return front == null || rear == null;
            
        
    }
    
    public void transverse()
    {
        if(isEmpty()) System.out.println("Queue is Empty");
        else{
        for(NoDe current = front;current!=null;current = current.next){
                System.out.print(current.data+" ");
            }
            System.out.println();
        }
      
    }
    
    public boolean search(int data)
    {
        for(NoDe current = front;current!=null;current = current.next)
        {
            if(current.data == data) return true;
        }
        
        return false;
        
    
    }
    
    



    public static void main(String[] args)
    {
        QueueDemo obj = new QueueDemo();
        while(true)
        {
            System.out.println("Press 1 for insert"); 
            System.out.println("Press 2 for delete"); 
            System.out.println("Press 3 for transverse"); 
            System.out.println("Press 4 for exit"); 
            System.out.println("Press 5 for search"); 
            System.out.println("Press 6 for isEmpty"); 
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    int data = sc.nextInt();
                    obj.insert(data);
                    break;
                case 2: 
                    System.out.println(obj.delete());
                    break;
                case 3 : 
                    obj.transverse();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                    
                case 5: 
                    int d = sc.nextInt();
                    System.out.println(obj.search(d));
                    break;
                case 6: 
                    System.out.println(obj.isEmpty());
                    break;  
                default:System.out.println("Invalid Choice");
                     
            }
        }
        
        
        
        
        
    }
}
