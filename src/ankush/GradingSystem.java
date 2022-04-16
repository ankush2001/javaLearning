package ankush;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();
        if(marks>=70){
            System.out.println("Grade : A");
        }else if(marks>=60 && marks<70){
            System.out.println("Grade : B");
        }else if(marks<60 && marks>50){
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Grade : D");
        }
    }
}
