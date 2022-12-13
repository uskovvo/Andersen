package Builder;

public class RefWithNoFrost extends RefBuilder{
    @Override
    void assignName() {
        lgRef.setName("Бирюса");
    }

    @Override
    void assignType() {
        lgRef.setType("A++");
    }

    @Override
    void assignHeight() {
        lgRef.setHeight(190);
    }
}
