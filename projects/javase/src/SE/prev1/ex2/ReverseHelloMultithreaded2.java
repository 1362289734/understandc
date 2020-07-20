package SE.prev1.ex2;

public class ReverseHelloMultithreaded2 extends Thread {

    private int num = 1;

    public ReverseHelloMultithreaded2(int num) {
        this.num = num;
    }


    public static void doReverseHello() {
       startThread(1);
    }

    @Override
    public void run() {
        if (num < 50) {
            ReverseHelloMultithreaded2 thread = new ReverseHelloMultithreaded2(num + 1);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from Thread " + num);

    }

    public static void startThread(int num) {
        if (num < 50) {
            ReverseHelloMultithreaded thread = new ReverseHelloMultithreaded(num+1);
            thread.start();
            startThread(num+1);

        }
    }


    public static void main(String[] args) {
        ReverseHelloMultithreaded2.doReverseHello();

    }
}
