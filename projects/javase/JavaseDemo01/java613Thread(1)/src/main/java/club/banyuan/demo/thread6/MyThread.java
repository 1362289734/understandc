package club.banyuan.demo.thread6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:49 下午
 */
public class MyThread implements  Runnable {

  private  int  i=100;
  @Override
  public void run() {
    //两个线程度i一次减一 当i为0的时候程序结束
    while (i>0){
      System.out.println(Thread.currentThread().getName()+"进来了....");
      synchronized (this){  //
        System.out.println(Thread.currentThread().getName()+"在卖第"+(i--)+"张");
      }
      try {
        Thread.sleep((int)(Math.random()*1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
   }
  }
}
