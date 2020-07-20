package club.banyuan.demo.thread6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:49 下午
 */
public class MyThread implements Runnable {

  /**
   * 锁的对象分为两类 可以是类文件,也可以是任意对象(必须得保持唯一性)
   *  同步代码块的锁对象可以是任意对象 但是这个锁一定是唯一的
   */

  private int i = 100;
  int x = 10;

  @Override
  public void run() {
    //两个线程度i一次减一 当i为0的时候程序结束
    while (i>0){
      System.out.println(Thread.currentThread().getName()+"进来了....");
      synchronized (Tool.OBJ){  //  只要保证锁的唯一性 一般情况下如果代码块是直接在
        //run方法里面的   就建议使用 this 作为锁对象
        System.out.println(Thread.currentThread().getName()+"在卖第"+(i--)+"张");
      }
      try {
        Thread.sleep((int)(Math.random()*1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
//    while (i>0) {
//      if (x % 2 == 0) {
//        method();
//      } else {
//        method2();
//      }
//      x++;
//    }
  }

  /**
   * 同步方法和同步代码块 怎么使用
   *  如果锁对象是this,可以使用同步方法
   *    否则尽可能去使用同步代码块
   */

  private synchronized void method() {  //同步方法的的对象是  this
    if(i>0){
      System.out.println(Thread.currentThread().getName() + "在卖第" + (i--) + "张");
    }
    try {
      Thread.sleep((int) (Math.random() * 1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
//静态的同步方法是 当前类文件    非静态的同步方法是 this  当前对象
  private    synchronized void method2() {

    if(i>0){
      System.out.println(Thread.currentThread().getName() + "在卖第" + (i--) + "张");
    }
    try {
      Thread.sleep((int) (Math.random() * 1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}


