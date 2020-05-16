package club.banyuan.com.exceptions2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 11:11 上午
 */
public class Tool {
  private  Tool() { //私有化构造器 没办法创建对象 只能通过静态方法区访问成员

  }
  public  static  void  check(int  score){
    if(score>=60){
      System.out.println("及格");
    }else  if(score<60&&score>=0){
      System.out.println("不及格");
    }else {
      throw new   MyException("小伙子,你的分数有点怪啊...");
    }
  }
}
class TestTool{

  public static void main(String[] args) {
    Tool.check(-90);
  }
}