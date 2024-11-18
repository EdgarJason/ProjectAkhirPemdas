import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static int counter = 0;
    public static long uang = 5000;
    static PowerUp powerUp = new PowerUp();
    static Komoditi komoditi = new Komoditi();
    static Upgrade upgrade1 = new Upgrade();
    public static void main(String[] args) {

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
                
                Presiden telah memberikan Anda bundle komoditi di awal sebanyak 500 kg masing-masing komoditi 
                dan uang awal sebanyak $5,000 untuk memulai pertanian Anda.
                
                Pergunakan modal awal tersebut dengan bijak!
                
                Selamat bekerja....
                
                """);

        //looping menu
        do{
            int jagung = Komoditi.getJagung();
            int padi = Komoditi.getPadi();
            counter++;
            powerUp.perlindunganBadai(counter);

            //nama
            System.out.printf("""
                    ---------------------------------
                    Farm Name : %s
                    Owner     : %s
                    ---------------------------------
                    """,namaTempat,namaUser);

            //status uang dan komoditi
            System.out.printf("""
                    STATUS
                    Komoditi Anda
                    Padi %dkg
                    Jagung %dkg
                    
                    
                    Uang
                    $ %s
                    
                    Power Ups
                    """,padi,jagung,uang);
            PowerUp.tampilPowerUp();
            System.out.print("                    \n" +
                    "---------------------------------\n");

            //menu
            System.out.println("""
                    Menu:
                    Uang Anda tersisa:
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
                }

                case 2 -> {
                    System.out.println("JUAL BARANG");

                }

                case 3 -> {
                    System.out.println("GACHA");
                    Gacha gacha = new Gacha();
                    gacha.Taruhan();
                }

                case 4 -> {
                    System.out.println("POWER UP");
                   uang = powerUp.beliPowerUp(uang);
                }

                case 5 -> {
                    System.out.println("UPGRADE");
                    Upgrade upgrade = new Upgrade();
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
