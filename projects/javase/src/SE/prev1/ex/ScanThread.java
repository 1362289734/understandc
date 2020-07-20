package SE.prev1.ex;

import java.util.Scanner;

public class ScanThread extends Thread {

    public ScanThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(Thread.currentThread().getName()+"going");
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            try {
                for (char aChar : chars) {
                    System.out.print(aChar);
                    Thread.sleep(500);//sleep函数建议直接用父类的Thread
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        ScanThread scanThread = new ScanThread("线程1");
        scanThread.start();
        ScanThread scanThread2 = new ScanThread("线程2");
        scanThread2.start();
    }
}
