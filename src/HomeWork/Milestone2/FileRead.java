package HomeWork.Milestone2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mcachia on 30/05/2016.
 */
public class FileRead {

    public void readFromFile() throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader("C:\\Users\\mcachia\\Desktop\\cs-cci.xls"));
        String line;

        while ((line = readFile.readLine()) != null) {
            System.out.println(line);
        }

        readFile.close();

    }
}
