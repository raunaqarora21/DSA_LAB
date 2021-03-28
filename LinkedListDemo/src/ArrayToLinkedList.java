import java.util.Scanner;
class NOde
{
    int rn;
    NOde next;
}

public class ArrayToLinkedList 
{   static int ar[];
    NOde start;
    ArrayToLinkedList()
    {   
        start = null;
        ar= new int[5];
    }
    
    void insert(int data)
    {
        NOde newnode = new NOde();
        newnode.rn = data;
        if(start == null)
        {
            start = newnode;
        }
        else
        {   NOde current = start;
            while(current.next!= null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
    }
    
    void transverse()
    {
        if(start == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            for(NOde current = start; current!=null;current = current.next)
            {
                System.out.print(current.rn + " ");
            }System.out.println();
        }
                
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        ArrayToLinkedList obj = new ArrayToLinkedList();
        for(int i  = 0;i<5;i++){
            System.out.println("Enter roll num");
            ar[i] = sc.nextInt();
            
        }
        
        for(int i  = 0;i<5;i++)
        {
            obj.insert(ar[i]);
        }
        
        obj.transverse();
        
        
        
        
    }
}
