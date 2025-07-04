
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the team names : ");
        String[] teams = new String[n];
        for(int i=0; i<n; i++)
        {
            teams[i] = sc.nextLine();
        }
        System.out.println("Enter the number of meetings: ");
        int meets = sc.nextInt();
        List<String[]> matches = new ArrayList<>();
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k=0; k<meets; k++)
                {
                    matches.add(new String[]{teams[i], teams[j]});
                }
            }
        }
        Collections.shuffle(matches);
        int count = 1;
        for(String[] match : matches)
        {
            System.out.println("Match "+count+" : "+match[0]+" vs "+ match[1]);
            count++;
        }
    }
}
