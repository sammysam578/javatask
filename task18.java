import java.util.Scanner;

public class task18 {
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = Sc.nextInt();

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("31 days");
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("30 days");
                break;

            case 2:  // February
                System.out.println("28 days (29 in a leap year)");
                break;

            default:
                System.out.println("Invalid month number. Please enter a number from 1 to 12.");
        }

        Sc.close();
    }
    
}
