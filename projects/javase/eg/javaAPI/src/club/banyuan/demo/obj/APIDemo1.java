package club.banyuan.demo.obj;


public class APIDemo1 {

  /**
   * api   application  programming interface
   * <p>
   * class
   */

  public static void main(String[] args) throws CloneNotSupportedException {

    Object object = new Object();
//
//        System.out.println(object.getClass());  //表示获取class文件路径
//        System.out.println(object.getClass().getName()); //表示获取class文件的名字
//        System.out.println(object.toString());
//
//        Object   object2=new Object();
//        System.out.println(object.getClass()==object2.getClass());
//        System.out.println("----"+object.hashCode());
//        System.out.println("===="+object2.hashCode());
        /*
            1627674070
            1360875712
         */

    Student stu = new Student();
    stu.setName("李四");
//        Student   su=stu;
//        su.setName("王五");
//        //29049976===29049976
//        System.out.println(su.hashCode()+"==="+stu.hashCode()+">>>>>>>>>>>"+stu.getName());

//    Student s = (Student) stu.clone();  //克隆出另一个对象    跟之前对象不是同一个
//    s.setName("切糕");
//
//    System.out.println(stu.getName() + "---" + s.getName());
//
//    System.out.println(stu.hashCode());//1627674070
//
//    System.out.println(s.hashCode());//1360875712


//        Object   obj=new Object();
//        Object   obj2=new Object();
//
//        System.out.println(obj.equals(obj2));

             stu=new Student("王五",21);
      Student  s=new Student("王五",21);
      //在堆里面的位置是不相同的 但是从现实业务逻辑发展 信息相同的就应该是同一个人
//
//        // 写程序  主观业务逻辑分析
        System.out.println(stu.equals(s));


//        //写一个程序  用来判断除地址意外的所有的属性是否是一样
//
//        stu=new Student("王五",12);
//        s=stu;
//
//        System.out.println(stu.equals(s));//
//

  }


}



