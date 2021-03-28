import java.util.*;

class NODE
{
    int rollNo;
    NODE prev;
    NODE next;
          
}
public class DoublyLInkedList 
        
{
    NODE start;
    DoublyLInkedList()
    {
        start = null;
    }
    
    void addNode()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
        int rn = sc.nextInt();
        
        NODE newnode = new NODE();
        newnode.rollNo = rn;
        newnode.prev = null;
        newnode.next = null;
        
        if(start == null){
            start = newnode;
        }
        else
        {  
           
           NODE current = start;
           while(current.next!=null)
           {
               current = current.next;
            
           }
           current.next = newnode;
           newnode.prev = current;
           
        }
        
        System.out.println("Data inserted..");
        
        
               
    }
    
    void deleteNodeBegin()
    {
        if(start == null)
        {
            System.out.println("List is empty");
        }
        else
        {   try{
            System.out.println("First element delete");
            start = start.next;
            start.prev = null;
        }
        catch(Exception e){
            start = null;
            
        }
        }
        
    }
    
    void deleteNodeEnd()
    {   if(start == null)
        {
            System.out.println("List is empty");
        }
    else{
        System.out.println("Last element deleted");
        NODE current = start;
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
            start = null;
        }
                
    }
       
    }
    
    void deleteValueNode()
    {   DoublyLInkedList obj1 = new DoublyLInkedList();
       if(start == null){
           System.out.println("List is empty");
       }
       else{
           Scanner sc = new Scanner(System.in);
           int val = sc.nextInt();
           NODE current;
           boolean flag = true;
           
           //Check for 1st value
           if(start.rollNo == val)
           {    
               if(start.next != null)
               {
                    start = start.next;
                    start.prev = null;
               }
               else
               {
                   start = null;
               }
           }
           else{
               for(current = start;current.next!=null;current = current.next)
                {   
                    if(current.next.rollNo == val)
                    {
                        flag = false;
                        
                        if(current.next.next == null)
                        {
                            current.next = null;
                            break;
                        }
                        else
                        {
                        
                        current.next = current.next.next;
                        current.next.prev = current;
                        
                        break;
                        }
                    }
                    
                    
                    
                    
                }
               if (flag){
                   System.out.println("Element is not in the list");
               }
           }
       }
                   
                   
       }

    
    
    void transverseNode()
    {
        if(start == null){
            System.out.println("List is empty");
        }
        else{
            //forward
            System.out.println("FORWARD:");
            NODE current;
            for(current = start;current!=null;current = current.next){
                System.out.print(current.rollNo+" ");
                
            }System.out.println();
            
            //reverse
            
            System.out.println("REVERSE:");
            NODE current2 = start;
            while(current2.next!=null)
            {
                current2 = current2.next;
            }
            for(;current2!=null;current2 = current2.prev){
                System.out.print(current2.rollNo+" ");
            }
            System.out.println();

            
            
            
            
        }
    }
    
    
    void searchNode()
    {   if(start == null)
        {
        System.out.println("List is empty");
        }
        else
        {
        System.out.println("Enter element to be searched");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        NODE current;
        boolean flag = true;
        for(current = start;current!=null;current = current.next){
            if(item == current.rollNo){
                System.out.println(item+" is in the list");
                flag = false;
                break;
            }
        }
            if(flag)
            {
            System.out.println(item+" not in the list");
            }
        }
    }
    public static void main(String[] args)
    {   Scanner sc= new Scanner(System.in);
        DoublyLInkedList obj = new DoublyLInkedList();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for transverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");
            System.out.println("Press 6 for delete last");
            System.out.println("Press 7 for delete value");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1: 
                    obj.addNode();
                    break;
                case 2 :
                    obj.deleteNodeBegin();
                    //obj.deleteNodeEnd();
                    break;
                case 3:
                    obj.transverseNode();
                    break;
                case 4:
                    obj.searchNode();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                case 6: 
                    obj.deleteNodeEnd();
                    break;
                case 7 :
                    obj.deleteValueNode();
                    break;
                     
                
                default:
                    System.out.println("Wrong Choice");
                           
                            
            }
            
        }
        
        
        
    }
}
