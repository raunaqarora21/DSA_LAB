
import java.util.*;

class nOdE
{
    nOdE next;
    String name;
    int sid;
}


public class Question3 
{   
    nOdE Start;
    List<String> names = new ArrayList<>();
    List<Integer> rno = new ArrayList<>();
    Question3()
    {
        Start = null;
    }
    void addnode()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        names.add(name);
        System.out.println("Enter rollNo");
        int sid = sc.nextInt();
        rno.add(sid);
        
        nOdE newnode = new nOdE();
        newnode.name = name;
        newnode.sid = sid;
        
        newnode.next = null;
        if(Start == null)
        {
            Start = newnode;
        }
        else
        {   nOdE current = Start;
            while(current.next!=null)
            {
                current = current.next;
            }
            
            current.next = newnode;
            
        }  
        System.out.println("Data inserted...");
    }
    
    void transversenode()
    {
        if(Start == null){
            System.out.println("List is empty");
        }
        else
        {
            
            for(nOdE current = Start;current!=null;current = current.next)
            {
                System.out.println(current.sid+" "+current.name);
            }
        }

    }
    
    class SortRoll implements Comparator<nOdE>
    {   


        @Override
        public int compare(nOdE o1, nOdE o2) {
            if(o1.sid > o2.sid) return 1;
            else return 0;
        }
    }
    public static void main(String[] args)
    {
        Question3 obj = new Question3();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for transverse");
            System.out.println("Press 3 for exit");
            System.out.println("\nEnter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                    obj.addnode();
                    break;
                
                case 2:
                    obj.transversenode();
                    break;
                case 3:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Wrong Choice");
            }
        }
        
    }
}
