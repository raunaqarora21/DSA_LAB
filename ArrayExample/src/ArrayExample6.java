import java.util.*;
public class ArrayExample6 
{   ArrayExample6()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];     
        for(int i = 0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        int smax = ar[1];
        
        if(smax>max){
            int t = smax;
            smax = max;
            max = t;
        }
        
        for(int i =2;i<5;i++){
            if(ar[i] < max && ar[i] > smax){
                smax = ar[i];
            }
            if(ar[i] > max) {
                smax = max;
                max = ar[i];
                
            }
        }
        System.out.println(smax);
        
    }
    public static void main(String[] args)
    {
        ArrayExample6 obj = new ArrayExample6();
    }
}
