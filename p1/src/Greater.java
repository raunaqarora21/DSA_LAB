import java.util.Scanner;
public class Greater 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) System.out.println("A is greater");
        else{
            if(a == b) System.out.println("A and B are equal");
            else System.out.println("B is greater");
        }
    }
    void func2()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        int t = a;
        a = b;
        b = t;
        
        System.out.println(a+" "+b);
    }
    public static void main(String[] args)
    {
        Greater obj = new Greater();
        obj.func2();
    }
}
