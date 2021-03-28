import java.util.Scanner;
public class Demo 
{
    void func()
    {   Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        int res = var1 + var2;
        System.out.println(res);
    }
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        obj.func();
        
    }
    
}
