import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Phone {
    public String color;
    public String material;
    private final long imei = generateNumber(1000000, 9999999) ;

    public int batteryLife;

    ArrayList<Contact> contacts = new ArrayList<>();
    ArrayList<Message> messages = new ArrayList<>();
    ArrayList<Call> calls = new ArrayList<>();

    Phone(){
        color = "";
        material = "";
        batteryLife = 0;
    }

    Phone(String color, String material, int batteryLife){
        this.color = color;
        this.material = material;
        this.batteryLife = batteryLife;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public long getImei(){
        return imei;
    }


    long generateNumber(long min, long max)
    {
        Random rand = new Random();
        long randomNumber = rand.nextLong((max - min) + 1) + min;
        return randomNumber;
    }

    public void addContact(int index, String phoneNumber, String firstName, String lastName){
        Contact cnt = new Contact(index, phoneNumber, firstName, lastName);
        contacts.add(cnt);
    }

    public void listContacts(){
        for(Contact aux : contacts){
            System.out.println(aux.index + " " + aux.phoneNumber + " " + aux.firstName + " " + aux.lastName);
        }
    }

    public void sendMessage(String phoneNumber, String message){
        boolean found = false;
        for(Contact aux : contacts){
            if(aux.phoneNumber == phoneNumber){
                found = true;
            }
        }
        if(message.length() > 500){
            System.out.println("The message is too long! (max 500 characters)");
        }
        else if(batteryLife - 1 < 0){
            System.out.println("Low battery level");
        }else{
            if(found == true)
            {
                batteryLife = batteryLife - 1;
                Message message1 = new Message(phoneNumber, message);
                messages.add(message1);
            }else{
                System.out.println("Unknown phone number");
            }
        }

    }

    public void listMessages(){
        for(Message aux : messages)
        {
            System.out.println(aux.phoneNumber + " " + aux.message);
        }
    }

    public void call(String phoneNumber){
        boolean found = false;
        for(Contact aux : contacts){
            if(aux.phoneNumber == phoneNumber){
                found = true;
            }
        }
        if(batteryLife - 2 < 0){
            System.out.println("Low level battery");
        }else{
            if(found == true)
            {
                batteryLife = batteryLife - 2;
                LocalDateTime now = LocalDateTime.now();
                Call call = new Call(phoneNumber, now);
                calls.add(call);
            }else{
                System.out.println("Unknown phone number");
            }
        }

    }

    public void viewHistory(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
        for(Call aux : calls)
        {
            System.out.println(aux.phoneNumber + " " + df.format(aux.dateTime));
        }
    }
}
