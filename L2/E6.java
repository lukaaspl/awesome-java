import java.util.concurrent.ThreadLocalRandom;

public class E6 {
  public static void main(String[] args) throws Exception {
    int[][] collection1 = new int[5][5], collection2 = new int[5][5];
    int[][][] results = new int[3][5][5];
    int randomNumber1, randomNumber2;

    for (int i = 0; i < collection1.length; i++) {
      for (int j = 0; j < collection1[i].length; j++) {
        randomNumber1 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        randomNumber2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        collection1[i][j] = randomNumber1;
        collection2[i][j] = randomNumber2;
      }
    }

    for (int k = 0; k < results.length; k++) {
      for (int u = 0; u < collection1.length; u++) {
        for (int r = 0; r < collection2.length; r++) {
          switch (k) {
            case 0:
              results[k][u][r] = collection1[u][r] + collection2[u][r];
              break;
            case 1:
              results[k][u][r] = collection1[u][r] - collection2[u][r];
              break;
            case 2:
              results[k][u][r] = collection1[u][r] * collection2[u][r];
              break;
          }

        }
      }

      for (int w = 0; w < collection1.length; w++) {
        System.out.println();

        for (int a = 0; a < collection2.length; a++) {
          System.out.print(results[k][w][a] + "\t");
        }
      }

      System.out.println("\n");
    }
  }
}