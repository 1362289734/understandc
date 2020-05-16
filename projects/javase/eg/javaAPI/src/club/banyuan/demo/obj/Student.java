package club.banyuan.demo.obj;


import java.util.Objects;

public class Student  implements   Cloneable{


    private   String name;
    private   int  age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //实现clone 就是自定义类实现 Cloneable 接口
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    //两个对象相比  为什么要重写equals方法和hashcode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
            Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //额外的任务:一个类里面有四个属性 自己重写 equals方法

    //    @Override
//    public boolean equals(Object obj) {  //
//        if(obj==null){
//          return false;
//        }
//        if(this==obj){//obj
//            return  true;
//        }
//        //如果obj 不是根据Student.class文件创建的对象  也没有继续比较的意义了
//        if(this.getClass()!=obj.getClass()){
//            return  false;
//        }
//        //以上是吧所有不满足条件的全部排除
//        Student   st=(Student)obj;
//        //对比当前对象的属性和传递过来的obj对象的属性是否一样
//        if(this.getName()==null){
//           if(st.getName()!=null){
//               return  false;
//           }
//        }else if(!this.getName().equals(st.getName())){  //String  里面的equals
//            return   false;
//        }
//        return this.getAge() == st.getAge();
//    }
}
