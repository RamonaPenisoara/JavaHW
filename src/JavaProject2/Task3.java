package JavaProject2;

public class Task3 {
    /* Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

     */
    public static void main(String[] args) {
        System.out.println(wordsCount("Hello, world!"));

    }
    static int wordsCount(String s){
        String[] arr=s.split(" ");
        return arr.length;


        }
    }
