package club.banyuan.demo.thread7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 3:11 下午
 */
public class MyThread {

  /**
   * Lock  jdk1.5之后出现
   */


  private Lock lock = new ReentrantLock();  //创建lock锁对象

  public void lockTes(Thread thread) {
    lock.lock(); //获取锁
    try {
      System.out.println(thread.getName() + "进来了...获取了当前锁...");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
      System.out.println(thread.getName() + "发生了异常,释放了锁...");
    } finally {
      lock.unlock();//主动释放锁
      //System.out.println(thread.getName() + "正常执行完毕..释放了锁....");
    }
  }

  public  void  lockTesNotWait(Thread   thread) throws InterruptedException {

    if(lock.tryLock(3000, TimeUnit.MILLISECONDS)) {  //线程尝试获取锁
      try {
        System.out.println(thread.getName() + "进来了...获取了当前锁...");
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println(thread.getName() + "发生了异常,释放了锁...");
      } finally {
        //System.out.println(thread.getName() + "正常执行完毕..释放了锁....");
        //lock.unlock();//主动释放锁
      }
    }else{
      System.out.println(thread.getName()+"没有获取到锁...被其他线程占用了....");
    }
  }

}
class TestMyThread{

  public static void main(String[] args) {

    final MyThread myThread = new MyThread();

    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          myThread.lockTes(Thread.currentThread());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }, "线程A");

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          myThread.lockTesNotWait(Thread.currentThread());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }, "线程B");

   t.start();
    t1.start();

  }
  }

