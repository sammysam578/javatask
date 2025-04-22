import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Sc.next().toLowerCase().charAt(0); 

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }

        Sc.close();
    }
    
}
