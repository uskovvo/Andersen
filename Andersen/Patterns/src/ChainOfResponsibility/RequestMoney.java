package ChainOfResponsibility;

public class RequestMoney {

    private int money;
    private final AMT amt;
    Module20000 note20k = new Module20000();
    Module10000 note10k = new Module10000();
    Module5000 note5k = new Module5000();
    Module2000 note2k = new Module2000();
    Module1000 note1k = new Module1000();
    Module500 note500 = new Module500();

    public RequestMoney(int money, AMT amt) {
        this.amt = amt;
        setModules();
        requestMoney(money);
    }

    public void requestMoney(int money) {
        System.out.println(amt.getCountMoneyInAtm());
        if (money <= amt.getCountMoneyInAtm()){
            if (money > 0 && money <= 100_000 &&
                    money % AMT.denomination500 == 0) {
                this.money = money;
                note20k.takeMoney(money, amt);
            } else {
                System.out.println("Сумма должна быть не больше 100т.фор. и кратная 500");
            }
        }else {
            System.out.println("В банкомате нет столько денег");
        }
    }

    public void setModules(){
        note20k.setNextMoneyModule(note10k);
        note10k.setNextMoneyModule(note5k);
        note5k.setNextMoneyModule(note2k);
        note2k.setNextMoneyModule(note1k);
        note1k.setNextMoneyModule(note500);
    }
}
