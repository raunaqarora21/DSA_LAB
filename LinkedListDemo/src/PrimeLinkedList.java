
import java.util.Scanner;

class Nodee
{   
    int data;
    Nodee next;
}

public class PrimeLinkedList
{   Nodee start;
    int count1;
    int count2;
    PrimeLinkedList()
    {
        start = null;
        count1 = 0;
        count2 = 0;
    }
    
    void insert()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be inserted");
        int data = sc.nextInt();
        
        Nodee newnode = new Nodee();
            newnode.data = data;
            if(start == null)
            {
               start = newnode;
            }
            else
            {
               Nodee current = start;
               while(current.next!= null)
               {
                   current = current.next;
               }
               
               current.next = newnode;
               
            }
            //System.out.println("Data inserted");
          
            
        
        if(isPrime(data)) count1++;
        else
        {
            count2++;
            //System.out.println("Enter prime number.. ");
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
            for(Nodee current = start; current!=null;current = current.next)
            {
                System.out.print(current.data + " ");
            }System.out.println();
            
            
        }
        System.out.println("Prime Count "+count1);
        System.out.println("Non Prime count "+count2);
                
    }
    boolean isPrime(int n)
    {   if(n == 0 || n == 1) return false;
        for(int i = 2;i<n;i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        PrimeLinkedList obj = new PrimeLinkedList();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for transverse");
            System.out.println("Press 3 for exit");
            
            System.out.println("\nEnter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                    obj.insert();
                    break;
                case 2 : 
                    obj.transverse();
                    break;
                case 3:
                    System.exit(0);
                    break;
                    
                default : System.out.println("Invalid choice");
        }
    }
    
}
}
