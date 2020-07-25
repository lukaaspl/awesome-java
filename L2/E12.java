import java.util.Scanner;

public class E12 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    float number1, number2, result;
    char operator;

    System.out.print("Podaj równanie w formacie [liczba1] [operator] [liczba2]: ");

    number1 = scanner.nextFloat();
    operator = scanner.next().charAt(0);
    number2 = scanner.nextFloat();

    try {
      switch (operator) {
        case '+':
          result = number1 + number2;
          break;
        case '-':
          result = number1 - number2;
          break;
        case '*':
          result = number1 * number2;
          break;
        case '/':
          if (number2 == 0) {
            scanner.close();
            throw new Exception("Divider cannot be 0");
          }
          result = number1 / number2;
          break;
        default:
          scanner.close();
          throw new Exception("Invalid operator");
      }

      System.out.print("Wynik: " + number1 + " " + operator + " " + number2 + " = " + result);
    } catch (Exception e) {
      System.out.print("W trakcie działania programu wystąpił błąd: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
