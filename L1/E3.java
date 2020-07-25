import java.util.Scanner;

public class E3 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int a, h;

    System.out.print("Podstawa: ");
    a = scanner.nextInt();

    System.out.print("Wysokość: ");
    h = scanner.nextInt();

    System.out.println("Pole trójkąta: " + (a * h / 2));
    scanner.close();
  }
}