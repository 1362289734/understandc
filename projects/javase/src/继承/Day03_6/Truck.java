package 继承.Day03_6;

public class Truck extends Car {
    private double payload;

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    @Override
    public void situation() {
        System.out.println("Truck is parking in the park.");
    }
    @Override
    public void display(){
        System.out.println("weight:"+getWeight()+"ton"+" wheels:"+getWheels()+" payload:"+payload+"ton");
    }
}
