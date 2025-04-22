import java.util.Scanner;

public class task16 {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = Sc.nextInt();
        System.out.println("enter the second number:");
        int b = Sc.nextInt();
        System.out.println("enter the operation(+,-,*,/):");
        char op= Sc.next().charAt(0);
        switch (op){
            case '+':
            System.out.println("the sum of two numbers is:" + (a+b));
            break;
            case '-':
            System.out.println("the difference of two numbers is:" + (a-b));
            break;
            case '*':
            System.out.println("the product of two numbers is:" + (a*b));
            break;
            case '/':
            if (b!=0){
                System.out.println("the division of two numbers is:" + (a/b));
            }
            else {
                System.out.println("division by zero is not allowed");
            }
                break;
         
 }
 Sc.close();
}  
}
    

