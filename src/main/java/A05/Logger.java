package A05;

import java.io.*;

public class Logger {

    private static Logger instance;
    private Writer writer = new FileWriter("default.txt");
    private BufferedWriter bufferedWriter = new BufferedWriter(writer);

    private Logger() throws IOException {
    };

    public static Logger getInstance() throws IOException {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setName(String name) throws IOException {
        writer.close();
        this.writer = new FileWriter(name);
        this.bufferedWriter = new BufferedWriter(writer);
    }

    public void write(String text) throws IOException {
        bufferedWriter.write(text);
        bufferedWriter.newLine();
    }

    public void close() throws IOException {
        bufferedWriter.close();
    }

}
