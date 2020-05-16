package 编程.Day03_1_做错了_没有用接口;

public class Company {
    private Employee [] employee=new Employee[100];
    private HourlyWorker [] hourlyWorkers=new HourlyWorker[100];
    private Salesman [] salesmen=new Salesman[100];
    private PTEmployee [] ptEmployees=new PTEmployee[100];
    private SSEmployee [] ssEmployees=new SSEmployee[100];
    private double sumSalary;

    public  Company(){
        for (int i = 0;i<100;i++){
            employee[i] = new Employee();
            hourlyWorkers[i] = new HourlyWorker();
            salesmen[i] = new Salesman();
            ptEmployees[i] = new PTEmployee();
            ssEmployees[i] = new SSEmployee();
        }
    }

    public void display(Company com){
        int len = getLen(com);
        int len_HW = getHWLen(com);
        int len_SM = getSMLen(com);
        int len_PTE = getPTELen(com);
        int len_SS = getSSLen(com);
        for (int j = 0; j<len;++j){
                System.out.println("员工： "+com.getEmployee()[j].getName()+"   工资："+com.getEmployee()[j].getSalary());
        }
        for (int j = 0; j<len_HW;++j){
            System.out.println("小时工： "+com.getHourlyWorkers()[j].getName()+"   工资："+com.getHourlyWorkers()[j].
                    accountSalary(com,com.getHourlyWorkers()[j].getName()));
        }
        for (int j = 0; j<len_SM;++j){
            System.out.println("销售员： "+com.getSalesmen()[j].getName()+"   工资为："+com.getSalesmen()[j].
                    accountSalary(com,com.getSalesmen()[j].getName()));
        }
        for (int j = 0; j<len_PTE;++j){
            System.out.println("普通员工： "+com.getPtEmployees()[j].getName()+"   工资为："+com.getPtEmployees()[j].
                    accountSalary(com,com.getPtEmployees()[j].getName()));
        }
        for (int j = 0; j<len_SS;++j){
            System.out.println("首饰工人： "+com.getSsEmployees()[j].getName()+"   工资为："+com.getSsEmployees()[j].
                    accountSalary(com,com.getSsEmployees()[j].getName()));
        }
    }

    public void showSalary(Company company,String name){
        int len = getLen(company);
        int len_1 = getHWLen(company);
        int len_2 = getSMLen(company);
        int len_3 = getPTELen(company);
        int len_4 = getSSLen(company);
        for (int i = 0; i<len;i++){
            if (company.getEmployee()[i].getName().equals(name)){
                System.out.println(company.getEmployee()[i].getName()+"的工资为："+company.getEmployee()[i].getSalary());
                break;
            }
        }

        for (int i = 0; i<len_1;i++){
            if (company.getHourlyWorkers()[i].getName().equals(name)){
                System.out.println(company.getHourlyWorkers()[i].getName()+"的工资为："+company.getHourlyWorkers()[i].
                        accountSalary(company,company.getHourlyWorkers()[i].getName()));
                break;
            }
        }
        for (int i = 0; i<len_2;i++){
            if (company.getSalesmen()[i].getName().equals(name)){
                System.out.println(company.getSalesmen()[i].getName()+"的工资为："+company.getSalesmen()[i].
                        accountSalary(company,company.getSalesmen()[i].getName()));
                break;
            }
        }
        for (int i = 0; i<len_3;i++){
            if (company.getPtEmployees()[i].getName().equals(name)){
                System.out.println(company.getPtEmployees()[i].getName()+"的工资为："+company.getPtEmployees()[i].
                        accountSalary(company,company.getPtEmployees()[i].getName()));
                break;
            }
        }
        for (int i = 0; i<len_4;i++){
            if (company.getSsEmployees()[i].getName().equals(name)){
                System.out.println(company.getSsEmployees()[i].getName()+"的工资为："+company.getSsEmployees()[i].
                        accountSalary(company,company.getSsEmployees()[i].getName()));
                break;
            }
        }
    }

    public void showSumSalary(Company company){
//        double index = 0;
        double index_HW = 0;
        double index_SM = 0;
        double index_PT = 0;
        double index_SS = 0;
//        int len = getLen(company);
        int len_HW = getHWLen(company);
        int len_SM = getSMLen(company);
        int len_PT = getPTELen(company);
        int len_SS = getSSLen(company);
//        for (int i = 0; i< len;i++){
//            index+=company.getEmployee()[i].getSalary();
//        }
        for (int i = 0; i< len_HW;i++){
            index_HW+=company.getHourlyWorkers()[i].accountSalary(company,getHourlyWorkers()[i].getName());
        }
        for (int i = 0; i< len_SM;i++){
            index_SM+=company.getSalesmen()[i].accountSalary(company,getSalesmen()[i].getName());
        }
        for (int i = 0; i< len_PT;i++){
            index_PT+=company.getPtEmployees()[i].accountSalary(company,getPtEmployees()[i].getName());
        }
        for (int i = 0; i< len_SS;i++){
            index_SS+=company.getSsEmployees()[i].accountSalary(company,getSsEmployees()[i].getName());
        }
//        company.setSumSalary(index);
//        System.out.println("员工工资总和为："+company.getSumSalary());
        company.setSumSalary(index_HW);
        System.out.println("小时工工资总和为："+company.getSumSalary());
        company.setSumSalary(index_SM);
        System.out.println("销售员工资总和为："+company.getSumSalary());
        company.setSumSalary(index_PT);
        System.out.println("普通员工工资总和为："+company.getSumSalary());
        company.setSumSalary(index_SS);
        System.out.println("首饰工工资总和为："+company.getSumSalary());

        System.out.println("所有员工工资总和为："+(index_HW+index_PT+index_SM+index_SS));
    }

    public void addEmployee(Company com,String name , double salary) {
        for (int i = 0;i<100;++i){
            if (com.getEmployee()[i].getName() == null){
                com.getEmployee()[i].setName(name);
                com.getEmployee()[i].setSalary(salary);
                break;
            }
        }
    }

    public void addHourlyWorker(Company com,String name , double salaryPerHour,double workTime) {
        for (int i = 0;i<100;++i){
            if (com.getHourlyWorkers()[i].getName() == null){
                com.getHourlyWorkers()[i].setName(name);
                com.getHourlyWorkers()[i].setSalaryPerHour(salaryPerHour);
                com.getHourlyWorkers()[i].setWorkTime(workTime);
                break;
            }
        }
    }

    public void addSalesMan(Company com,String name , double basicSalary,double saleMoney) {
        for (int i = 0;i<100;++i){
            if (com.getSalesmen()[i].getName() == null){
                com.getSalesmen()[i].setName(name);
                com.getSalesmen()[i].setBasicSalary(basicSalary);
                com.getSalesmen()[i].setSaleMoney(saleMoney);
                break;
            }
        }
    }

    public void addPTEmployee(Company com,String name , double basicSalary,double workTime) {
        for (int i = 0;i<100;++i){
            if (com.getPtEmployees()[i].getName() == null){
                com.getPtEmployees()[i].setName(name);
                com.getPtEmployees()[i].setBasicSalary(basicSalary);
                com.getPtEmployees()[i].setWorkTime(workTime);
                break;
            }
        }
    }

    public void addSSEmployee(Company com,String name,double number) {
        for (int i = 0;i<100;++i){
            if (com.getSsEmployees()[i].getName() == null){
                com.getSsEmployees()[i].setName(name);
                com.getSsEmployees()[i].setSumOfProduction(number);
                break;
            }
        }
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public HourlyWorker[] getHourlyWorkers() {
        return hourlyWorkers;
    }

    public Salesman[] getSalesmen() {
        return salesmen;
    }

    public void setSumSalary(double sumSalary) {
        this.sumSalary = sumSalary;
    }

    public double getSumSalary() {
        return sumSalary;
    }

    public PTEmployee[] getPtEmployees() {
        return ptEmployees;
    }

    public SSEmployee[] getSsEmployees() {
        return ssEmployees;
    }

    public void deleteEmployee(Company company, String name) {
        System.out.println("删除员工："+name);
        int len = getLen(company);
        int len_HW = getHWLen(company);
        int len_SM = getSMLen(company);
        int len_PT = getPTELen(company);
        int len_SS = getSSLen(company);
        for (int i = 0; i < len; i++) {
            if (company.getEmployee()[i].getName().equals(name)) {
                for (int j = i;j<len;j++){
                    company.getEmployee()[j]=company.getEmployee()[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < len_HW; i++) {
            if (company.getHourlyWorkers()[i].getName().equals(name)) {
                for (int j = i;j<len_HW;j++){
                    company.getHourlyWorkers()[j]=company.getHourlyWorkers()[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < len_SM; i++) {
            if (company.getSalesmen()[i].getName().equals(name)) {
                for (int j = i;j<len_SM;j++){
                    company.getSalesmen()[j]=company.getSalesmen()[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < len_PT; i++) {
            if (company.getPtEmployees()[i].getName().equals(name)) {
                for (int j = i;j<len_PT;j++){
                    company.getPtEmployees()[j]=company.getPtEmployees()[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < len_SS; i++) {
            if (company.getSsEmployees()[i].getName().equals(name)) {
                for (int j = i;j<len_SS;j++){
                    company.getSsEmployees()[j]=company.getSsEmployees()[j+1];
                }
                break;
            }
        }
    }

    public int getLen(Company company) {
        int len = 0;
        for (int b = 0 ; b<100;b++){
            if (company.getEmployee()[b].getSalary() != 0) {
                len++;
            } else{
                break;
            }

        }
        return len;
    }

    public int getHWLen(Company company) {
        int len = 0;
        for (int b = 0 ; b<100;b++){
            if (company.getHourlyWorkers()[b].getWorkTime() != 0) {
                len++;
            } else{
                break;
            }

        }
        return len;
    }

    public int getSMLen(Company company){
        int len = 0;
        for (int b = 0 ; b<100;b++){
            if (company.getSalesmen()[b].getSaleMoney() != 0) {
                len++;
            } else{
                break;
            }

        }
        return len;
    }
    public int getPTELen(Company company){
        int len = 0;
        for (int b = 0 ; b<100;b++){
            if (company.getPtEmployees()[b].getWorkTime() != 0) {
                len++;
            } else{
                break;
            }

        }
        return len;
    }
    public int getSSLen(Company company){
        int len = 0;
        for (int b = 0 ; b<100;b++){
            if (company.getSsEmployees()[b].getSumOfProduction() != 0) {
                len++;
            } else{
                break;
            }

        }
        return len;
    }
}
