package Class6;

import java.util.Scanner;

public class LogicalOperatorsTask {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.printf("Please enter your height ");
        int height=scanner.nextInt();
        if(height<60) {
            System.out.println("Short");
        }else if(height>=60 && height<=72) {
            System.out.println("Medium");
        }else{
            System.out.println("Tall");

        }
    }
}
