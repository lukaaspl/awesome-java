public class E4 {
  public static void main(String[] args) throws Exception {
    Bike bike = new Bike(new SteeringWheel("Octave"), new Pedals("Dartmoor"), new Chain("Shimano"),
        new Wheel("Kenda", "front"), new Wheel("Kenda", "rear"));
  }
}

public class Bike {
  public SteeringWheel steeringWheel;
  public Pedals pedals;
  public Chain chain;
  public Wheel frontWheel;
  public Wheel rearWheel;

  public Bike(SteeringWheel steeringWheel, Pedals pedals, Chain chain, Wheel frontWheel, Wheel rearWheel) {
    this.steeringWheel = steeringWheel;
    this.pedals = pedals;
    this.chain = chain;
    this.frontWheel = frontWheel;
    this.rearWheel = rearWheel;
  }
}

public class SteeringWheel {
  public String model;

  public SteeringWheel(String model) {
    this.model = model;
  }
}

public class Pedals {
  public String model;

  public Pedals(String model) {
    this.model = model;
  }
}

public class Chain {
  public String model;

  public Chain(String model) {
    this.model = model;
  }
}

public class Wheels {
  public String model;

  public Wheels(String model) {
    this.model = model;
  }
}

public class Wheel extends Wheels {
  public String description;

  public Wheel(String model, String description) {
    super(model);
    this.description = description;
  }
}