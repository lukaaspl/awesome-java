import java.util.Scanner;

public class E13 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int option;

    System.out.println("MENU");
    System.out.println("====");

    for (int i = 0; i < 8; i++) {
      System.out.println((i + 1) + ". Pozycja " + (i + 1));
    }

    try {
      System.out.print("Wybierz opcję: ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.print("Wybrano pozycję 1");
          break;
        case 2:
          System.out.print("Wybrano pozycję 2");
          break;
        case 3:
          System.out.print("Wybrano pozycję 3");
          break;
        case 4:
          System.out.print("Wybrano pozycję 4");
          break;
        case 5:
          System.out.print("Wybrano pozycję 5");
          break;
        case 6:
          System.out.print("Wybrano pozycję 6");
          break;
        case 7:
          System.out.print("Wybrano pozycję 7");
          break;
        case 8:
          System.out.print("Wybrano pozycję 8");
          break;
        default:
          throw new Exception("Choosen option does not exist");
      }
    } catch (Exception e) {
      System.out.print("Podczas trwania programu wystąpił błąd: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
