package Account;

import java.util.Scanner;

public class NonFiler extends Personal{
    public NonFiler(Scanner in) {
        super(in);
        this.remainingLimit = 1000000;
    }
}
