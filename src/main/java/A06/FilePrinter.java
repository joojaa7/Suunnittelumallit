package A06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator{

    private BufferedWriter bufferedWriter;

    public FilePrinter(Printer printer){
        super(printer);
        try {
            FileWriter writer = new FileWriter("text.txt");
            bufferedWriter = new BufferedWriter(writer);
        } catch (IOException e){
            System.out.println();
        }
    }

    @Override
    public void print(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println();
        }
    }

}
