package SE.prev1.ex2;

public class ReverseHelloMultithreaded extends Thread {

    private int num = 1;

    public ReverseHelloMultithreaded(int num) {
        this.num = num;
    }


    public static void doReverseHello() {
        ReverseHelloMultithreaded thread = new ReverseHelloMultithreaded(1);
        thread.start();

    }

    @Override
    public void run() {
        if (num < 50) {
            ReverseHelloMultithreaded thread = new ReverseHelloMultithreaded(num + 1);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from Thread " + num);

    }


    public static void main(String[] args) {
        ReverseHelloMultithreaded.doReverseHello();

    }
}
