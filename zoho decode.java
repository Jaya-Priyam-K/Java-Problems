import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mul =1;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            mul *= arr[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(mul/arr[i] + " ");
        }
        
    }
}
