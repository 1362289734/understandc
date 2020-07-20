package club.banyuan.demo.thread6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/13 1:50 下午
 *
 *  下面程序是多线程环境,共享数据,是多个线程操作共享数据
 *      但是还是造成了一个数据安全问题
 *
 *   解决多少线程数据问题  对线程的共享数据上锁 使数据在任意时刻只能被一个线程执行
 *    java给我们提供了以下方式:
 *      synchronized(对象锁){需要同步(锁住)的代码块}
 */
public class TestRunnable {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    Thread t1 = new Thread(myThread,"张三");
    Thread t2 = new Thread(myThread,"李四");
    t1.start();
    t2.start();

  }

}
