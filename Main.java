public class Main {
    public static void main(String[] args){
        Phone phone1 = new SamsungGalaxy6("Red", "Neon", 3);
        phone1.addContact(1, "0766666666", "John", "Simpson");
        phone1.addContact(2, "0764646464", "Albert", "Ionescu");
        phone1.listContacts();

        phone1.sendMessage("0766666666", "Hi!");
        phone1.listMessages();
        phone1.call("0764646464");
        phone1.viewHistory();
    }

}
