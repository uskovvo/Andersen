package ObserverPattern;

public class Human implements Observer{
    @Override
    public void handleEvent(boolean army, boolean alarm) {
        if(army && alarm){
            System.out.println("На объекте проникновение \n" +
                    "состяние системы: " + army + "\n" +
                    "тревога: " + alarm);
        }else if(!army){
            System.out.println("Объект снят с охраны");
        }
    }
}
