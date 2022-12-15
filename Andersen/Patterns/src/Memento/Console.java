package Memento;

import java.util.Scanner;

public class Console {

    public Console() {
        WriteMessage message = new WriteMessage();
        message.set(getString());
        System.out.println("Вы написали: " + message);
        Memory mem = new Memory();
        mem.setSave(message.saveMessage());
        message.set(getString());
        System.out.println("Вы написали: " + message);
        System.out.println("А до этого вы писали: " + mem.getSave().message());
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пишите сюда: ");

        return scanner.nextLine();
    }
}
