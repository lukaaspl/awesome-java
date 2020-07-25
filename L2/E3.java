import java.util.concurrent.ThreadLocalRandom;

public class E3 {
  public static void main(String[] args) throws Exception {
    int roll = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    System.out.println("Wyrzucono " + roll);
  }
}