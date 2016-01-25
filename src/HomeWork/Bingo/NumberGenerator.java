package HomeWork.Bingo;

import java.security.SecureRandom;

/**
 * 1) Generate random numbers like this:
 SecureRandom secureRandom = new SecureRandom();
 secureRandom.nextInt(90);    // <<— this line generates a random number from 0-90
 2) Create a HashSet. Generate 100 random unique numbers and insert them in the hashset. Since no duplicates are allowed,
 keep repeating the number generation until the size of the set is 100
 3) Change the implementation of HashSet to read LinkedHashSet instead. When you print out all the numbers in the set,
 notice how the order in which the numbers were inserted is maintained
 4) Change the implementation of HashSet to read TreeSet instead. When you print out all the numbers in the set,
 they should come out all sorted reminder to iterate and print out all numbers:
 for (Integer i: someSetVariable){
 System.out.println(i);
 }
 * Created by mcachia on 25/01/2016.
 */
public class NumberGenerator {
    public int generate() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(100);
    }
}
