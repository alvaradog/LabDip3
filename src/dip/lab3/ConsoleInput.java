package dip.lab3;

import java.util.Scanner;

public class ConsoleInput implements Input{

    private String message;

    public ConsoleInput() {
    }

    @Override
    public final String getMessage() {
        return message;
    }

    @Override
    public final void setMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a message here: ");
        message = keyboard.nextLine();
    }

}
