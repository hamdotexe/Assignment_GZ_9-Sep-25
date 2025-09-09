package Account;

import Transaction.*;
import java.util.Scanner;

public class Business extends Account implements IT, IBFT {

    public Business(Scanner in) {
        super(in);
    }

    public void internalTransfer(Scanner input) {
        System.out.println("Internal transfer amount: ");
        int amount = input.nextInt();
            System.out.println("Internal transfer of " + amount + " successful.");
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
