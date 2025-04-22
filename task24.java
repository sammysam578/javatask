import java.util.Scanner;

public class task24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number n:");
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.println("fibonacci series upto " + n );
        for (int i=0; i<n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("sum of fibonacci series upto " + n + " is: " + a);
        sc.close();
    }
}
    

