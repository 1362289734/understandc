package club.banyuan.demo.thread5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:43 下午
 */
public class Test {

  /**
   * 资源是同一个资源  但是因为是继承Thread 不能有效的去处理同一个资源的情况  没有对数据进行有效的分离
   * @param args
   */

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.setName("线程A");
    MyThread myThread2 = new MyThread();
    myThread2.setName("线程B");
    myThread.start();
    myThread2.start();

  }

}
