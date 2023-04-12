package Class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        //print 25 20 10 15 5 using while loop

        int counter = 25;

        while (counter >= 5) {
            System.out.print(counter + " ");
            counter -= 5;

            //print 25 20 10 5 using while loop and if condition

            int counter1 = 25;
            while (counter1>=5) {
                if (counter1!=15) {
                    System.out.println(counter1+ " ");

                }
                counter1-=5;
            }

            }
        }

    }
