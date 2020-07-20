package club.banyuan.demo.thread4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:33 下午
 */
public class MyThread implements Runnable{

  /**
   * 第二种实现方式
   */
  @Override
  public void run() {
    for (int i = 0; i <10; i++) {
      System.out.println(Thread.currentThread().getName()+"在执行:"+(i+1));
    }
  }
}
