import java.util.concurrent.ThreadLocalRandom;

public class E5 {
  public static void main(String[] args) throws Exception {
    int middleRange = 1000, targetRange = 10000;
    int middleRangeCounter = 0, targetRangeCounter = 0;
    int roll;

    for (int i = 0; i < targetRange; i++) {
      roll = ThreadLocalRandom.current().nextInt(1, 6 + 1);

      if (i < middleRange) {
        if (roll == 3) {
          middleRangeCounter++;
        }
      }

      if (roll == 3) {
        targetRangeCounter++;
      }
    }

    System.out
        .println("Dla zakresu " + middleRange + " liczba oczek 3 została wylosowana " + middleRangeCounter + " razy");
    System.out
        .println("Dla zakresu " + targetRange + " liczba oczek 3 została wylosowana " + targetRangeCounter + " razy");
  }
}