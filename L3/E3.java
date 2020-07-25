import java.util.Scanner;

public class E3 {
  public static void main(String[] args) throws Exception {
    new TV();
  }
}

public class TV {
  final static int VOLUME_LIMIT = 15;
  final static int CHANNELS_NUMBER = 9;
  final static int DEFAULT_CHANNEL = 1;

  protected boolean isOn;
  protected int currentChannel = TV.DEFAULT_CHANNEL;
  protected int volume = 7;
  protected int[] channels;
  protected RemoteControl remoteControl = new RemoteControl(this);
  private Scanner scanner = new Scanner(System.in);

  public TV() {
    int[] channels = new int[CHANNELS_NUMBER];

    for (int i = 0; i < channels.length; i++) {
      channels[i] = i + 1;
    }

    this.channels = channels;
    this.displayMenu();
  }

  public void displayMenu() {
    String pickedOption;

    System.out.println("Kanal: " + currentChannel + " | Glosnosc: " + volume);
    System.out.println("-------------");
    System.out.println("VU. Podglosnij");
    System.out.println("VD. Scisz");
    System.out.println("NC. Nastepny kanal");
    System.out.println("PC. Poprzedni kanal");

    for (int channel : this.channels) {
      System.out.println(channel + ". Kanal " + channel);
    }

    System.out.println("TU. Wylacz");
    System.out.print("Wybierz: ");
    pickedOption = this.scanner.next();

    if (Utils.isInteger(pickedOption)) {
      this.displayChannel(Integer.parseInt(pickedOption));
    } else {
      String normalizedOption = pickedOption.toUpperCase();

      if (!normalizedOption.equals("TU")) {
        switch (normalizedOption) {
          case "VU":
            this.remoteControl.increaseVolume();
            break;
          case "VD":
            this.remoteControl.decreaseVolume();
            break;
          case "NC":
            this.remoteControl.nextChannel();
            break;
          case "PC":
            this.remoteControl.previousChannel();
            break;
          default:
            System.out.println("Podana operacja jest nieprawidlowa");
        }

        this.displayMenu();
      }

    }
  }

  public void displayChannel(int channel) {
    if (channel > 0 && channel <= TV.CHANNELS_NUMBER) {
      this.currentChannel = channel;
    } else {
      this.currentChannel = TV.DEFAULT_CHANNEL;
      System.out.println("Nie odnaleziono kanalu");
    }

    displayMenu();
  }
}

public class RemoteControl {
  private TV tv;

  public RemoteControl(TV tv) {
    this.tv = tv;
  }

  public void toggle() {
    this.tv.isOn = !this.tv.isOn;
  }

  public void nextChannel() {
    if (this.tv.currentChannel < TV.CHANNELS_NUMBER) {
      this.tv.currentChannel++;
    } else {
      this.tv.currentChannel = 1;
    }
  }

  public void previousChannel() {
    if (this.tv.currentChannel > 1) {
      this.tv.currentChannel--;
    } else {
      this.tv.currentChannel = TV.CHANNELS_NUMBER;
    }
  }

  public void increaseVolume() {
    if (this.tv.volume < TV.VOLUME_LIMIT) {
      this.tv.volume++;
    }
  }

  public void decreaseVolume() {
    if (this.tv.volume > 1) {
      this.tv.volume--;
    }
  }
}

public class Utils {
  public static boolean isInteger(String s) {
    return isInteger(s, 10);
  }

  public static boolean isInteger(String s, int radix) {
    if (s.isEmpty())
      return false;
    for (int i = 0; i < s.length(); i++) {
      if (i == 0 && s.charAt(i) == '-') {
        if (s.length() == 1)
          return false;
        else
          continue;
      }
      if (Character.digit(s.charAt(i), radix) < 0)
        return false;
    }
    return true;
  }
}