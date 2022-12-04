public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Samsung", 32, 2.7F);
        System.out.println("");
        perangkat.informasi();

        Laptop laptop = new Laptop("Seagate", 16, 3.0F, true);
        System.out.println("");
        laptop.informasi();
        laptop.bukaGame("Dota2");
        laptop.kirimEmail("anathanpham@gmail.com");
        laptop.kirimEmail("sebastiandebs@gmail.com", "msumail@gmail.com");

        Handphone handphone = new Handphone("Iphone", 8, 12F, false);
        System.out.println("");
        handphone.informasi();
        handphone.telfon(84379215);
        handphone.kirimSMS(84379215);
        handphone.kirimSMS(84379215, 84379215);
    }
    
}
