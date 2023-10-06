
package Task5_04;

public class Main {
    public static void main(String[] args) {
        Car ford=new Ford("Ford", 30, 450, 100000);
        Car mitsubishi=new Mitsubishi("Mitsubishi", 140, 170, 29000);
        Car toyota=new Toyota("Toyota", 200, 200, 27500);
        Car kia=new KIA("KIA Rio", 220, 189, 30000);

        // перевірка даних на прикладі машини Ford
        ford.setPrice(ford.checkValuePrice(ford.getPrice()));
        ford.setPower(ford.checkValuePower(ford.getPower()));
        ford.setSpeed(ford.checkValueSpeed(ford.getSpeed()));

        CarInfo infoList=new CarInfo();
        infoList.addCar(ford);
        infoList.addCar(mitsubishi);
        infoList.addCar(toyota);
        infoList.addCar(kia);
        System.out.println("\nFastest car: "+infoList.fastestCar());
        System.out.println("\nThe most expensive car: "+infoList.expensiveCar());
        System.out.println("\nThe most powerful car: "+infoList.powerCar());
    }
}
