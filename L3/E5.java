public class E5 {
  public static void main(String[] args) throws Exception {
    new Animal();
    new Fish();
    new Salmon();
    new Tuna();
    new Bird();
    new Pigeon();
    new Sparrow();
    new Mammal();
    new Tiger();
    new Monkey();
  }
}

public class Animal {
  public Animal() {
    System.out.println("Creating an animal");
  }

  public void sleep() {
    System.out.println("Zzz...");
  }
}

public class Fish extends Animal {
  public Fish() {
    System.out.println("Creating a fish from animal");
    this.swim();
  }

  public void swim() {
    System.out.println("They see me swimmin'");
  }
}

public class Salmon extends Fish {
  public Salmon() {
    System.out.println("Creating a salmon from fish");
    super.swim();
  }
}

public class Tuna extends Fish {
  public Tuna() {
    System.out.println("Creating a tuna from fish");
    super.swim();
  }
}

public class Bird extends Animal {
  public Bird() {
    System.out.println("Creating a bird from animal");
    this.fly();
  }

  public void fly() {
    System.out.println("They see me flyin'");
  }
}

public class Pigeon extends Bird {
  public Pigeon() {
    System.out.println("Creating a pigeon from bird");
    super.fly();
  }
}

public class Sparrow extends Bird {
  public Sparrow() {
    System.out.println("Creating a sparrow from bird");
    super.fly();
  }
}

public class Mammal extends Animal {
  public Mammal() {
    System.out.println("Creating a mammal from animal");
    this.suck();
  }

  public void suck() {
    System.out.println("They see me suckin'");
  }
}

public class Tiger extends Mammal {
  public Tiger() {
    System.out.println("Creating a tiger from mammal");
    super.suck();
  }
}

public class Monkey extends Mammal {
  public Monkey() {
    System.out.println("Creating a monkey from mammal");
    super.suck();
  }
}
