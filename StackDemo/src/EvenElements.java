import java.util.Scanner;
public class EvenElements 
{
    
    int top;
    int ar[];
    EvenElements()
    
    {   
        ar = new int[5];
        top = -1;
    }
    
    void insert()
    {   
        Scanner sc = new Scanner(System.in);
        
        
        if(top == 4){
            System.out.println("Stack is Full");
        }
        else{
            System.out.println("Enter element to be inserted");
            int item = sc.nextInt();
            if (item % 2 == 0)
            {
                ar[++top] = item;
                System.out.println("Data inserted..");
            }
            else
            {
                System.out.println("Enter even number.");
            }
        }
            
    }
    
    void transverse()
    {
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else
        {
            for(int curr = top;curr>=0;curr--){
                System.out.print(ar[curr]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        EvenElements obj = new EvenElements();
        while(true)
        {
            System.out.println("\nEnter your choice");

            System.out.println("Press 1 for insert"); 
            System.out.println("Press 2 for transverse");
            System.out.println("Press 3 for exit");
            int ch = sc.nextInt();
        
        
            switch(ch)
            {
                case 1 : 
                    obj.insert();
                    break;

                case 2 : 
                    obj.transverse();
                    break;
                case 3: 
                    System.exit(0);
                    break;
                default : System.out.println("Invalid Choice");

            }
        
            
        }
        
        
    }
}
