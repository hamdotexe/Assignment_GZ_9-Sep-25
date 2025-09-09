import Account.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int control = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Choose What you want to do: \n 1. Create Personal Account \n 2. Create Business Account \n Enter Any other number to exit");
            control = input.nextInt();
            input.nextLine();
            if (control == 1) {
                System.out.println("Choose Account Type: \n 1. Filer \n 2. Non-Filer");
                int type = input.nextInt();
                input.nextLine();
                if (type == 1) {
                    Filer filer = new Filer(input);
                    filer.internalTransfer(input);
                } else if (type == 2) {
                    NonFiler nonFiler = new NonFiler(input);
                    nonFiler.internalTransfer(input);
                } else {
                    System.out.println("Invalid Choice");
                }
            } else if (control == 2) {
                Business business = new Business(input);
                business.internalTransfer(input);
            } else if (control == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice");
                return;
            }
        }
    }
}