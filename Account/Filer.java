package Account;

import java.util.Scanner;

public class Filer extends Personal{
    public Filer(Scanner in) {
        super(in);
        this.remainingLimit = 50000000;
    }
}
