package club.banyuan.demo.thread2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 9:46 上午
 */
public class MyThread extends  Thread {

  @Override
  public void run() {  //当某个线程进来之后 让他停下来 不执行 然后呢等后面的线程执行完毕之后在执行
    if (Thread.currentThread().getName().equalsIgnoreCase("线程B")) {
      try {
        System.out.println(Thread.currentThread().getName()+"进来了");
        Thread.sleep(5000); //进来的线程休眠 2000毫秒

        //遇到sleep 当前线程进入休眠(阻塞)状态 释放cpu所分配的权限 会被其他线程抢占
        //当前线程休眠完了之后继续进入抢占cpu执行权资源

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName()+"在执行"+i);
    }
  }

}
