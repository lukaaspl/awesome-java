import java.util.Scanner;

public class E10 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
    int vowelsCounter = 0;
    String input;

    System.out.print("Wpisz ciąg: ");
    input = scanner.nextLine();

    char[] letters = new char[input.length()];
    input.getChars(0, input.length(), letters, 0);

    for (char letter : letters) {
      for (char vowel : vowels) {
        if (letter == vowel) {
          vowelsCounter++;
        }
      }
    }

    System.out.println("Tekst liczy " + vowelsCounter + " samogłosek.");
    scanner.close();
  }
}
