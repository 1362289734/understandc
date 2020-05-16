package 继承.Day03_6;

public class Vehicle {
    private double wheels;
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWheels(double wheels) {
        this.wheels = wheels;
    }

    public double getWheels() {
        return wheels;
    }

    public void situation(){
        System.out.println("Vehicle is driving on the road.");
    }

    public void display(){
        System.out.println("weight:"+getWeight()+"ton"+" wheels:"+getWheels());
    }
}
class TestVehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.setLoader(5);
        car.setWeight(2);
        car.setWheels(4);
        car.display();
        car.situation();

        System.out.println();

        Truck tru = new Truck();
        tru.setPayload(100);
        tru.setWeight(15);
        tru.setWheels(12);
        tru.setLoader(2);
        tru.situation();
        tru.display();
    }
}
