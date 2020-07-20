package club.banyuan.demo.thread3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 10:12 上午
 */
public class JoinThread {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.setName("线程A");
    myThread.start();

    try {
    //  myThread.join();  //join表示在当前线程后面线程呀等到当前线程执行完毕之后才会继续执行  其他线程都在等待状态
      Thread.sleep(200);
      //myThread.interrupt(); //线程中断 但是还会继续执行
      myThread.stop();  // 线程停止就表示线程死亡了
    } catch (InterruptedException e) {
      e.printStackTrace();
    }



    MyThread myThread2 = new MyThread();
    myThread2.setName("线程B");
    myThread2.start();


    MyThread myThread3 = new MyThread();
    myThread3.setName("线程C");
    myThread3.start();
  }

}
