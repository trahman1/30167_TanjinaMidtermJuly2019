package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println(palindrome1("MOM"));
        System.out.println(palindrome1("DAD"));
        System.out.println(palindrome1("MADAM"));
    }

    public static boolean palindrome1(String word) {
        String actualWord = word.toLowerCase();
        int stPoint = 0;
        int endPoint = actualWord.length() - 1;
        while (stPoint < endPoint) {
            if (actualWord.charAt(stPoint) != actualWord.charAt(endPoint)) {
                return false;
            }
            stPoint++;
            endPoint--;
        }

        return true;

    }
}
