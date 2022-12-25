import java.time.LocalDateTime;

public class Call {
    public String phoneNumber;
    public LocalDateTime dateTime;

    Call(String phoneNumber, LocalDateTime dateTime){
        this.phoneNumber = phoneNumber;
        this.dateTime = dateTime;
    }
}
