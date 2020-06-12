package club.banyuan.demo.homework;

import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 10:34 上午
 */
public class Person {

  private  boolean flag;
  private  String  name;
  private  String[] str;

  public Person(boolean flag, String name, String[] str) {
    this.flag = flag;
    this.name = name;
    this.str = str;
  }

  public Person() {
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getStr() {
    return str;
  }

  public void setStr(String[] str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return "Person{" +
        "flag='" + flag + '\'' +
        ", name='" + name + '\'' +
        ", str=" + Arrays.toString(str) +
        '}';
  }
}
