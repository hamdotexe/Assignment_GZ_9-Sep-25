package Account;

import java.security.SecureRandom;
import java.util.Scanner;
import java.math.BigInteger;

class Account {
    protected String name;
    protected byte[] accNum;
    protected double balance;
    protected String password;

    protected Account(Scanner in) {
        balance = 0.0;

        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your password: ");
        password = in.nextLine();

        SecureRandom random = new SecureRandom();
        accNum = new byte[16];
        random.nextBytes(accNum);

        System.out.println("Account created successfully!");
    }

    public BigInteger getAccNum() {
        return new BigInteger(1, accNum);
    }

}
