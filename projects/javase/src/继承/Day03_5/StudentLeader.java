package 继承.Day03_5;

public class StudentLeader extends Student{
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void  meeting(){
        System.out.println(super.getName()+" is in conference.");
    }
}
