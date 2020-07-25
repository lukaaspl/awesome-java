import java.util.Scanner;

public class E2 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj dowolny znak: ");

    char sign = scanner.next().charAt(0);
    int charCode = (int) sign;

    System.out.println("Wyprowadzający na ekran: " + sign + " " + charCode);
    scanner.close();
  }
}