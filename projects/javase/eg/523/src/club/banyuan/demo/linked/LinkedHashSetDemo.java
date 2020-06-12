package club.banyuan.demo.linked;

import club.banyuan.demo.set.Student;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 1:51 下午
 */
public class LinkedHashSetDemo {

  /**
   * 元素有序:由链表保证元素有序 元素唯一:由哈希表保证元素的唯一
   */

  public static void main(String[] args) {
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();

    linkedHashSet.add(21);
    linkedHashSet.add(11);
    linkedHashSet.add(1);
    linkedHashSet.add(23);
    linkedHashSet.add(31);

    System.out.println(linkedHashSet);

    //  TreeSet<Integer>  treeSet=new TreeSet<>();

//    List<Integer> list=new ArrayList<>();
//    list.add(45);
//    list.add(415);
//    list.add(5);
//    list.add(25);
//    list.add(5);
//    list.add(50);
//
//    treeSet.addAll(list);   //会把重复的数据去除

    //  System.out.println(treeSet);

    //对象排序  根据年龄排序
    TreeSet<Student> treeSet = new TreeSet<>();
    treeSet.add(new Student("王五", 21));
    treeSet.add(new Student("李思思", 27));
    treeSet.add(new Student("大漂亮", 24));
    treeSet.add(new Student("jake", 24));
    treeSet.add(new Student("rose", 24));
    treeSet.add(new Student("pete", 24));
    treeSet.add(new Student("王五", 22));

    System.out.println(treeSet);


  }


}
