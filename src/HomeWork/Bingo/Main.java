package HomeWork.Bingo;

import java.util.HashSet;

/**
 * Created by mcachia on 25/01/2016.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        NumberGenerator generator = new NumberGenerator();

        while (set.size() < 100) {
            set.add(generator.generate());
        }

        for (Integer i : set) {
            System.out.println(i);
        }


    }
}
