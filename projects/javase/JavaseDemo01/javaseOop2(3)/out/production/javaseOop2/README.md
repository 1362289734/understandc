```java
/**
    抽象类和接口的区别:
      成员区别:
      抽象类  可以有成员变量,常量,有抽象方法,也可以有非抽象方法
      接口:只有抽象方法(jdk1.8之前)和常量
    
      抽象类只能单继承,接口可以多继承也可单继承
      <一个类可以实现多个接口 但是只能继承一个抽象类(除了内部类)>
      

*/

// 随堂练习  
//  乒乓球运动员和篮球运动员  乒乓球教练和篮球教练  
//  为了出国比赛 跟乒乓球有关的人员都要学习英语
//             跟篮球有关系的人都要学习美式英式       
// 请用所有的指示(抽象类和接口)  去完成此功能    可以分析一下 哪些是抽象类  哪些是接口 哪些是具体类

```

```java
   class  Outer{
    int  num=10;
    class  Inner{
        int num=20;
        public void show(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        } 
  }
}
   //在上面输出语句里面写出相应的代码  得到的结果为:30  20  10


```

```java
    abstract class Person{
      public  abstract void show();
    }
    class PersonDemo{
        public  void  method(Person person){
            person.show();
        }
    }
    
//测试类:
    PersonDemo  p=new PersonDemo();

    //是不是要传递一个Person及其子类的对象

   /**
        这里面填的是匿名对象
          p.method(new Person(){
                         public void  show(){
                           输出语句:我是你爸爸;
                         }     
                       } );
        
    */
    //请问p.method()括号里面填写哪些代码会输出"我是你爸爸";   




```







