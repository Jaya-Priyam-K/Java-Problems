/* Singing Champs" is a famous reality series. The show organizers have planned to roll out the show’s 5th season in the coming month.
The auditions for the show is announced at various Cities widely and the organizers have inaugurated the first audition today.
Large mass of people gathered at the venue. Based on the selection procedure for the first level, all the people are made to stand in a queue.
Participants who are standing in the even positions of the queue are selected  initially. 
Of the selected people a queue is formed and again out of these only people on even position are selected. This continues until we are left with one person. 
To help them in the selection procedure, the organizers approached you to write a recursive method for determining the position of that final person in the original queue.
Sample test cases :
Input 1 :
5   -> 4        20->16            198->128       99->64 */
import java.util.*;
public class evenMember{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sol = 1;
        while(sol*2 <= n)
        {
            sol = sol*2 ;
        }
        System.out.print(sol);
        
        
    }
}
