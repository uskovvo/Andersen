package ChainOfResponsibility;

import java.util.Scanner;

public class SomeUser {

    public SomeUser(){
        AMT amt = new AMT();
        RequestMoney requestMoney = new RequestMoney(getSum(), amt);
    }

    private int getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько денег вы хотите снять?\n" +
                "Введите сумму: ");

        return scanner.nextInt();
    }

}
