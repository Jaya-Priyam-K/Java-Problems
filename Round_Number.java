
import java.util.*;
class Main {
    
    public static int sum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int u = num%10;
            sum += u*u;
            num /= 10;
        }
        return sum;
    }
    
    public static boolean isRound(int n)
    {
        Set<Integer> seen = new HashSet<>();
        while( n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n = sum(n);
        }
        
        return n==1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isRound(n))
        {
            System.out.print("Round");
        }
        else
        {
            System.out.print("Not Round");
        }
    }
}
