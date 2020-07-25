import java.util.concurrent.ThreadLocalRandom;

public class E9 {
  public static void main(String[] args) throws Exception {
    int[] middleRangeMeshes = getMeshNumbersFromRange(1000);
    int[] targetRangeMeshes = getMeshNumbersFromRange(10000);

    System.out.println("Wylosowane oczka dla 1000 rzutów:");

    for (int i = 0; i < middleRangeMeshes.length; i++) {
      System.out.println("Oczko " + (i + 1) + " wypadło " + middleRangeMeshes[i] + " razy");
    }

    System.out.println("\nWylosowane oczka dla 10000 rzutów:");

    for (int i = 0; i < targetRangeMeshes.length; i++) {
      System.out.println("Oczko " + (i + 1) + " wypadło " + targetRangeMeshes[i] + " razy");
    }
  }

  private static int[] getMeshNumbersFromRange(int range) {
    int[] meshCounters = new int[6];
    int roll;

    for (int i = 0; i < meshCounters.length; i++) {
      meshCounters[i] = 0;
    }

    for (int i = 0; i < range; i++) {
      roll = ThreadLocalRandom.current().nextInt(1, 6 + 1);

      switch (roll) {
        case 1:
          meshCounters[0]++;
          break;
        case 2:
          meshCounters[1]++;
          break;
        case 3:
          meshCounters[2]++;
          break;
        case 4:
          meshCounters[3]++;
          break;
        case 5:
          meshCounters[4]++;
          break;
        case 6:
          meshCounters[5]++;
          break;
      }

    }

    return meshCounters;
  }
}