package club.banyuan.demo.genericity;

import com.sun.scenario.animation.AnimationPulse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.beans.binding.NumberBinding;
import org.omg.CORBA.Object;
import sun.misc.Cache;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 11:04 上午
 */
public class OtherDemo {
  /**
   * 泛型通配符 ?
   *  任意数据类型  如果没有明确传递过来的类,那么就是Object以及任意的java类
   *
   * T
   *
   */
  public static void main(String[] args) {
    Point<String,Integer> point=new Point<>();
    point.setX("张三");
    point.setY(67);
    Tool.show4(point);


    List  list=new ArrayList();
    list.add("沾上干");
    list.add(21312);

    Tool.show5(list);
    System.out.println("--------------");
    Tool.show6(list);

    Point<Double, Integer> point1 = new Point<>();
    Tool.show7(point1);

//     Point<Number, Integer>  p= new Point<>();
//     Tool.show8(p);

  }



}







class  Animal{


}
class  Cat  extends  Animal{

}

class  Dog  extends  Animal{

}
class  SmallDog extends  Dog{

}

class  TestAnimal{

  public static void main(String[] args) {

    Collection<? super  Cat> collection1=new ArrayList<>();
   // collection1.add();

    Collection<? super  Animal> collection2=new ArrayList<>();
    collection2.add(new Cat());
    collection2.add(new Dog());
    collection2.add(new Animal());
    //collection2.add(new Object());

    Collection<? super  Dog> collection3=new ArrayList<>();
   // collection3.add(new Cat());
    collection3.add(new SmallDog());
    collection3.add(new Dog());

    collection3=collection2;  //向上限定的集合不能做添加操作(比参数类型大的) 但是可以做集合之间的赋值操作






  }
}


