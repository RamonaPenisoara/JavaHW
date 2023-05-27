package JavaProject2;

public class Task2 {
    /* Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
*/
    public static void main(String[] args) {
        System.out.println(palindrome("madam"));


    }

    static boolean palindrome(String p) {
        String string = "";
        for (int i = p.length() - 1; i >= 0; i--) {
            string += p.charAt(i);

        }
        if(p.equals(string)){
            return true;
        }
        return false;
    }
}