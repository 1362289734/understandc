package club.banyuan.demo.thread2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 9:41 上午
 */
public class ThreadDemo {

  /**
   * 线程的调度模型
   *    分时调度模型
   *        所有的线程轮流使用cpu执行权  平均分配每个线程占用cpu时间段
   *    抢占式调度模型
   *        优先让优先级高的线程使用cpu 如果优先级一样则随机选择一个线程执行    优先级高的线程
   *        获取时间片段相对多点
   *
   * @param args
   */



  public static void main(String[] args) {
     new Object();  //请问一个主方法在执行的时候最少有几个线程在执行
      //最少有两个   一个要执行主方法  一个线程进行垃圾回收  jvm的启动是多线程的
    MyThread myThread = new MyThread();
    myThread.setName("线程A");
    //myThread.setPriority(6);
    //myThread.run(); //这种写法是不是对普通方法的调用
    myThread.start();//启动 线程
    //myThread.start();//不能二次启动相同的线程
    MyThread myThread2 = new MyThread();
    myThread2.setName("线程B");
   // myThread2.setPriority(1);
    myThread2.start();

    MyThread myThread3 = new MyThread();
    myThread3.setName("线程C");
    //myThread3.setPriority(5);
    myThread3.start();
//    MyThread myThread4 = new MyThread();
//    myThread4.setName("线程D");
//    myThread4.setPriority(10);
//    myThread4.start();
//    MyThread myThread5 = new MyThread();
//    myThread5.setName("线程E");
//    myThread5.setPriority(7);
//    myThread5.start();


  }

}
