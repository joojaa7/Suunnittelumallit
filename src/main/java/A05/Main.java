package A05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        logger.setName("tiedosto.txt");
        logger.write("Jee");
        logger.write("Jaa");
        logger.write("Suljettu.");
        logger.close();
    }
}
