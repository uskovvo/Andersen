package ObserverPattern;

public class Police implements Observer{
    @Override
    public void handleEvent(boolean army, boolean alarm) {
        if(army && alarm){
            System.out.println("Мы получили сообщение, что на объекте проникновение \n" +
                    "состяние системы: " + army + "\n" +
                    "тревога: " + alarm);
        }else if(!army){
            System.out.println("Мы получили сообщение, что объект снят с охраны");
        }
    }
}
