package 继承.Day03_5;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person(){

    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }



    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }
    public void work(){
        System.out.println(name+" is working.");
    }



}
