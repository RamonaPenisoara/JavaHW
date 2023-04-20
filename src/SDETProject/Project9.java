package SDETProject;

public class Project9 {
    /*9. Write a java program to find the second largest
number in the array */
    public static void main(String[] args) {
        int[] numbers ={1,3,5,7,9,20};
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<numbers.length;i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
            for(int j=0;j<numbers.length;j++) {
                if (secondLargest < numbers[j] && numbers[j]!=largest) {
                    secondLargest = numbers[j];
                }


        }
        System.out.println("secondLargest = "+secondLargest);
        
    }
}
