public class Main {
    public static void main(String[] args){
        Phone phone = new SamsungGalaxy6("Red", "Neon");
        System.out.println(phone.getColor());
        System.out.println(phone.getMaterial());
        System.out.println(phone.getImei());
        System.out.println(phone.getClass());

    }
}
