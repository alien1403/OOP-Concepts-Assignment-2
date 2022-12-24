import java.util.Random;

public class Phone {
    public String color;
    public String material;
    private final long imei = generateNumber(1000000, 9999999) ;

    Phone(){
        color = "";
        material = "";
    }

    Phone(String color, String material){
        this.color = color;
        this.material = material;
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

    public void addContact(){

    }

    public void listContacts(){

    }

    public void sendMessage(){

    }

    public void listMessages(){

    }

    public void call(){

    }

    public void viewHistory(){

    }



}
