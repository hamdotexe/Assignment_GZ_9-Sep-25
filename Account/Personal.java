package Account;

import java.util.ArrayList;

import Transaction.*;
import java.util.Scanner;

class Personal extends Account implements IT, IBFT {

    // private long limit;
    protected long remainingLimit;
    public ArrayList<Transaction> TransactionHistory;

    protected Personal(Scanner in) {
        super(in);
        this.TransactionHistory = new ArrayList<>();
    }

    public void internalTransfer(Scanner input) {
        System.out.println("Internal transfer amount: ");
        int amount = input.nextInt();
        input.nextLine();
        if (amount <= remainingLimit) {
            TransactionHistory.add(new Transaction());
            System.out.println("Internal transfer of " + amount + " successful.");
            remainingLimit -= amount;
        } else {
            System.out.println("Internal transfer failed. Amount exceeds remaining limit of " + remainingLimit);
        }
    }

    public void billBayment() {
        System.out.println("Bill payment method called.");
    }

    public void preVerifiedTransaction() {
        System.out.println("Pre-verified transaction method called.");
    }

    public void Transaction() {
        System.out.println("Transaction method called.");
    }
}
