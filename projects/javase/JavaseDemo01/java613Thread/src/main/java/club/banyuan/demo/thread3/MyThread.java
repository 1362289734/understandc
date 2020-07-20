package club.banyuan.demo.thread3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 10:13 上午
 */
public class MyThread extends Thread {

  /**
   * join  线程加入
   */

  @Override
  public void run() {


    for (int i = 0; i <10; i++) {
      try {
//        System.out.println(Thread.currentThread().getName()+"----------------------进来了");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println(Thread.currentThread().getName()+"线程抛了异常....");
      }
      System.out.println(Thread.currentThread().getName()+"执行:"+(i+1));
      //Thread.currentThread().stop(); //当前线程停止,从停止位置开始后面的代码就不在执行了
    }
    System.out.println("-----"+Thread.currentThread().getName());

  }
}
