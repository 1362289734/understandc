package SE.prev1.ex4;

import java.util.concurrent.*;

public class Demo extends Thread {
    //线程池
    public Demo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() == this);
//        System.out.println(getName()+" 启动");
//        System.out.println(Thread.currentThread().getName()+" 启动");
    }

    public static void main(String[] args) {

        Demo demo = new Demo("线程1");
//        demo.start();
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("启动");
//            }
//        });
//
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(demo);

//        executorService.shutdown();
//        List<Runnable> runnables = executorService.shutdownNow();//带有返回值
        //向线程池中启动的线程传递中断标志


//        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 20; i++) {
//            int index = i;
//            executorService1.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("线程启动"+ index);
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }


        //只允许提交一个任务
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();


//        executorService2.awaitTermination();//等待线程执行结束
        Future<String> submit = executorService2.submit(new MyCallable());
        try {
            String s = submit.get();//获得Callable()的返回值
            System.out.println(s);
        } catch (InterruptedException|ExecutionException e) {
            e.printStackTrace();
        }
    }



}
