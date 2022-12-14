package ChainOfResponsibility;

public class Module5000 extends Module {

    @Override
    void takeMoney(int money, AMT amt) {
        if (amt.getCount5000Huf() > countNote && AMT.denomination5000 <= money) {
            countNote = money / AMT.denomination5000;
            amt.setCount5000Huf(amt.getCount5000Huf() - countNote);
            money = money - AMT.denomination5000 * countNote;
            amt.setCountMoneyInAtm(amt.getCountMoneyInAtm() - money);
            System.out.println(amt.getCountMoneyInAtm());
            System.out.println("Выдано " + countNote + " купюр достоинством " + amt.getHUF5000());
        }

        if (money > 0 && next != null){
            next.takeMoney(money, amt);
        }
    }
}
