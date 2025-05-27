import java.util.Scanner;

public class CapitalizeFirstLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder result = new StringBuilder();

        boolean capitalizeNext = true;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isWhitespace(ch)) {
                result.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
