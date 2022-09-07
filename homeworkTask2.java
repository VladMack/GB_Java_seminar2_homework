import java.io.*;
import java.util.logging.Logger;

public class homeworkTask2 {
    public static void main(String[] args) throws IOException {
        logger(getText(new File("students.txt")));
    }

    public static String getText(File file) throws FileNotFoundException {
        StringBuilder text = new StringBuilder("");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = bf.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                text.append(String.format("\nУченик %s получил сегодня %s", data[0], data[1]));
                line = bf.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(text);
    }

    public static void logger(String message) {
        Logger l = Logger.getAnonymousLogger();
        l.info(message);
    }
}