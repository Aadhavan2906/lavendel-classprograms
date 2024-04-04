import java.util.*;

public class Main{
    private static int divisor(int a , int b)
    {
        while(a % b == 0)
            a /= b;
        return a;
    }
    private static boolean isUgly(int num)
    {
        num = divisor(num , 2);
        num = divisor(num , 3);
        num = divisor(num , 5);
        return (num == 1) ? true : false;
    }
    private static int ans(int n)
    {
       int start = 0 , i = 1;
       while( start < n)
       {
           if(isUgly(i))
           {
               start++;
           }
           if(start < n)
            i++;
       }
        return i;
    }
public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int arr[] = new int[t];
       for(int i=0;i<t;i++)
        arr[i] = ans(sc.nextInt());
       for(int i=0;i<t;i++)
        System.out.print(arr[i] + " ");
        
    }
}
    