package 继承.Day03_1;

import com.sun.javafx.embed.EmbeddedSceneDSInterface;

public class Cuboid extends Rectangle {
    private double height;


    public double Volume(){
        double volume;
        double length = super.getLength();
        double width = super.getWidth();
        if (height>0 && length>0 && width>0){
            volume = height*length*width;
            System.out.println("cuboid's volume:"+volume);
            return volume;
        }
        return 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}


class TestCuboid{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.setHeight(20);
        cuboid.setLength(40);
        cuboid.setWidth(60);
        cuboid.Volume();
        cuboid.Area();
    }
}
