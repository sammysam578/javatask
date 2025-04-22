import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3, s4, s5, total;
        double percentage;
        String grade;

        System.out.println("Enter marks out of 100:");

        System.out.print("Maths: ");
        s1 = sc.nextInt();

        System.out.print("English: ");
        s2 = sc.nextInt();

        System.out.print("Science: ");
        s3 = sc.nextInt();

        System.out.print("Nepali: ");
        s4 = sc.nextInt();

        System.out.print("Arts: ");
        s5 = sc.nextInt();

        total = s1 + s2 + s3 + s4 + s5;
        percentage = total / 5.0;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


    
