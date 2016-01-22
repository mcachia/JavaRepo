package HomeWork.BubbleSortAsc;

import java.util.List;

/**
 * Implement BubbleSort
 * using Lists
 * (never do this in real life, calling Collections.sort(list) is enough
 * so given 5 1 4 2 8 like this:
 * list.add(5)
 * list.add(1)
 * list.add(4)
 * list.add(2)
 * list.add(8)
 * I call sortIt(list)
 * and if I print out the list it should show them in the correct order
 * Created by mcachia on 21/01/2016.
 */
public class BubbleSort {


    public void sort(List<Integer> myNumbers) {
        boolean swap = false;
        int counter = 0;
        do {
            swap = false;
            for (int i = 0; i < myNumbers.size() - 1; i++) {
                counter++;
                int currentNumber = myNumbers.get(i);
                System.out.println("current=" + currentNumber);
                int nextNumber = myNumbers.get(i + 1);
                if (currentNumber > nextNumber) {
                    myNumbers.set(i, nextNumber);
                    myNumbers.set(i + 1, currentNumber);
                    swap = true;

                }

                System.out.println(myNumbers);
                System.out.println(counter);
            }


        } while (swap);


    }


}





