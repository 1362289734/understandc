package club.banyuan.demo.demo;

import club.banyuan.demo.entity.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 1:49 下午
 */
public class CollectionDemo2 {
  /**
   * 1.为什么会出现集合类？
   * 2.数组和集合有什么不同
   *
   * 作业: 自己去实现Collection接口
   *
   */

  public static void main(String[] args) {
    Collection con=new ArrayList(); //可以有重复值
    con.add("张三");
    con.add("李四");
    con.add("王五");
    con.add("刘亦菲");
    con.add("花木兰");
    con.add("刘亦菲");

    Person person = new Person("于国卫",21,"南京邮电大学");
    Person person2 = new Person("于国卫",21,"南京邮电大学");

    con.add(person);
    con.add(person2);

    //System.out.println(con);

    con.remove("刘亦菲");  //默认移除的是第一个出现的   如果后面还有相同的数据,也不会去移除

   // System.out.println(con);

    Collection con1=new ArrayList();
    con1.add("胖子");
    con1.add("打麻将..");
    con.addAll(con1);

    //con.removeAll(con1);

    System.out.println(con);

    //包装类没有讲过

  }

}
