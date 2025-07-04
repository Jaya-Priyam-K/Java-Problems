import java.util.*;

class Main {
    
    public static void prime(int a, int i)
    {
        if(a==1) return;
        while(a%i != 0)
        {
            i++;
        }
        System.out.print(i+" ");
        prime(a/i, i);
        
    }
    
    public static void main(String[] args) 
    {
        int a = 100;
        prime(a, 2);
    }
}
