// 11 25 50 30 35 10 20 10 40 28 
// 70 80 10 20 60 40 50 100 90 100
/* Maya, excited by the carnival atmosphere, decides to test her luck at the Ring Toss booth, aiming to win a special prize. 
The game consists of ten rounds, each rewarding points based on the number of rings successfully tossed onto bottles. 
After completing all rounds, her scores notes down  forming an array of points. To win the grand prize, she must get
the difference between the second minimum and second maximum scores as a prime number. If this difference is a prime number, Maya will be declared the winner.
Given Maya's scores from the ten rounds, determine whether she wins the grand prize or not.

Sample Case 1:
 11 25 50 30 35 10 20 10 40 28 
Output: Win 
Sample Case 2: 
 70 80 10 20 60 40 50 100 90 100
Output: Loss */
import java.util.*;

class Main {
    
    public static boolean prime(int n)
    {
        if(n==1) return false;
        for(int i=2; i*i <= n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sl = Integer.MIN_VALUE;
        int ss = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<min)
            {
                ss = min;
                min = arr[i];
            }
            else if(arr[i]<ss && arr[i]>min)
            {
                ss = arr[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]>max)
            {
                sl = max;
                max = arr[i];
            }
            else if(arr[i]>sl && arr[i]<max)
            {
                sl = arr[i];
            }
        }
        int diff = sl - ss;
        if(prime(diff))
        {
            System.out.print("Win");
        }
        else
        {
            System.out.print("Loss");
        }
        
    }
}
