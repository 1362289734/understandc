package 继承.Day03_5;

public class TEST {
}
class Test{
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(19);
        stu.setGender("male");
        stu.setName("Leo");
        stu.setNationality("Scotland");
        stu.setSchool("NJUPT");
        stu.setStuNumber("B12345678");
        System.out.println(stu.getName()+"'s student number is "+stu.getStuNumber()+".");
        System.out.println(stu.getName()+" is "+stu.getAge()+".");
        stu.work();
        stu.eat();

        System.out.println();

        Worker worker = new Worker();
        worker.setUnit("Vehicle Company");
        worker.setWorkAge(30);
        worker.setAge(55);
        worker.setGender("male");
        worker.setName("Alexis");
        worker.setNationality("American");
        System.out.println(worker.getName()+" works in "+worker.getUnit()+".");
        System.out.println(worker.getName()+" is "+worker.getAge()+".");
        System.out.println(worker.getName()+"'s work-age is "+worker.getWorkAge()+".");
        worker.work();
        worker.sleep();

        System.out.println();

        StudentLeader stuLeader = new StudentLeader();
        stuLeader.setJob("class monitor");
        stuLeader.setSchool("NJUPT");
        stuLeader.setStuNumber("B10110101");
        stuLeader.setAge(21);
        stuLeader.setGender("female");
        stuLeader.setName("Taylor");
        stuLeader.setNationality("Ukraine");
        System.out.println(stuLeader.getName()+" is "+stuLeader.getJob()+".");
        System.out.println(stuLeader.getName()+"'s student number is "+stuLeader.getStuNumber()+".");
        System.out.println(stuLeader.getName()+" is "+stuLeader.getAge()+".");
        stuLeader.meeting();
        stuLeader.eat();
    }
}
