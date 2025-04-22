import java.util.Scanner;

public class task15 {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter any number for the factorial:");
        int a = Sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("the factorial is"+fact);
        Sc.close();
    }
 
   
}
    
