package SDETProject;

public class Project1 {
    /*Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
     */
    public static void main(String[] args) {
        int[] numbers={90,80,70,60,50};
        int highest=0;
        int lowest=100;
        for(int i=0;i< numbers.length;i++){
            if (highest<numbers[i]) {
                highest=numbers[i];

            }
            if(lowest>numbers[i]){
                lowest=numbers[i];
            }
        }
        System.out.println("highest = " + highest+ " lowest = " + lowest );
    }

}

