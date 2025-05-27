import java.util.*;

public class CourtLengthDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amountAlen = sc.nextDouble();
        double amountTim = sc.nextDouble();

        double widthAlen = sc.nextDouble();
        double widthTim = sc.nextDouble();

        double costPerSqFt = 5.0;

        double lengthAlen = (amountAlen / costPerSqFt) / widthAlen;
        double lengthTim = (amountTim / costPerSqFt) / widthTim;

        System.out.printf("%.2f\n", Math.abs(lengthAlen - lengthTim));

        sc.close();
    }
}
