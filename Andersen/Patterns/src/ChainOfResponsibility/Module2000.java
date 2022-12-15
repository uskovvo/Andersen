package ChainOfResponsibility;

public class Module2000 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount2000Huf() > countNote && AMT.denomination2000 <= money) {
            countNote = money / AMT.denomination2000;
            amt.setCount2000Huf(amt.getCount2000Huf() - countNote);
            money = money - AMT.denomination2000 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством 2.000HUF");
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
