import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            ans[i] = arr[i]-ans[i+1];
        }
        int sum =0;
        for(int i=0; i<n; i++)
        {
            sum += ans[i];
        }
        System.out.println(ans[0]);
        System.out.print(sum);
    }
}
