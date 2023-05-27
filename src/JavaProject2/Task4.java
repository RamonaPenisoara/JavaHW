package JavaProject2;

public class Task4 {
    /* Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams

     */
    public static void main(String[] args) {
        System.out.println(anagram("listen","silent"));
    }

    static boolean anagram(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(String.valueOf(a.charAt(i)))) {
                return false;
            }


        }
        return true;
    }

}