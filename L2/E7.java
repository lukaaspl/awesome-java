public class E7 {
  public static void main(String[] args) throws Exception {
    int result = getFib(5) + getFib(7);
    System.out.println("Wynik: " + result);
  }

  private static int getFib(int n) {
    return n < 3 ? 1 : getFib(n - 2) + getFib(n - 1);
  }
}