package Task5_04;

public abstract class Car {
    protected String model; //model - назва машини
    protected double power; //power - від 0.0 до 200.0
    protected int speed; //speed - від 0 до 320
    protected double price; //price - від 0.0 до 50000.0
    protected final int yearOfManufacture  = 1967;

    public Car() {
    }

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }
    public double checkValuePower(double powerToCheck) {
        if (powerToCheck > 200) {
            return 200;
        } else if (powerToCheck < 0) {
            return 0;
        }
        return powerToCheck;
    }
    public double checkValuePrice(double priceToCheck) {
        if (priceToCheck > 50000) {
            return 50000;
        } else if (priceToCheck < 0) {
            return 0;
        }
        return priceToCheck;
    }
    public int checkValueSpeed(int speedToCheck) {
        if (speedToCheck > 320) {
            return 320;
        } else if (speedToCheck < 0) {
            return 0;
        }
        return speedToCheck;
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
