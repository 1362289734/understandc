package club.banyuan.demo.thread8;

import java.util.concurrent.Semaphore;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 3:29 下午
 */
public class MyThread extends Thread{
  /**
   * 死锁:    是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
   */
  private  boolean  flag;  //同时执行
  public MyThread(String name,boolean  flag) {
    super(name);
    this.flag=flag;
  }
  @Override
  public void run() {
    //如果张三先进来了 首先要拿到其中一个锁  再拿另一个锁
    //wait();  表示线程等待执行 并且 释放锁
    if(flag){
      synchronized (DieLock.dao){
        System.out.println(Thread.currentThread().getName()+"拿到了刀..");
        synchronized (DieLock.cha){
          System.out.println(Thread.currentThread().getName()+"拿到了叉...");
        }
      }
    }else {
      synchronized (DieLock.cha){
        System.out.println(Thread.currentThread().getName()+"拿到了叉...");
        synchronized (DieLock.dao){
          System.out.println(Thread.currentThread().getName()+"拿到了刀...");
        }
      }
    }
  }
}
class  DieLock{
  static final Object  dao=new Object();
  static final Object  cha=new Object();
  //Semaphore 是 synchronized 的加强版，作用是控制线程的并发数量
  public static final Semaphore a1 = new Semaphore(1);
  public static final Semaphore a2 = new Semaphore(1);

  // Semaphore详解: https://www.cnblogs.com/klbc/p/9500947.html
}
class  TestDieLock{
  public static void main(String[] args) {
    MyThread  myThread1=new MyThread("特朗普",true);
    MyThread  myThread2=new MyThread("希拉里",false);
    myThread1.start();
    myThread2.start();
  }
}