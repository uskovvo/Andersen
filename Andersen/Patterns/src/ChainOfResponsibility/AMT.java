package ChainOfResponsibility;

public class AMT {
    protected static final int denomination500 = 500;
    protected static final int denomination1000 = 1000;
    protected static final int denomination2000 = 2000;
    protected static final int denomination5000 = 5000;
    protected static final int denomination10000 = 10000;
    protected static final int denomination20000 = 20000;
    private final String HUF500 = "500 Huf";
    private final String HUF1000 = "1000 Huf";
    private final String HUF2000 = "2000 Huf";
    private final String HUF5000 = "5000 Huf";
    private final String HUF10000 = "10000 Huf";
    private final String HUF20000 = "20000 Huf";

    private int count500Huf;
    private int count1000Huf;
    private int count2000Huf;
    private int count5000Huf;
    private int count10000Huf;
    private int count20000Huf;

    private int countMoneyInAtm;

    public AMT() {
        this.count500Huf = getRandomInt();
        this.count1000Huf = getRandomInt();
        this.count2000Huf = getRandomInt();
        this.count5000Huf = getRandomInt();
        this.count10000Huf = getRandomInt();
        this.count20000Huf = getRandomInt();
    }

    private int getRandomInt() {
        int n = (int) (Math.random() * 11);
        if(n != 11){
            return n;
        }
        return 0;
    }

    public int getCountMoneyInAtm(){
        countMoneyInAtm = count500Huf * denomination500 +
                count2000Huf * denomination1000 +
                count1000Huf * denomination2000 +
                count5000Huf * denomination5000 +
                count10000Huf * denomination10000 +
                count20000Huf * denomination20000;

        return countMoneyInAtm;
    }

    public void setCount500Huf(int count500Huf) {
        this.count500Huf = count500Huf;
    }

    public void setCount1000Huf(int count1000Huf) {
        this.count1000Huf = count1000Huf;
    }

    public void setCount2000Huf(int count2000Huf) {
        this.count2000Huf = count2000Huf;
    }

    public void setCount5000Huf(int count5000Huf) {
        this.count5000Huf = count5000Huf;
    }

    public void setCount10000Huf(int count10000Huf) {
        this.count10000Huf = count10000Huf;
    }

    public void setCount20000Huf(int count20000Huf) {
        this.count20000Huf = count20000Huf;
    }

    public void setCountMoneyInAtm(int money){
        this.countMoneyInAtm = money;
    }

    public int getCount500Huf() {
        return count500Huf;
    }

    public int getCount1000Huf() {
        return count1000Huf;
    }

    public int getCount2000Huf() {
        return count2000Huf;
    }

    public int getCount5000Huf() {
        return count5000Huf;
    }

    public int getCount10000Huf() {
        return count10000Huf;
    }

    public int getCount20000Huf() {
        return count20000Huf;
    }

    public String getHUF500() {
        return HUF500;
    }

    public String getHUF1000() {
        return HUF1000;
    }

    public String getHUF2000() {
        return HUF2000;
    }

    public String getHUF5000() {
        return HUF5000;
    }

    public String getHUF10000() {
        return HUF10000;
    }

    public String getHUF20000() {
        return HUF20000;
    }
}
