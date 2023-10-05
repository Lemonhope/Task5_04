package Task5_04;

public class Car {
    private String model; //model - назва машини
    private double power; //power - від 0.0 до 200.0
    private int speed; //speed - від 0 до 320
    private double price; //price - від 0.0 до 50000.0
    private final int yearOfManufacture  = 1967;

    public Car() {
    }

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nmodel: '" + model + '\'' +
                "\npower: " + power +
                "\nspeed: " + speed +
                "\nprice: " + price +
                "\nyearOfManufacture: " + yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
