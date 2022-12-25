public class Message {
    public String phoneNumber;
    public String message;

    Message(){
        phoneNumber = message = "";
    }

    Message(String phoneNumber, String message){
        this.phoneNumber = phoneNumber;
        this.message = message;
    }
}
