import java.util.Scanner;

public class task23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int original_num = sc.nextInt();
        int rev = 0;
        for (int num = original_num; num !=0; num /= 10) {
            rev = rev * 10 + num % 10; // Build the reversed number
        }
        if (original_num == rev) {
            System.out.println(original_num +" is a palindrome.");
        } else {
            System.out.println(original_num +" is not a palindrome.");
        }
        sc.close();
    }
}
    

