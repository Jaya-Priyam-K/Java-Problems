import java.util.Scanner;

public class MonthFromDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String date = scanner.nextLine();
        
        String[] parts = date.split("-");
        int mon = Integer.parseInt(parts[1].trim());

        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
      
        if (monthIndex >= 1 && monthIndex <= 12) {
            System.out.println(monthNames[mon - 1]);
        } else {
            System.out.println("Invalid month");
        }

        scanner.close();
    }
}
