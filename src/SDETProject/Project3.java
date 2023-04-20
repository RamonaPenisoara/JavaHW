package SDETProject;

public class Project3 {
    /* Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.*/
    public static void main(String[] args) {
        int[] numbers = {
                2, 4, 7, 9, 10, 15,
                10, 20, 35, 40, 60, 70
        };
        int[][] evenOdd = new int[2][12];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenOdd[0][even] = numbers[i];
                even++;
            }
            else  {
                evenOdd[1][odd] = numbers[i];
                odd++;

            }
        }
        for(int i=0;i<evenOdd[0].length;i++){
            System.out.print(evenOdd[0][i]);
        }
        System.out.println();



        }


    }

