import java.util.Scanner;
public class ArrayExample3 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        for(int i = 0;i<5;i++){
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        for(int i = 1;i<5;i++){
            if(max<ar[i]){
                max = ar[i];
            }
        }
        System.out.println("Maximum number is "+max);
    }
    public static void main(String args[])
    {
        ArrayExample3 obj = new ArrayExample3();
        obj.func();
    }
}
