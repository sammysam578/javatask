import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = Scanner.nextInt();

        int sum = 0;
        int originalNumber = number; 

        int numDigits = (int) Math.log10(number) + 1;

        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;   
            sum += digit;             
            number /= 10;              
        }

        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

        Scanner.close();
    }
}

    

