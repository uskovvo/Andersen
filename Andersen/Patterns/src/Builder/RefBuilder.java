package Builder;

import AbstractFactory.Classes.LGRefrigerator;

abstract class RefBuilder {
    LGRefrigerator lgRef;

    void createRef(){
        lgRef = new LGRefrigerator();
    }

    abstract void assignName();
    abstract void assignType();
    abstract void assignHeight();

    LGRefrigerator getLgRef(){
        return lgRef;
    }
}
