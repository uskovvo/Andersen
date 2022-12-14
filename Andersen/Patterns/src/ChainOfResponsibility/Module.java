package ChainOfResponsibility;

abstract class Module {

    protected Module next;
    protected int countNote;

    abstract void takeMoney(int money, AMT amt);

    void setNextMoneyModule(Module module){
        next = module;
    }
}
