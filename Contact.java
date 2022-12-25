public class Contact{
    public int index;
    public String phoneNumber;
    public String firstName;
    public String lastName;
    Contact(){
        index = 0;
        phoneNumber = firstName = lastName = "";
    }

    Contact(int index, String phoneNumber, String firstName, String lastName){
        this.index = index;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
