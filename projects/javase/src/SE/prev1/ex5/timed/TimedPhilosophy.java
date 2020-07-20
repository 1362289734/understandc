package SE.prev1.ex5.timed;



public class TimedPhilosophy extends Philosophy {
    //哲学家吃饭思考问题
    private int countEat;
    private int countThink;
    private int countHungry;

    public TimedPhilosophy(String name, Chopsticks left, Chopsticks right) {
        super(name, left, right);
    }

    public void eat() throws InterruptedException {
        System.out.println(getName() + "准备吃饭");
        if (!this.left.take(this)) {
            System.out.println(getName()+"饿肚子");
            countHungry++;
            return;
        }
        Thread.sleep(500);
        if (!this.right.take(this)) {
            this.left.put(this);
            System.out.println(getName()+"饿肚子");
            countHungry++;
            return;
        }
        Thread.sleep(500);
        System.out.println(getName() + "吃饭完成");
        countEat++;
        this.right.put(this);
        this.left.put(this);
    }


    public void think() {
        System.out.println(getName() + "准备思考");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "思考完成");
        countThink++;
    }


    @Override
    public String toString() {
        return getName()+"{" +
                "countEat=" + countEat +
                ", countThink=" + countThink +
                ", countHungry=" + countHungry +
                '}';
    }
}
