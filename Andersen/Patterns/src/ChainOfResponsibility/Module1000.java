package ChainOfResponsibility;

public class Module1000 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount1000Huf() > countNote && AMT.denomination1000 <= money) {
            countNote = money / AMT.denomination1000;
            amt.setCount1000Huf(amt.getCount1000Huf() - countNote);
            money = money - AMT.denomination1000 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством " + amt.getHUF1000());
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
