import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        if (age > 18){
            System.out.println("You can vote");   
        } else{
            System.out.println("You cannot vote");

        }
    
    
}
}
