package club.banyuan.demo.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 1:33 下午
 */
public class SetDemo {

  public static void main(String[] args) {
    /**
     * set 集合  不保证迭代的顺序  乱序
     *   不支持重复数据
     *
     * 底层数据结构是hash表 而hash表依赖于hash值存储
     *  （元素数据是链表的一个数组）
     *
     */
    HashSet<String>  set = new HashSet<>();

    set.add("李四");
    set.add("王二麻子");
    set.add("战三");   //  恰巧添加的顺序和迭代的结果是一样的  那是因为计算机存储的时候刚好跟添加的顺序一样
    set.add("隔壁老王");
    set.add("大保健");
    set.add("李四");


    System.out.println(set); //[李四, 王二麻子, 隔壁老王, 大保健, 战三]

    Set<Student> students= new HashSet<>();
    students.add(new Student("李思思",24));  //Student类重写了hashCode和equals方法才能满足业务需求
    students.add(new Student("李思思",24));
    System.out.println(students);

  }

}
