package SE.prev1.ex3;

public class Customer extends  Thread{

    private Shop shop;

    public Customer(Shop shop,String name) {
        super(name);
        this.shop = shop;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buy();
        }
//        while (shop.getInventory()>0){
//            buy();
////            sitdown();
//        }

    }

    private void buy() {
        synchronized (shop){
            int inventory = shop.getInventory();
            sitdown();
            shop.setInventory(inventory-1);
        }

        System.out.println(getName()+"购买一件商品");
    }


    public void sitdown(){
        System.out.println("休息一会");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
