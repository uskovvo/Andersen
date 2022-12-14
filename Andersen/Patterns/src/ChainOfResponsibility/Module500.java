package ChainOfResponsibility;

public class Module500 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount500Huf() > countNote && AMT.denomination500 <= money) {
            countNote = money / AMT.denomination500;
            amt.setCount500Huf(amt.getCount500Huf() - countNote);
            money = money - AMT.denomination500 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством " + amt.getHUF500());
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
