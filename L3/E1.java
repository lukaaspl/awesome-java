public class Car {
  protected int weight;

  public Car(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return this.weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}

public class Truck extends Car {
  public boolean hasTrailer;

  public Truck(int weight, boolean hasTrailer) {
    super(weight);
    this.hasTrailer = hasTrailer;
  }

  public void putOnTrailer() {
    this.hasTrailer = true;
  }

  public void pullOffTrailer() {
    this.hasTrailer = false;
  }
}

public class Scania extends Truck {
  protected int productionYear;

  public Scania(int weight, boolean hasTrailer, int productionYear) {
    super(weight, hasTrailer);
    this.productionYear = productionYear;
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public void setProductionYear(int productionYear) {
    this.productionYear = productionYear;
  }
}