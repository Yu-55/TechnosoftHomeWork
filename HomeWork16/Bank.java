package HomeWork16;

public class Bank {
    public static void main(String[] args) {
        // Initial  account number is: 1111111112
        Accounts accounts = new Accounts();
        Customer a = new Customer("Boris Born", 848489888, "checking", "460 Lincoln Avenue,Brooklyn,New York 11434");
        a.createAccount();

        a.makeDeposit();
        a.showAllAccountsBalance();

//        a.withDraw();
//        a.editDetails();
//        a.showAccountBalance();
        Customer b = new Customer("Alex Noname", 784678784, "checking");
        b.makeDeposit();
        b.showAllAccountsBalance();
//        b.withDraw();
//        b.createAccount();
//        b.editDetails();
//        b.showAccountBalance();
//        System.out.println(accounts.getAccountAndBalance().size());
    }

}
