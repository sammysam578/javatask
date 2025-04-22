import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();

        System.out.println("Enter second number:");
        int b= sc.nextInt();

        int sum=a+b;
        System.out.println("the sum of 2 number is:"+sum);
        int diff=a-b;
        System.out.println("the difference of 2 number is:"+diff);
        int product=a*b;
        System.out.println("the product of 2 number is:"+product);
        int quotient=a%b;
        System.out.println("the quotient of 2 number is:"+quotient);
    }
       
}
