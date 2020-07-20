```java
 /**
//TODO  思考题:为什么会得到这个排序 结果升序,如果集合里面是字符串呢？或者是对象呢？
    Vector  vector=new Vector();
//    vector.add("awd");
//    vector.add("genfsdd");
//    vector.add("asawd");
//    vector.add("rtewqesd");
//    vector.add("qawd");

//    vector.sort(new Comparator() {
//      @Override
//      public int compare(Object o1, Object o2) {
//        String  str1=(String)o1;
//        String  str2=(String)o2;
//        return str1.compareTo(str2);
//      }
//    });
//
//    System.out.println(vector);

    vector.add(new Person("张三", 32));
    vector.add(new Person("大保健", 11));
    vector.add(new Person("武器大师", 23));
    vector.add(new Person("易", 222));
    vector.add(new Person("剑姬", 23));
    vector.add(new Person("上帝之手", 23));

    vector.sort(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {

        Person  person1=(Person)o1;
        Person  person2=(Person)o2;
        int num=person1.getAge()-person2.getAge();
        //字符串的长度考虑进去
        int len=person1.getName().length()-person2.getName().length();
       int num1= num == 0  ?  len : num;
       int  num2= num1 == 0 ? person1.getName().compareTo(person2.getName()):num;
        return num2;
      }
    });

    for (Object o : vector) {
      System.out.println(o);
    }
*/


/**
  练习1
    实现接口里面的方法(往集合里面添加数据) 
      
      //
      void   add(T  t);
    
      //删除
      boolean  delete(T  t);
    
      //查询
      T    queryByT(T   t);
    
      //修改
      T  update (T  t);

  
    课堂练习:
      1.编写一个程序,获取10个1~20数据 并且不能重复 
      2.键盘录入5个学生信息（姓名,语文成绩,数学成绩,英语成绩),按照成绩总分高低来进行排序输出
      3.TreeSet集合存储自定义对象并且遍历
       Person  属性: 姓名  年龄  考试成绩  平均分
      输出:
        按照平均分排序,如果平均分一样按照姓名排序   (姓名为英文字母,不能是汉字)


*/




```