package 继承.Day03_1;

public class Rectangle {
    private double length;
    private double width;


    public double Area(){
        if (length>0 && width>0) {
            double area = length * width;
            System.out.println("rectangle'area:"+area);
            return area;
        }
        return 0;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
