package Builder;

public class RefWithoutNoFrost extends RefBuilder{
    @Override
    void assignName() {
        lgRef.setName("Вьюга");
    }

    @Override
    void assignType() {
        lgRef.setType("B");
    }

    @Override
    void assignHeight() {
        lgRef.setHeight(150);
    }
}
