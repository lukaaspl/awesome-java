import java.util.Scanner;

public class E11 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    char[] signsToDetect = { 'a', 'e', 'i', 'o', 'u', 'y', '\n', '\t', ' ' };
    int detectedSignsCounter = 0;
    String input;

    System.out.print("Wpisz ciąg: ");
    input = scanner.nextLine();

    char[] signs = new char[input.length()];
    input.getChars(0, input.length(), signs, 0);

    for (char sign : signs) {
      for (char signToDetect : signsToDetect) {
        if (sign == signToDetect) {
          detectedSignsCounter++;
        }
      }
    }

    System.out.println("Tekst liczy " + detectedSignsCounter
        + " znaków specjalnych (samogłoski, znaki tabulacji, nowego wiersza oraz spacji).");

    scanner.close();
  }
}
