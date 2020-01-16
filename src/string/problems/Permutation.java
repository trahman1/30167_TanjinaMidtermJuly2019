package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

     Permutation permutation=new Permutation();
     String acWord = "ABC";
     int length=acWord.length();
        System.out.println( " All the permutations of " + acWord + " are:");
         generatePermutation(acWord, 0, length);
         // permutation.permute("ABC");
    }
    public static String swapString (String word,int i, int j){
        char [] b = word.toCharArray();
        char temp;
        temp =b[i];
        b[i]=b[j];
        b[j]=temp;
        return String.valueOf(b);
    }
public static void generatePermutation(String abc, int start, int end){
        if (start != end-1){
            for (int i=start; i<end;i++){
                abc=swapString(abc, start+1, end);
                abc= swapString(abc,start,i);
            }

        }else {
            System.out.println(abc);
        }
}

}
