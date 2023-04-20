package SDETProject;

public class Project4 {
    /*Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.*/
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 3, 5, 10, 15},
                {20, 25, 30, 35, 40},
                {5, 7, 10, 20, 10}
        };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even += numbers[i][j];
                } else {
                    odd += numbers[i][j];
                }
            }
        }
        System.out.println("even = " + even + " odd " + odd);
    }
}
