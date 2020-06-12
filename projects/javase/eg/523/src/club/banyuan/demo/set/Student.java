package club.banyuan.demo.set;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 1:45 下午
 */
public class Student implements Comparable<Student> {

  private String name;
  private Integer age;

  public Student() {
  }

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(name, student.name) &&
        Objects.equals(age, student.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public int compareTo(Student o) {
    //  根据年龄进行排序
    int num = this.age - o.getAge();

    int key = num == 0 ? this.name.length() - o.getName().length() : num;

    int num1 = key == 0 ? this.name.compareTo(o.getName()) : key;

    return num1;
  }
}
