package ChainOfResponsibility;

public class Module20000 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount20000Huf() > countNote && AMT.denomination20000 <= money) {
            countNote = money / AMT.denomination20000;
            amt.setCount20000Huf(amt.getCount20000Huf() - countNote);
            money = money - AMT.denomination20000 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством 20000HUF");
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
