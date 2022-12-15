package ChainOfResponsibility;

public class Module10000 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount10000Huf() > countNote && AMT.denomination10000 <= money) {
            countNote = money / AMT.denomination10000;
            amt.setCount10000Huf(amt.getCount10000Huf() - countNote);
            money = money - AMT.denomination10000 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством 10.000HUF");
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
