import java.util.Scanner;

public class E2 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String str1, str2, res;
    boolean shouldContinue;

    do {
      System.out.print("Ciąg 1: ");
      str1 = scanner.next();

      System.out.print("Ciąg 2: ");
      str2 = scanner.next();

      int comparisonResult = str1.compareTo(str2);

      if (comparisonResult < 0) {
        res = str1;
      } else if (comparisonResult > 0) {
        res = str2;
      } else {
        res = "Ciągi są leksykograficznie równe";
      }

      System.out.println("Wynik: " + res);
      System.out.print("Czy chcesz kontynuować? (T/*): ");

      shouldContinue = String.valueOf(scanner.next().charAt(0)).toLowerCase().equals("t");
    } while (shouldContinue);

    scanner.close();
  }
}
