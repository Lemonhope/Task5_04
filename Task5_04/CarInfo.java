package Task5_04;

import java.util.ArrayList;

public class CarInfo {
    private Car[] carList=new Car[1000];
    private int num;

    public CarInfo() {
        this.num=0;
    }

    public void addCar(Car newCar){
        carList[this.num++]=newCar;
    }
    public Car fastestCar(){
        Car fastCar=carList[0];
        for (int i=1; i<this.num; i++) {
            if(carList[i].getSpeed() > fastCar.getSpeed())
                fastCar=carList[i];
        }
        return fastCar;
    }
    public Car expensiveCar(){
        Car expensCar=carList[0];
        for (int i=1; i<this.num; i++) {
            if(carList[i].getPrice() > expensCar.getPrice())
                expensCar=carList[i];
        }
        return expensCar;
    }
    public Car powerCar(){
        Car power=carList[0];
        for (int i=1; i<this.num; i++) {
            if(carList[i].getPower() > power.getPower())
                power=carList[i];
        }
        return power;
    }
}
