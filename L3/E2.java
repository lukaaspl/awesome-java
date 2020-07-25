import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class E2 {
  public static void main(String[] args) throws Exception {
    Account[] initialAccounts = { new Account("abc", 100f), new Account("def", 200f), new Account("ghi") };
    new ATM(initialAccounts);
  }
}

public class ATM {
  private Scanner scanner = new Scanner(System.in);
  private List<Account> accounts = new ArrayList<Account>();
  private Account currentAccount;

  public ATM(Account[] initialAccounts) {
    for (Account account : initialAccounts) {
      this.accounts.add(account);
    }

    this.getCardDetails();
  }

  public ATM() {
    this.getCardDetails();
  }

  public void getCardDetails() {
    String cardNumber;

    System.out.print("Podaj karte: ");
    cardNumber = this.scanner.nextLine();

    this.verifyCard(cardNumber);
    this.displayMenu();
  }

  public void verifyCard(String cardNumber) {
    final boolean[] accountExists = { false };

    this.accounts.forEach((account) -> {
      if (account.getCardNumber().equals(cardNumber)) {
        accountExists[0] = true;
        this.currentAccount = account;
      }
    });

    if (!accountExists[0]) {
      Account newAccount = new Account(cardNumber);
      this.accounts.add(newAccount);
      this.currentAccount = newAccount;
    }
  }

  public void displayMenu() {
    String option;

    try {
      System.out.println("1. Wyplata");
      System.out.println("2. Stan konta");
      System.out.println("3. Wyjscie");
      option = this.scanner.next();

      switch (option) {
        case "1":
          this.withdraw();
          break;
        case "2":
          this.showBalance();
          break;
        case "3":
          this.scanner.close();
          break;
        default:
          throw new Exception("Invalid operation");
      }
    } catch (Exception e) {
      System.out.println("Nie udalo sie zrealizowac operacji: " + e.getMessage());
      displayMenu();
    }
  }

  public void withdraw() {
    float amount;
    boolean operationPassed;

    System.out.print("Podaj kwote: ");
    amount = scanner.nextFloat();

    if (this.currentAccount.getBalance() >= amount) {
      float newBalance = this.currentAccount.getBalance() - amount;
      this.currentAccount.setBalance(newBalance);

      operationPassed = true;
    } else {
      operationPassed = false;
    }

    if (operationPassed) {
      System.out.println("Wyplacono " + amount + " PLN");
    } else {
      System.out.println("Brak wystarczajacych srodkow");
    }

    this.displayMenu();
  }

  public void showBalance() {
    System.out.println("Aktualny stan konta: " + this.currentAccount.getBalance() + " PLN");
    this.displayMenu();
  }
}

public class Account {
  private String cardNumber;
  private float balance;

  public Account(String cardNumber, float balance) {
    this.cardNumber = cardNumber;
    this.balance = balance;
  }

  public Account(String cardNumber) {
    this(cardNumber, 0f);
  }

  public String getCardNumber() {
    return this.cardNumber;
  }

  public float getBalance() {
    return this.balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }
}