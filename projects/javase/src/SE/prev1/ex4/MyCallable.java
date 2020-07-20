package SE.prev1.ex4;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    //泛型
    @Override
    public String call() throws Exception {
        System.out.println("执行线程");
        Thread.sleep(1000);
        //可以抛出异常
//        throw new RuntimeException();
        return "返回线程结果";
    }
}
