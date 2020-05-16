package 继承.Day03_6;

public class Car extends Vehicle{
    private double loader;

    public void setLoader(double loader) {
        this.loader = loader;
    }

    public double getLoader() {
        return loader;
    }

    @Override
    public void situation() {
        System.out.println("Car is driving in a country road.");
    }
    @Override
    public void display(){
        System.out.println("weight:"+getWeight()+"ton"+" wheels:"+getWheels()+" loader:"+loader);
    }
}
