package Class7;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //print all numbers from starting point to ending point
        //ask the user for starting and ending number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting and ending point");
        int start=scanner.nextInt();
        int end= scanner.nextInt();
        int number=start;
        while(number<=end){
            System.out.print(number+" ");
            number++;
        }
    }


}
