import java.util.Scanner;
public class ArrayExample5 
{
   ArrayExample5()
   {
       Scanner sc = new Scanner(System.in);
       int ar[] = new int[10];
       for(int i = 0;i<ar.length;i++)
       {
           ar[i] = sc.nextInt();
       }
       
       int neg = 0;
       for(int i = 0;i<10;i++)
       {
           if (ar[i] < 0) neg++;
       }
       System.out.println("Number of Positive elements "+(10-neg));
       System.out.println("Number of Negative elements "+neg);
       
   }
   public static void main(String[] args)
   {
       ArrayExample5 obj = new ArrayExample5();
   }
}
