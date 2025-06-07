import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int sum = 0;
        char[] a = s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {
            a[i] = Character.toLowerCase(a[i]);
            if(a[i]>='a' && a[i]<='z')
            {
                if(n==0)
                {
                    if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u')
                    {
                        sum += a[i]-'a'+1;
                    }
                }
                else if(n==1)
                {
                    sum += a[i]-'a'+1;
                }
            }
            
        }
        System.out.print(sum);
        
       
    }
}
