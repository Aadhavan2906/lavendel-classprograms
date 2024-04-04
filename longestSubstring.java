import java.util.*;
public class Main{
    
public static void main (String[] args) {
       String str = "abcbbcdefbabcd";
       int arr[] = new int[26];
       int i=0,j=0 , length=0; String ans = "";
       while(j < str.length())
       {
           arr[str.charAt(j)-'a']++;
           while(i < str.length() && arr[str.charAt(j)-'a'] >= 2)
           {
               arr[str.charAt(i)-'a']--;
               i++;
           }
           if(j - i+1 > length)
           {
            length = j - i + 1;
            ans = str.substring(i , j+1);
           }
            j++;
       }
       System.out.print(ans);
    }
}