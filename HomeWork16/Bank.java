package HomeWork16;

public class Bank {
    public static void main(String[] args) {
        // Initial  account number is: 1111111111

        Customer a = new Customer("Boris Born", 848489888, "checking", "460 Lincoln Avenue,Brooklyn,New York 11434");
        a.createAccount();
        a.createAccount();
        a.makeDeposit();
        a.withDraw();
        a.editDetails();
        a.showAccountBalance();

        Customer b = new Customer("Boris Born", 848489888, "saving");
        b.makeDeposit();
        b.withDraw();
        b.createAccount();
        b.editDetails();
        b.showAccountBalance();
    }

}
