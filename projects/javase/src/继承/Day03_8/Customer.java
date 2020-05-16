package 继承.Day03_8;

public class Customer extends Account{
    private String firstName;
    private String lastName;
    private Account account = new Account();

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(String id ,double balance,double rate) {
        account.setAnnualInterestRate(rate);
        account.setBalance(balance);
        account.setId(id);
    }

    public Account getAccount() {
        return account;
    }

    public void display(Customer cur){
        System.out.println("Customer ["+cur.firstName+" "+cur.lastName+"] has a account:"
                +"id is :"+this.getAccount().getId()+", annualInterestRate is "+
                this.getAccount().getAnnualInterestRate()+"%, balance is "
                +this.getAccount().getBalance());
    }
}
