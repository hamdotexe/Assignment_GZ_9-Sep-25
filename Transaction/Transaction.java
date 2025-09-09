package Transaction;

import java.util.ArrayList;

public class Transaction {
    static ArrayList <Transaction> history = new ArrayList<>();

    public Transaction() {
        history.add(this);
        System.out.println("Transaction created.");
    }

}
