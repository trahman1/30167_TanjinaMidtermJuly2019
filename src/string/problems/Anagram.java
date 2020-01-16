package string.problems;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(ifAnagram("CAT","ACT"));
        System.out.println(ifAnagram("ARMY","MARY"));
    }
   public static boolean ifAnagram(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }
      char[] firstArray= firstWord.toLowerCase().toCharArray();
        char[] secondArray= secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for(int i=0;i<firstArray.length;i++){
            if(firstArray[i] !=secondArray[i]){
                return false;
            }
        }
        return true;

   }


}
