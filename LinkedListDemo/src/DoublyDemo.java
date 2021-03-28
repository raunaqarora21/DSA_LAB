import java.util.Scanner;
class NODe
{
    NODe next;
    NODe prev;
    int data;
}
public class DoublyDemo 
{   NODe start;
    DoublyDemo()
    {
        start = null;
    }
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
        int rn = sc.nextInt();
        
        NODe newnode = new NODe();
        newnode.data = rn;
        newnode.prev = null;
        newnode.next = null;
        
        if(start == null){
            start = newnode;
        }
        else
        {  
           
           NODe current = start;
           while(current.next!=null)
           {
               current = current.next;
            
           }
           current.next = newnode;
           newnode.prev = current;
           
        }
        
        System.out.println("Data inserted..");
        
        
               
    }
    
    void insertAtBegin()
            
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be inserted");
        int data = sc.nextInt();
        System.out.println("Enter position ");
        int val = sc.nextInt();
        
        NODe newnode = new NODe();
        newnode.data = data;
        boolean flag = false;
        for(NODe current = start;current!=null;current = current.next)
        {   
            if(current.data == val)
            {   flag = true;
                if(current.prev == null)
                {
                    current.prev = newnode;
                    newnode.next = current;
                    start = newnode;
                }
                else
                {   
                    NODe previousNode = current.prev;
                    current.prev = newnode;
                    newnode.prev = previousNode;
                    previousNode.next = newnode;
                    newnode.next = current;
                    
                }
                System.out.println("Data inserted..");
            }
        }
        if(flag == false)
        {
            System.out.println("Value not in the list");
        }
    }
    
    void insertAtEnd()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be inserted");
        int data = sc.nextInt();
        System.out.println("Enter position ");
        int val = sc.nextInt();
        
        NODe newnode = new NODe();
        newnode.data = data;
        boolean flag = false;
        for(NODe current = start; current!=null;current = current.next)
        {
            if(current.data == val)
            {   flag = true;
                if(current.next == null)
                {
                    current.next = newnode;
                    newnode.prev = current;
                    newnode.next = null;
                }
                else
                {
                    NODe nextNode = current.next;
                    nextNode.prev = newnode;
                    current.next = newnode;
                    newnode.prev = current;
                    newnode.next = nextNode;
                }
                System.out.println("Data inserted..");
            }
        }
        if(flag == false)
        {
            System.out.println("Value not in the list");
        }
    }
    
     void transverseNode()
    {
        if(start == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            NODe current;
            for(current = start;current!=null;current = current.next){
                System.out.print(current.data+" ");
                
            }System.out.println();
        }
    }
    
    
    
    
    
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        DoublyDemo obj = new DoublyDemo();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for insert at begin");
            System.out.println("Press 3 for insert at end");
            System.out.println("Press 4 for transverse");
            System.out.println("Press 5 for exit");
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1: 
                    obj.insert();
                    break;
                case 2:
                    obj.insertAtBegin();
                    break;
                case 3:
                    obj.insertAtEnd();
                    break;
                case 4:
                    obj.transverseNode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default: System.out.println("Invalid Choice");
                
            }
        }
    }
}
