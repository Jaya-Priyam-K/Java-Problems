import java.util.Scanner;

public class CommonSuffixPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S1 = sc.nextLine().trim();
        String S2 = sc.nextLine().trim();

        int minLen = Math.min(S1.length(), S2.length());
        String common = "";

        for (int i = 1; i <= minLen; i++) {
            String sub1 = S1.substring(S1.length() - i);
            String sub2 = S2.substring(0, i);

            if (sub1.equals(sub2)) {
                common = sub1;
            }
        }

        System.out.println(common);
        sc.close();
    }
}
