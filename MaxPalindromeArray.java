import java.util.*;

public class Main{
    static int findPalindrome(int size)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
      int i = 0, j = arr.length-1, count = 0;
      while(i <= j)
      {
          if(arr[i] == arr[j])
          {
              i++;j--;
          }
          else if(arr[i] < arr[j])
          {
              i++;count++;
              arr[i]+=arr[i-1];
          }
          else if(arr[i] > arr[j])
          {
              j--;count++;
              arr[j] += arr[j+1];
          }
      }
      return count;
    }
public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int times = sc.nextInt();
       int arr[] = new int[times];
       for(int i=0;i<times;i++)
           arr[i] = findPalindrome(sc.nextInt());
        for(int i=0;i<times;i++)
            System.out.print(arr[i] + " ");
       
    }
}
    