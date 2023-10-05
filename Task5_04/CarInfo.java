package Task5_04;

import java.util.ArrayList;

public class CarInfo {
    private ArrayList<Car> carList=new ArrayList<Car>();

    public void addCar(Car newCar){
        carList.add(newCar);
    }
    public Car fastestCar(){
        Car fastCar=carList.get(0);
        for (Car i:carList) {
            if(i.getSpeed() > fastCar.getSpeed()){
                fastCar=i;
            }
        }
        return fastCar;
    }
    public Car expensiveCar(){
        Car expensCar=carList.get(0);
        for (Car i:carList) {
            if(i.getPrice() > expensCar.getPrice()){
                expensCar=i;
            }
        }
        return expensCar;
    }
    public Car powerCar(){
        Car power=carList.get(0);
        for (Car i:carList) {
            if(i.getPower() > power.getPower()){
                power=i;
            }
        }
        return power;
    }
}
