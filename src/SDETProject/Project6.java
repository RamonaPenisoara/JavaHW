package SDETProject;

public class Project6 {
    /*Write a java program to check whether a given
number is prime or not*/
    public static void main(String[] args) {
        int number=37;
        for(int i=(number-1);i>1;i--){
            if(number%i==0){
                System.out.println("not a prime number");
            return;
            }
        }
        System.out.println("it is prime number");
    }
}
