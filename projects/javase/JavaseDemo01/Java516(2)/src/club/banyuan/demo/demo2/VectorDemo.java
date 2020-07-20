package club.banyuan.demo.demo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;


/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 3:29 下午
 */
public class VectorDemo {

  public static void main(String[] args) {
    Vector vector = new Vector();

//    vector.add("张三1");
//    vector.add("张三2");
//    vector.add("张三3");
//    vector.add("张三4");
//    vector.add("张三5");

    vector.addElement("hahsah1");
    vector.addElement("hahsahArrayStoreException2");
    vector.addElement("hahsah3");
    vector.addElement("甲鱼");
    vector.addElement("王八");
    vector.addElement("张三丰");
    vector.addElement("h驾驭sah3");

    Object[] objects = new Object[vector.size()];

    vector.copyInto(objects); //ArrayStoreException

    System.out.println(Arrays.toString(objects));

    vector.insertElementAt("张三丰", 2);

    System.out.println(vector);

    //Object  object=vector.clone();

    Object object = vector.firstElement();
    System.out.println("》》》》》》》"+object);

    int   index=vector.indexOf("张三丰"); //只返回找到的第一个数据的位置
    //返回此向量中指定元素的最后一次出现的索引，从 index ，如果未找到元素，则返回-1。
   index= vector.lastIndexOf("张三丰", vector.size()-1);
    System.out.println(index);

    List  list=vector.subList(2, 5);
    System.out.println("---"+list);

    vector.clear();

    vector.add(34);
    vector.add(4);
    vector.add(134);
    vector.add(54);
    vector.add(14);
    vector.add(20);

    //思考题:为什么会得到这个排序 结果
    vector.sort(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {

        return ((Integer)o1).compareTo((Integer)o2);
      }
    });

    System.out.println(vector.toString());



  }

}
