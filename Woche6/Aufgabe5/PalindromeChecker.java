/* Usage:
$ java PalindromeChecker.java Lagerregal Tisch Stift Rentner

These words are palindromes:[Lagerregal, Rentner]
These words are not palindromes:[Tisch, Stift]

*/

// Aufgabe 5

import java.util.Arrays;

public class PalindromeChecker {
  public static void main(String[] args){
    
    // Declares two empty arrays to store the palindromes and non-palindromes later
    String[] polydrom = {};
    String[] regular = {};

    // Loops through the arguments
    for (int i = 0; i < args.length; i++) {

      // Convert the argument to lower case and store it as a char array
      // Uses the toLowerCase() method of the String class
      char[] forwards = args[i].toLowerCase().toCharArray();
      // Declares an empty char array to store the reversed argument later
      char[] backwards = {};

      // Loops through the forwards array from the end to the beginning
      for (int h = forwards.length - 1; h >= 0; h--){
        // Adds one more char to array backwards
        backwards = Arrays.copyOf(backwards, backwards.length + 1);
        backwards[backwards.length - 1] = forwards[h];
      }

      // Checks if the forwards and backwards arrays are equal
      if (Arrays.equals(forwards, backwards)){
        // Adds one more string to array polydrom
        polydrom = Arrays.copyOf(polydrom, polydrom.length + 1);
        polydrom[polydrom.length - 1] = args[i];
      } else {
        // Adds one more String to array regular
        regular = Arrays.copyOf(regular, regular.length + 1);
        regular[regular.length - 1] = args[i];    
      }
    }

  System.out.println("These words are palindromes: " + Arrays.toString(polydrom));
  System.out.println("These words are not palindromes: " + Arrays.toString(regular));

  }
}