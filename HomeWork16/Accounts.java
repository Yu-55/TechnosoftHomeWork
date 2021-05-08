package HomeWork16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Accounts {
    private String accType;

    private static long accNumber = 1111111111L;
    private static Map<Long, Double> accountAndBalance = new HashMap<>();

    public long createAccount(String accType) {
        long output = -1;
        if (!accType.equalsIgnoreCase("checking") && !accType.equalsIgnoreCase("saving")) {

        } else {
            this.accType = accType;
            long newAccNumber = accNumber + 1;
            accountAndBalance.put(newAccNumber, 0.0);
            output = newAccNumber % 10000;
        }
        return output;
    }

    public double accountBalance(long accountNumber) {

        double balanceAmount = -1;
        for (long accountN : accountAndBalance.keySet()) {
            if (accountN == accountNumber) {
                balanceAmount = accountAndBalance.get(accountN);
            }
        }
        return balanceAmount;
    }

    public double makeDeposit(long accNumber, long amount) {
        double balanceAmount = -1;
        for (long accountN : accountAndBalance.keySet()) {
            if (accountN == accNumber) {
                if (amount < 0) {
                    System.out.println("Please enter valid amount");
                } else {
                    balanceAmount = accountAndBalance.get(accountN) + amount;
                    accountAndBalance.put(accNumber, balanceAmount);
                }
            }
        }


        return balanceAmount;
    }

    public double withDraw(long accountNum, long amount) {
        double balanceAmount = -1;
        for (long accountN : accountAndBalance.keySet()) {
            if (accountN == accountNum) {
                if (amount < 0) {
                    System.out.println("Please enter valid amount");
                } else {
                    balanceAmount = accountAndBalance.get(accountN) - amount;
                    accountAndBalance.put(accNumber, balanceAmount);
                }
            }
        }
        return balanceAmount;
    }
}
