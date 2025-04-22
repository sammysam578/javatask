import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a  alphabet character: ");
        char ch = Scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet letter.");
        }

        Scanner.close();
    }
}

    

