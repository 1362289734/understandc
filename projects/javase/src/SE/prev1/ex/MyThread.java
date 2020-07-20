package SE.prev1.ex;

public class MyThread extends Thread {

    private String myName;

    public MyThread(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getMyName() + "   "+i);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程1");
        myThread.start();
        MyThread myThread2 = new MyThread("线程2");
        myThread2.start();
    }
}
