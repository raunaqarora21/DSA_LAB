import java.util.Scanner;
public class ArrayExample2 
{
    ArrayExample2()
    {
        Scanner sc = new Scanner(System.in);
        String ar[] = new String[5];
        
        for(int i = 0;i<ar.length;i++)
        {
            ar[i] = sc.nextLine();
        }
        
        for(int j = 0;j<ar.length;j++)
        {
            System.out.println(ar[j]+" ");
        }
        
    }
    public static void main(String[] args)
    {
        ArrayExample2 obj = new ArrayExample2();
    }
}
