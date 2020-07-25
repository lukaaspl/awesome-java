import java.util.concurrent.ThreadLocalRandom;

public class E4 {
  public static void main(String[] args) throws Exception {
    String[] characters = { "Smok", "Czarnoksiężnik", "Gladiator" };
    int randomIndex = ThreadLocalRandom.current().nextInt(0, characters.length);

    System.out.println("Wylosowana postać: " + characters[randomIndex]);
  }
}