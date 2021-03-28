import java.util.Scanner;

public class PerfectQueue
{
    int ar[];
    int count;
    int front,rear;
    PerfectQueue()
    {   count = 0;
        ar=new int[5];
        front=-1;
        rear=-1;
    }
    void insert()
    {
        if ((rear==4 && front==0)|| rear==front-1)
        {
            System.out.println("Queue full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2=new Scanner(System.in);
            int data=sc2.nextInt();
            
            
            if (front==-1)
            {
                front=0;
            }
            if (rear<4)
            {
                rear=rear+1;
            }
            else if (rear==4 && front!=0)
            {
                rear=0;
            }
            ar[rear]=data;
            if(checkPerfect(data)) count++;
            System.out.println("data inserted......");
            
            
        }
    }
    void delete()
    {
        if (front==-1 || rear==-1)
        {
            System.out.println("Circular Queue Empty....");
        }
        else
        {
            if (front==rear)
            {
                System.out.println("deleted :"+ar[front]);
                front=-1;
                rear=-1;
            }
            else if(front<rear)
            {
                System.out.println("deleted :"+ar[front]);
                front=front+1;
            }
            else if (front==4)
            {
                System.out.println("deleted :"+ar[front]);
                front=0;
            }
            else if (rear<front)
            {
                System.out.println("deleted :"+ar[front]);
                front=front+1;
            }
        }
    }
    void traverse()
    {
        if (front==-1 || rear==-1)
        {
            System.out.println("Queue Empty...");
        }
        else
        {
            if (front<=rear)
            {
                for (int i = front; i <=rear ; i++)
                {
                    System.out.print(ar[i]+" ");
                }
            }
            else
            {
                for (int i = front; i <=4 ; i++)
                {
                    System.out.print(ar[i]+" ");
                }
                for (int i = 0; i <=rear ; i++)
                {
                    System.out.print(ar[i]+" ");
                }
            }
            System.out.println("\nPerfect numbers :"+count);
        }
    }
    void peek()
    {
    }
    void poll()
    {
    }
    
    boolean checkPerfect(int n)
    {   
        int div = 0;
        for(int i = 1;i<n;i++)
        {   
            if(n%i == 0) 
                div += i;
        }
        return div == n;
            
        
    }
    public static void main(String[] args) {
        PerfectQueue obj=new PerfectQueue();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Press 5 for peak");
            System.out.println("Press 6 for poll");
            System.out.println("Enter ur choice");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1 :
                    obj.insert();
                    break;
                    
                case 2:
                    obj.delete();
                    break;
                
                case 3:
                    obj.traverse();
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.peek();
                    break;
                
                case 6 :
                    obj.poll();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}