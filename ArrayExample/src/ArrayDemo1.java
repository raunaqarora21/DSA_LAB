import java.util.Scanner;
public class ArrayDemo1 
{   void func()
    {   Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        for(int i = 0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }
        
        for(int e : ar)
        {
            System.out.print(e+" ");
        } 
        System.out.println();
        
        
        
    }
    public static void main(String[] args)
    {
        ArrayDemo1 obj = new ArrayDemo1();
        obj.func();
        
    }
}
