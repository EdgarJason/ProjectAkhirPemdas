import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static int counter = 0;
    public static long uang = 5000;
    static PowerUp powerUp = new PowerUp();
    static Komoditi komoditi = new Komoditi();
    static Upgrade upgrade1 = new Upgrade();

    static long lumbungPadiMain = Komoditi.getLumbungPadi();
    static long lumbungJagungMain = Komoditi.getLumbungJagung();

    static int jenisKomoJual;
    static long komoditiJual;
    static long uangJual;
    public int komoTamMain = upgrade1.getKomoTam();

    public static void main(String[] args) {
        Komoditi.setJumlahPadi(500);
        Komoditi.setJumlahJagung(500);
        long jagungMain = Komoditi.getJagung();
        long padiMain = Komoditi.getPadi();
        long kapasMain = Komoditi.getKapas();
        long kacangMain = Komoditi.getKacang();


        Jualan jualan = new Jualan();
        Gacha gacha = new Gacha();
        Upgrade upgrade = new Upgrade();
        int pilihan;

        //tampilan awal untuk registrasi
        System.out.println("---FARMER TYCOON---");
        System.out.println("Silahkan lakukan registrasi terlebih dahulu");

        System.out.print("Nama Pertanian Anda = ");
        String namaTempat = scan.nextLine();
        System.out.print("Nama Anda = ");
        String namaUser = scan.nextLine();

        System.out.println("""
                Selamat, Pertanian Anda telah dibuat!
                
                Presiden memberikan Anda hadiah komoditi di awal sebanyak 500 kg masing-masing komoditi 
                dan uang awal sebanyak $5,000 untuk modal awal memulai pertanian Anda.
                
                Pergunakan hadiah tersebut dengan bijak!
                
                Selamat bekerja....
                
                """);

        //looping menu
        do{
        /*    int jagung = Komoditi.getJagung();
            int padi = Komoditi.getPadi();
            int kapas = Komoditi.getKapas();
            int kacang = Komoditi.getKacang(); */

            counter++;
            powerUp.perlindunganBadai();

            //nama
            System.out.printf("""
                    \n---------------------------------
                    Farm Name : %s
                    Owner     : %s
                    ---------------------------------
                    """,namaTempat,namaUser);

            //status uang dan komoditi
            System.out.printf("""
                    ~STATUS~
                    Komoditi Anda
                    Padi %d kg
                    Jagung %d kg
                    Kacang %d kg
                    Kapas %d kg
                    
                    Uang
                    $ %s
                    
                    Power Ups
                    """,padiMain,jagungMain,kacangMain,kapasMain,uang);
            PowerUp.tampilPowerUp();
            System.out.print("                    \n" +
                    "---------------------------------\n");

            //menu
            System.out.println("""
                    Menu:
                    1. Resupply
                    2. Jual Barang
                    3. Gacha
                    4. Power Up
                    5. Upgrade
                    6. Selesai main
                   
                    """);

            System.out.print("Silahkan pilih = ");
            pilihan  = scan.nextInt();

            //switch case menu berdasarkan pilihan
            switch(pilihan){
                case 1 -> {
                    System.out.println("RESUPPLY");
                    Resupply resupply = new Resupply();
                    resupply.beliStok(padiMain, jagungMain, kacangMain, kapasMain, uang);
                    int cek = resupply.getInput();
                    if (cek == 1){
                        padiMain= resupply.getPadiRE();
                        uang = resupply.getUangSisa();
                    }
                    else if (cek == 2){
                        jagungMain= resupply.getJagungRE();
                        uang = resupply.getUangSisa();
                    }
                    else if (cek == 3){
                        kacangMain= resupply.getKacangRE();
                        uang = resupply.getUangSisa();
                    }
                    else if (cek == 4){
                        kapasMain= resupply.getKapasRE();
                        uang = resupply.getUangSisa();
                    }
                    uang = powerUp.diskonRE(uang);
                }

                case 2 -> {
                    System.out.println("JUAL BARANG");
                    jenisKomoJual = jualan.jualTampil(padiMain, jagungMain, kacangMain, kapasMain, uang);
                    komoditiJual = jualan.getKomoditiJual();
                    uangJual = jualan.getUangJual();
                    if (jenisKomoJual == 0){
                        padiMain = komoditiJual;
                        uang = uangJual;
                    }
                    else if (jenisKomoJual == 1){
                        jagungMain = komoditiJual;
                        uang = uangJual;
                    }
                    else if (jenisKomoJual == 2){
                        kacangMain = komoditiJual;
                        uang = uangJual;
                    }
                    else if (jenisKomoJual == 3){
                        kapasMain = komoditiJual;
                        uang = uangJual;
                    }
                    if (powerUp.getPowerUp1() > 0){
                        powerUp.setPowerUpQuantity1(powerUp.getPowerUp1()-1);
                        uang = powerUp.penambahUang(uang);
                    }

                }

                case 3 -> {
                    System.out.println("GACHA");
                    gacha.Taruhan();
                }

                case 4 -> {
                    System.out.println("POWER UP");
                    uang = powerUp.beliPowerUp(uang);
                }

                case 5 -> {
                    System.out.println("UPGRADE");
                    upgrade.UpgradeMain();
                }

                case 6 -> {
                    System.out.print("Apakah Anda yakin? (Y/N) = ");
                    String jb = scan.next();

                    if(jb.equalsIgnoreCase("y")) {
                        System.out.println("""
                                Data akan terhapus setelah Anda keluar.
                                Sampai Jumpa!
                                """);
                        pilihan = 7;
                    }

                    else {
                        System.out.println("Kembali ke halaman menu...");
                    }

                }
                default -> System.out.println("Pilihan menu tidak sesuai, silahkan ulangi!");

            }
        }
        while(pilihan!=7);
    }
}
