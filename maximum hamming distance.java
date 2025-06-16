
/* Kathir went for carnival. He was given many balls of white and black colors. During the play, he arranged the balls into two rows both consisting of N number of balls.
These two rows of balls are given to you in the form of strings X, Y. Both these strings consist of 'W' and 'B', where 'W' denotes a white-colored ball and 'B' a black colored.
Other than these two rows of balls, Charlie has an infinite supply of extra balls of each color. He wants to create another row of N balls, 
Z in such a way that the sum of Hamming distance between X and Z, and hamming distance between Y and Z is maximized.
Hamming Distance between two strings X and Y is defined as the number of positions where the color of balls in row X differs from the row Y ball at that position.
e.g. Hamming distance between "WBB", "BWB" is 2, as, at positions 1 and 2, corresponding colors in the two strings differ. 
As there can be multiple such arrangements of row Z, Charlie wants you to find the lexicographically smallest arrangement which will maximize the above value.
Sample Input
WBWB->x
WBBB->y
output
BWWW
 Sample Input  Sample Output 
input:
WBBWBWBWBB
WWWWWWWWWW 
output:
BBBBBBBBBB
*/
import java.util.*;

class Main {
    
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)=='W' && s2.charAt(i)=='W')
            {
                sb.append('B');
            }
            else if(s1.charAt(i)=='B' && s2.charAt(i)=='B')
            {
                sb.append('W');
            }
            else
            {
                sb.append('B');
            }
        }
        System.out.print(sb.toString());
    }
    
}
