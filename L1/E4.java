public class E4 {
  public static void main(String[] args) throws Exception {
    int startingPoints = 60; // Punkty startowe 60

    // Odległość (1.2 pkt za metr)
    int metersJumped = 91;
    float pointPerMeter = 1.2f;
    int distancePoints = (int) pointPerMeter * metersJumped;

    // Faza lotu (od -10 do 0)
    int flightPoints = -8;

    // Faza lądowania (od -5 do 0)
    boolean landed = false;
    int landingPoints = (landed ? 0 : -5);

    // Faza odjazdu (od -15 do 0)
    int phaseOutPoints = -15;

    int achievedPoints = (startingPoints + distancePoints + flightPoints + landingPoints + phaseOutPoints);

    System.out.println("Punkty startowe: " + startingPoints);
    System.out.println("Punkty za odległość: " + distancePoints);
    System.out.println("Punkty za lot: " + flightPoints);
    System.out.println("Punkty za ladowanie: " + landingPoints);
    System.out.println("Punkty za odjazd: " + phaseOutPoints);
    System.out.println("Zdobyte punkty: " + achievedPoints);
  }
}