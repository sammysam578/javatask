import java.util.Scanner;

public class task25 {
     public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a numbers");
        int a = sc.nextInt();
        int count = 0;
        for (int i=1; i<=a; i++){
            if (a%i==0){
                count++;
            }
        }
        System.out.println("number of digits in " + a + " is: " + count);
        sc.close();
    }
    
}
