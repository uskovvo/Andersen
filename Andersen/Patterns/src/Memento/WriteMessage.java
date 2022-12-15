package Memento;

public class WriteMessage {

    private String message;

    public void set(String message){
        this.message = message;
    }

    public String getMessageFromMem(SaveMessage save){
        return save.message();
    }

    public SaveMessage saveMessage(){
        return new SaveMessage(message);
    }

    @Override
    public String toString() {
        return message;
    }
}
