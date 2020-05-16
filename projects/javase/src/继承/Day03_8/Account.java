package 继承.Day03_8;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(){

    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    //存款
    public void deposit(Customer cus,double number){
        cus.getAccount().setBalance(cus.getAccount().getBalance()+number);
        System.out.println("成功存入："+number);
        cus.display(cus);
    }
    //提款
    public void withdraw(Customer cus,double number){
        double last = cus.getAccount().getBalance();
        if (last>number){
            System.out.println("成功取出："+number);
            cus.getAccount().setBalance(cus.getAccount().getBalance()-number);
            cus.display(cus);
        }else{
            System.out.println("余额不足，取款失败");
            cus.display(cus);
        }

    }
}
class TestBank{
    public static void main(String[] args) {
        Customer cus = new Customer("Jane","Smith");
        cus.setAccount("1000",2000,1.23);
        cus.deposit(cus,100);
        cus.withdraw(cus,960);
        cus.withdraw(cus,2000);
    }
}
