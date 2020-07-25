import java.io.BufferedReader;
import java.io.FileReader;

public class E1 {
  public static void main(String[] args) throws Exception {
    String path = "./wyrazy.txt";
    BufferedReader reader;

    try {
      reader = new BufferedReader(new FileReader(path));

      String line = reader.readLine();
      String prevLine;

      while (line != null) {
        prevLine = line;
        line = reader.readLine();

        if (line == null) {
          System.out.println("Skończono działanie");
        } else if (line.equals(prevLine)) {
          System.out.println("Wykryto taki sam wyraz: " + line);
          break;
        }
      }

      reader.close();
    } catch (Exception e) {
      System.out.println("Nie znaleziono pliku: " + path);
    }
  }
}
