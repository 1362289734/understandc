package club.banyuan.demo.thread5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:40 下午
 */
public class MyThread  extends  Thread{
  private static int  i=10;
  @Override
  public void run() {
    //两个线程度i一次减一 当i为0的时候程序结束
    while (i>0){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"在执行减1的操作"+(i--));

    }
  }
}
