package club.banyuan.demo.demo2;

import club.banyuan.demo.entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 3:29 下午
 */
public class ListDemo1 {

  public static void main(String[] args) {
    List  list=new ArrayList();
    list.add("张三");
    list.add("张三2");
    list.add("张三3");
    list.add("张三4");

    list.add(1, "李四");
    list.add("张三");

    System.out.println(list);
    list.remove(list.size()-1);
    System.out.println(list);

    for (int i = 0; i <list.size(); i++) {
      Object  obj=list.get(i);
      if(obj.equals("张三2")){
        list.remove(i);
      }
    }

    System.out.println(list.toString());

    //Object  obj=list.set(1, new Person("小明",12,"小红家旁边,方便下手..."));
    //System.out.println(">>>>>>>"+obj);
    //System.out.println(list.toString());


    ListIterator listIterator = list.listIterator();

    //迭代器在刚开始的时候 类似于游标的东西 指向的是集合中第一个元素  请问第一个元素前面还有元素嘛？
//   while(listIterator.hasNext()){
//     Object object=listIterator.next();
//     System.out.println("==="+object);
//   }

//    if(listIterator.hasPrevious()){
//      Object  obj=listIterator.previous();
//      System.out.println("上一个元素是:"+obj);
//    }

    listIterator.add("王五");
    listIterator.add("89889");
    listIterator.add("喝水");

    listIterator = list.listIterator();

   while(listIterator.hasNext()){
     Object object=listIterator.next();
     System.out.println("==="+object);
   }

    listIterator.set("田七");
    listIterator = list.listIterator();
    while(listIterator.hasNext()){
      Object object=listIterator.next();
      System.out.println(">>>>"+object);
    }


  }

}
