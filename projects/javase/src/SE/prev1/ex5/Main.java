package SE.prev1.ex5;

public class Main {
    //扩展哲学家类，记录吃饭、思考次数的功能,记录饿了多少次肚子
    //main方法执行一分钟后，停止所有哲学家线程，打印所有哲学家的记录结果


    static Chopsticks[] chopsticks = new Chopsticks[5];

    static Philosophy[] philosophies = new Philosophy[5];

    public static void main(String[] args) {


        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Chopsticks(i+1);
        }

        for (int i = 0; i < philosophies.length; i++) {
            philosophies[i] = new Philosophy("哲学家"+(i+1),chopsticks[i],chopsticks[(i+1)%5]);
            philosophies[i].start();

        }

    }

}
