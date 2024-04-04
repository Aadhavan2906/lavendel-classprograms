import java.util.*;

public class Main{
    static boolean valid = false;
    static void solver(int money , int mul)
    {
        if(money < mul)return;
        if(money == mul){ valid = true; return;}
        solver(money , mul * 10);
        solver(money , mul * 20);
        return;
    }
public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        String validity[] = new String[t];
       for(int i=0;i<t;i++)
       {
           valid = false;
           solver(sc.nextInt() , 1 );
           validity[i] = (valid) ? "Yes" : "No";
       }
       for(int i=0;i<t;i++)
        System.out.print(validity[i] + " ");
    }
}
    