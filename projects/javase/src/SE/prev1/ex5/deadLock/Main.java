package SE.prev1.ex5.deadLock;

public class Main {
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
