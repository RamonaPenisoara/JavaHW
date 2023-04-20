package SDETProject;

public class Project2 {
    /*Create an array of integer values.After the array is created,calculate the sum of
    all stored elements in that array.
     */
    public static void main(String[] args) {

        int[] numbers={10,20,35,50,70};
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("sum = "+ sum);
    }
}
