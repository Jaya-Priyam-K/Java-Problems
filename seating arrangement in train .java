/* The entire vehicle could be viewed as an arrangement of consecutive blocks of size eight. Each of these size-8 blocks are further arranged as:
1 Lower Berth, 2 Middle Berth, 3 Upper Berth, 4 Lower Berth, 5 Middle Berth, 6 Upper Berth, 7 Side Lower, 8 Side Upper. 
The following berths in the vehicle are called pairs. 1 Lower Berth and 4 Lower Berth, 2 Middle Berth and 5 Middle Berth, 3 Upper Berth and 6 Upper Berth & 7 Lower Berth and 8 Upper Berth 
and the pattern is repeated for every set of 8 berths.
Karthick and Kumar are playing this game of finding the pair of each berth. Can you write a program to do the same?
Sample Input  Sample Output 
3
6UB
 Sample Input  Sample Output 
72  
71SL   */
import java.util.*;
public class evenMember{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sol = n%8;
        switch(sol){
            case 0: System.out.print(n-1 +"SL"); break;
            case 1: System.out.print(n+3 +"LB"); break;
            case 2: System.out.print(n+3 +"MB"); break;
            case 3: System.out.print(n+3 +"UB"); break;
            case 4: System.out.print(n-3 +"UB"); break;
            case 5: System.out.print(n-3 +"MB"); break;
            case 6: System.out.print(n-3 +"UB"); break;
            case 7: System.out.print(n+1 +"SU"); break;
        }
        
        
    }
}
