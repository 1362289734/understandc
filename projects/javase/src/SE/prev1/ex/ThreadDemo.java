package SE.prev1.ex;

public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "   "+i);
            //Thread.yield();不一定会切换到另一个线程继续进行，有可能在原先的线程继续进行

        }
    }



    public static void main(String[] args) {
        ThreadDemo threadDemo= new ThreadDemo();
        Thread thread = new Thread(threadDemo, "线程1");
        thread.setPriority(1);
        thread.start();
        ThreadDemo threadDemo2 = new ThreadDemo();
        Thread thread2 = new Thread(threadDemo2, "线程2");
        thread2.setPriority(2);
        thread2.start();


//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getId());
//        System.out.println(Thread.currentThread().isAlive());
//        System.out.println(Thread.currentThread().isDaemon());
//        System.out.println(Thread.currentThread().isInterrupted());


//        try {
//            System.out.println("准备休眠5s");
//            Thread.sleep(5000);
//            System.out.println("休眠结束");
//
//            //Thread.yield();//建议CPU可以换一个线程继续进行，但是不一定有用
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
