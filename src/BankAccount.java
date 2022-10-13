public class BankAccount {
    /*
    1.Создайте переменную balance
    2.Создайте конструктор для BankAccount
    3.Создайте три метода: один для внесения средств(который принимает в качестве параметра сумму вносимых средств - amount)
    второй для снятия средств
    и третий для вывода баланса
     */

    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void addBalance(double amount){
        balance = balance + amount;
    }

    public void withDraw(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.print("balance= " + balance);
    }


}
