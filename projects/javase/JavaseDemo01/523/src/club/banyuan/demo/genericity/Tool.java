package club.banyuan.demo.genericity;

import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 10:35 上午
 */
public class Tool  {


  public  static   void  show2(Point<Object,Object> point){

    Integer  k= (Integer)point.getX();
    Integer  v= (Integer)point.getY();

    System.out.println(k+v);
  }
  public  static   void  show3(Point<Object,Object> point){

    String  k= (String)point.getX();
    String  v= (String)point.getY();

    System.out.println(k+v);
  }



  //泛型在方法上
  //静态方法不能使用泛型类传递过来的类型
  public  static <K,V>  void  show(Point<K,V> point){

    K  k= point.getX();
    V  v= point.getY();

    //  System.out.println(k+v);
  }


  //？任意类型
  public  static   void  show4(Point<?,?> point){  // 通配符 么有指定一个类型 所以在做操作的时候有限制
    System.out.println(point.x+ " " +point.y);
  }


  //泛型也是一样
  public  static <E> void  show5(List<E>  list) {
    for (int i = 0; i <list.size(); i++) {
      System.out.println(list.get(i));
    }


  }

  public  static  void  show6(List<?>  list) {

    for (int i = 0; i <list.size(); i++) {
      System.out.println(list.get(i));
    }

  }

//
//
//
  //通配符作用  ?  extend E 表示?接受的类型只能是E的子类及其本身  向下限定

  public  static   void  show7(Point<? extends Number,? extends  Number> point){  // 通配符 么有指定一个类型 所以在做操作的时候有限制

//    Integer  number=(Integer)point.getX();
//    Integer  number1=(Integer)point.getY();
//
//    System.out.println(number+number1);

  }



  // 向上限定   ? super  E
  public  static   void  show8(Point<? super Number,? super  Number> point){  // 通配符 么有指定一个类型 所以在做操作的时候有限制

//    Integer  number=(Integer)point.getX();
//    Integer  number1=(Integer)point.getY();
//
//    System.out.println(number+number1);

  }


}
