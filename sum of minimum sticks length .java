/* Mukesh and his friends have set out on a vacation to Coorg. They have booked accommodation in a resort and the resort authorities organize Campfires every night as a part of their daily activities. 
Mukesh volunteered himself for an activity called the "Adjacent Stick Game" where sticks of different lengths will be placed in a line and Mukesh needs to remove a stick from each adjacent pair of sticks.
He then has to form a bigger stick by combining all the remaining sticks.Mukesh needs to know the smallest length of the bigger stick so formed and needs your help to compute the same. 
Given the number of sticks N and the lengths of each of the sticks, write a program to find the smallest length of the bigger stick that is formed.
Sample test cases :Input 1 :
4
2 1 3 1
Output 1 :
2
Input 2 :
4
2 5 4  1
Output 2 :
3
  */
import java.util.*;
public class evenMember{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i+=2)
        {
            if(arr[i]<arr[i+1])
            {
                sum +=arr[i];
            }
            else
            {
                sum +=arr[i+1];
            }
        }
        System.out.print(sum);
        
        
        
        
    }
}
