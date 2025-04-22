import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("is positive");
        }
        else if (a<0) {
            System.out.println("is negative");   
        }
        else{
            System.out.println("is zero");
        }
    }

}
    
