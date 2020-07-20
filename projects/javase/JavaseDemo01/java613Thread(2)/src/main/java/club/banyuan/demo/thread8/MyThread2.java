package club.banyuan.demo.thread8;

import java.util.concurrent.TimeUnit;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 3:38 下午
 */
public class MyThread2  implements  Runnable{
  @Override
  public void run() {
    while (true) {
      try {
        // 只允许一个线程通过
        if (DieLock.a1.tryAcquire(1000, TimeUnit.MILLISECONDS)) {
          System.out.println("-----" + Thread.currentThread().getName() + "有刀了...");
          if (DieLock.a2.tryAcquire(1000, TimeUnit.MILLISECONDS)) {
            System.out.println("-----" + Thread.currentThread().getName() + "有叉了...");
            Thread.sleep(3000);
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        DieLock.a1.release(); //释放线程所占用的管道
        DieLock.a2.release(); //
      }
    }
  }
}


class  Test{

  public static void main(String[] args) {
    MyThread2  myThread2=new MyThread2();
    //MyThread3  myThread3=new MyThread3();

    Thread  t1=new Thread(myThread2,"特朗普");
    Thread  t2=new Thread(myThread2,"希拉里");
    t1.start();
    t2.start();
      /*
          1.使用信号量的方式Semaphore
          2.给不同的线程传递锁的时候按顺序传递
       */
  }
}