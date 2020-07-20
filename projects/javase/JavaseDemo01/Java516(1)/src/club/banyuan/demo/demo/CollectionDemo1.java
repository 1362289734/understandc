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
public class CollectionDemo1 {
  /**
   * 1.为什么会出现集合类？
   * 2.数组和集合有什么不同
   *
   * 作业: 自己去实现Collection接口
   *
   */

  public static void main(String[] args) {
    Collection con=new ArrayList();
    con.add("zhangsan");
    con.add(45);
    con.add(4.5);
    con.add('男');
    con.add(true);
    con.add(null);
    con.add(new int[]{12,34,5,6,790});
    Person person = new Person("王五", 30, "栖霞下水道");
    con.add(person);

    System.out.println(con.toString());

    con.remove(4.5); //请问移除一个数据之后,其他数据的位置有没有变化？
    con.remove(person);
    System.out.println(con);

//    con.clear();
//    System.out.println(con.isEmpty());

    System.out.println(con.contains(45));

    System.out.println(con.size());  //表示集合里面有几个有效数据

  /**
    Object[] obj=con.toArray();
    for (int i = 0; i <obj.length; i++) {
      System.out.println(">>"+obj[i]);
    }
    第一种遍历方式
    */

  /**
   * 第二种遍历方式
    for (Object  obj: con) {
      System.out.println("--"+obj);
    }
   */

    /**
     * 第三种方式
     */
    //得到迭代器   迭代器对集合中数据进行遍历
    Iterator iterator = con.iterator();
    while(iterator.hasNext()){
      Object obj=iterator.next();
      System.out.println(">>>>>>>"+obj);
    }

     //思考题:如果集合中存放相同的数据,能存放嘛?对象呢？
    // 如果集合中有相同的数据 那么使用一次移除方法,会得到一个什么结果



  }

}
