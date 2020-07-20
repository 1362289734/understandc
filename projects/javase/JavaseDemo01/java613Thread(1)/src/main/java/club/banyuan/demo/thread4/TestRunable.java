package club.banyuan.demo.thread4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:36 下午
 */
public class TestRunable {

  public static void main(String[] args) {
    MyThread myThread = new MyThread(); //
    Thread  t1=new Thread(myThread,"线程A");
    Thread  t2=new Thread(myThread,"线程B");
    t1.start();
    t2.start();


  }
}
