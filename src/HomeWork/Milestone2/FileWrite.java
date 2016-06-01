package HomeWork.Milestone2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mcachia on 31/05/2016.
 */
public class FileWrite {
    public void writeToFile() throws IOException {
        String content = "Typical Value";
        File file = new File("markStockValues.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();

    }
}
