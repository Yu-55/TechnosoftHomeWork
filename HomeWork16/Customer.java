package HomeWork16;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private int ssn;
    private String address;
    private static long customerID = 10000000000L;
    private List<Accounts> accountsObject = new ArrayList<>();

    public Customer(String name, int ssn, String accType) {
        name = name.trim();
        if (!name.matches("^[a-zA-Z\\s]*$") || name.length() < 2 || !name.contains(" ")) {
            System.out.println("Please enter valid first and last name");
        } else if (String.valueOf(ssn).length() != 9) {
            System.out.println("Please enter valid ssn");
        } else if (!accType.toLowerCase().trim().equals("checking") && !accType.toLowerCase().trim().equals("saving")) {
            System.out.println("Please enter valid account type, it can be either 'Saving' or 'Checking'");
        } else {
            customerID += 1;
            this.name = name;
            this.ssn = ssn;
            Accounts accounts = new Accounts();
            long output = accounts.createAccount(accType) % 10000;
            System.out.println("Congratulations with your new " + accType + " account \nAccount number: ***" + output+"\n");
        }
    }

    public Customer(String name, int ssn, String accType, String address) {
        name = name.trim();
        if (!name.matches("^[a-zA-Z\\s]*$") || name.length() < 2 || !name.contains(" ")) {
            System.out.println("Please enter valid first and last name");
        } else if (String.valueOf(ssn).length() != 9) {
            System.out.println("Please enter valid ssn");
        } else if (!accType.toLowerCase().trim().equals("checking") && !accType.toLowerCase().trim().equals("saving")) {
            System.out.println("Please enter valid account type, it can be either 'Saving' or 'Checking'");
        } else {
            customerID += 1;
            this.name = name;
            this.ssn = ssn;
            this.address = address;
            Accounts accounts = new Accounts();
            long output = accounts.createAccount(accType) % 10000;
            System.out.println("Congratulations with your new " + accType + " account \nAccount number: ***" + output+"\n");

        }
    }

    public void editDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What information would you like to update: 'Name' or 'Address'");
        String infoValidation = scanner.nextLine().trim();

        while (!infoValidation.equalsIgnoreCase("name") && !infoValidation.equalsIgnoreCase("address")) {
            System.out.println("Please enter what you would like to change: 'Name' or 'Address'");
            infoValidation = scanner.nextLine();
        }
        String nameValidation;
        if (infoValidation.equalsIgnoreCase("name")) {
            System.out.println("Please enter new Name");
            nameValidation = scanner.nextLine().trim();
            while (!nameValidation.matches("^[a-zA-Z\\s]*$") || nameValidation.length() < 2 || !nameValidation.contains(" ")) {
                System.out.println("Please enter valid first and last name");
                nameValidation = scanner.nextLine().trim();
            }
            this.name = nameValidation;
            System.out.println("Name has been updated successfully");
        }
        String addressValidation;
        if (infoValidation.equalsIgnoreCase("address")) {
            System.out.println("Please enter new Address");
            addressValidation = scanner.nextLine().trim();
            this.address = addressValidation;
            System.out.println("Address has been updated successfully");
        }
    }

    public void createAccount() {
        Accounts accounts = new Accounts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of account would you like to create 'Checking' or 'Saving' ? ");
        String validateAccType = scanner.nextLine().toLowerCase().trim();

        long output = accounts.createAccount(validateAccType);
        while (output == -1) {
            System.out.println("Please enter valid account type");
            validateAccType = scanner.nextLine().toLowerCase().trim();
            output = accounts.createAccount(validateAccType);
        }
        System.out.println(validateAccType + " account has been created \nLast 4-digits of account number is " + output % 10000);
    }

    public void makeDeposit() {
        Accounts accounts = new Accounts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your account number");
        String validateAccNumber = scanner.nextLine();

        while (!validateAccNumber.matches("[0-9]+") || accounts.makeDeposit(Long.parseLong(validateAccNumber), 0) == -1) {
            System.out.println("Please enter valid account number");
            validateAccNumber = scanner.nextLine().trim();
        }
        System.out.println("Please enter amount");
        String validateAmount = scanner.nextLine().trim();
        while (!validateAmount.matches("[0-9]+")) {
            System.out.println("Please enter positive number without decimal point");
            validateAmount = scanner.nextLine().trim();
        }
        double balance = accounts.makeDeposit(Long.parseLong(validateAccNumber), Long.parseLong(validateAmount));
        String formattedBalance = NumberFormat.getCurrencyInstance().format(balance);
        System.out.println("Amount has been deposited successfully\nYour updated balance: " + formattedBalance);

    }

    public void showAccountBalance() {
        Accounts accounts = new Accounts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your account number");
        String validateAccNumber = scanner.nextLine();

        while (!validateAccNumber.matches("[0-9]+") || accounts.accountBalance(Long.parseLong(validateAccNumber)) == -1) {
            System.out.println("Please enter valid account number");
            validateAccNumber = scanner.nextLine().trim();
        }
        long accountNumber = Long.parseLong(validateAccNumber);
        double accountBalance = accounts.accountBalance(Long.parseLong(validateAccNumber));
        String formattedBalance = NumberFormat.getCurrencyInstance().format(accountBalance);
        System.out.println("Account number: " + accountNumber + "\n" + "Balance: " + formattedBalance);
    }

    public void showAllAccountsBalance() {
        Accounts accounts = new Accounts();

    }

    public void withDraw() {
        Accounts accounts = new Accounts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your account number");
        String validateAccNumber = scanner.nextLine();

        while (!validateAccNumber.matches("[0-9]+") || accounts.withDraw(Long.parseLong(validateAccNumber), 0) == -1) {
            System.out.println("Please enter valid account number");
            validateAccNumber = scanner.next().trim();
        }
        System.out.println("Please enter amount");
        String validateAmount = scanner.nextLine().trim();
        while (!validateAmount.matches("[0-9]+")) {
            System.out.println("Please enter positive number without decimal point");
            validateAmount = scanner.nextLine().trim();
        }
        double balance = accounts.withDraw(Long.parseLong(validateAccNumber), Long.parseLong(validateAmount));
        String formattedAmount = NumberFormat.getCurrencyInstance().format(Long.parseLong(validateAmount));
        String formattedBalance = NumberFormat.getCurrencyInstance().format(balance);
        System.out.println("Please collect: " + formattedAmount + "\nYour updated balance: " + formattedBalance);
    }
}
























