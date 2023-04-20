package SDETProject;

public class Project8 {
    /* Maximum and minimum number in the array?*/
    public static void main(String[] args) {
        int[] numbers={10,20,30,50,80};
        int maximum=0;
        int minimum=numbers[0];
        for(int i=0;i< numbers.length;i++){
            if (maximum<numbers[i]) {
                maximum=numbers[i];

            }
            if(minimum>numbers[i]){
                minimum=numbers[i];
            }
        }
        System.out.println("maximum = " + maximum+ " minimum = " + minimum );
    }
    }

