import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class homeworkTask1 {
    public static void main(String[] args) throws IOException {
        writeFile(getText(100, "test"));
    }

    public static String getText(int number, String text){
        StringBuilder resultText = new StringBuilder("");
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                resultText.append(text.toUpperCase());
            } else {
                resultText.append(text.toLowerCase());
            }
        }
        return String.valueOf(resultText);
    }

    public static void writeFile(String text) throws IOException {
        Logger l = Logger.getAnonymousLogger();
        FileWriter fw = new FileWriter("testResult.txt", false);
        try {
            fw.write(text);
            fw.flush();
            fw.close();
            l.info("Файл записан.");
        } catch (IOException e) {
            l.warning(e.getMessage());
        }
    }
}