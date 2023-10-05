
package Task5_04;

public class Main {
    public static void main(String[] args) {
        Car ford=new Car("Ford", 100, 150, 20000);
        Car mitsubishi=new Car("Mitsubishi", 140, 170, 29000);
        Car toyota=new Car("Toyota", 200, 200, 27500);
        Car kia=new Car("KIA Rio", 200, 189, 30000);

        CarInfo infoList=new CarInfo();
        infoList.addCar(ford);
        infoList.addCar(ford);
        infoList.addCar(ford);
        infoList.addCar(ford);
        System.out.println("\nFastest car: "+infoList.fastestCar());
        System.out.println("\nThe most expensive car: "+infoList.expensiveCar());
        System.out.println("\nThe most powerful car: "+infoList.powerCar());
    }
}
