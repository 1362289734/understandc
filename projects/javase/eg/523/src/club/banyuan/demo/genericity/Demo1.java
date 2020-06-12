package club.banyuan.demo.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 9:51 上午
 */
public class Demo1 {

  //什么叫泛型？是一种特殊的类型,它会把指定的类型的工作推迟到客户端代码声明并且实例化类或者方法的时候进行
  /*
    也叫称为参数化泛型,可以把类型当做参数一样传递过来
   */

  public static void main(String[] args) {
    List<String>  list=new ArrayList();
    list.add("hahs");
   // list.add(28);//在做数据取出的时候 是不是要进行类型转换
    list.add("大保健");

//    for (Object s :list) {
//      String  st=(String)s;
//      System.out.println(st); //编译的时候没有问题
//
//    }

    /*
      使用泛型的好处
        1.提高程序的安全性
        2.将运行期的问题提升到编译期间
        3.省去了类型强转的麻烦
     */
//
//    Point point=new Point();
////    point.setX(12);
////    point.setY(56);
// //   point.setX(12.34);
//      point.setX("东经120度");
//      point.setY(45);  //隐患 类型转换的问题


  //  System.out.println(point.getX()+"--"+point.getY());

//    Point<Integer>  point=new Point<>();
//    point.setX(23);
//    point.setY(45);
//
//    Point<String>  point1=new Point<>();
//    point1.setY("东经");

//    Point<String,Integer> point2 = new Point<>();
//    point2.setX("东经");
//    point2.setY(67);

    //思考:泛型和Object 有什么不同？

    Point<String, Integer>  point= new Point<>();
    Tool.show(point);


  }


}
