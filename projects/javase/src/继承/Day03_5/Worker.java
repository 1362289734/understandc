package 继承.Day03_5;

public class Worker extends Person{
    private String unit;
    private int workAge;

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    @Override
    public void work() {
        System.out.println( super.getName()+" is building houses.");
    }
}
