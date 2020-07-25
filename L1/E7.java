public class E7 {
  public static void main(String[] args) throws Exception {
    System.out.println(
        "Zmienna globalna może mieć nazwę o długości max. 31 znaków, a lokalna o długości max. 65535 znaków.\n");
    System.out.println("Ograniczenia na znaki mogące wystąpić w nazwach zmiennych:");
    System.out.println("Nazwa musi zaczynać się od litery, podkreślenia _ bądź znaku dolara $");
    System.out.println("Kolejnymi znakami, poza tym wymienionymi w punkcie 1., mogą być także cyfry.");
    System.out
        .println("Nazwy nie mogą być takie same, jak nazwy zastrzeżone w języku Java (np. class, public, void itd.).");
  }
}