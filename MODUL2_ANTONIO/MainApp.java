public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir unknwn = new TransportasiAir(3, 100000);
        Sampan sampan = new Sampan(10,50000,1);
        Kapal kapal = new Kapal(20, 200000, "mesin diesel");
        unknwn.informasi();
        unknwn.berlabuh();
        unknwn.berlabuh();
        System.out.println();
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println();
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);

    }
}
