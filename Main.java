/*
KELOMPOK 11 :
- EDGAR JASON HUSIN / 245150201111047
- DAVE CARNEGIE ONGSAH / 245150200111070
- AL-KHWARIZMI WIDYA BAGASKARA / 245150200111068
 */

import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static long uang = 5000;
    static PowerUp powerUp = new PowerUp();
    static Komoditi komoditi = new Komoditi();
    static Upgrade upgrade1 = new Upgrade();

    static int jenisKomoJual;
    static long komoditiJual;
    static long uangJual;
    public static int komoTamMain = upgrade1.getKomoTam();

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
        System.out.println("\u001B[32m");
        System.out.println("""
                ███████╗ █████╗ ██████╗ ███╗   ███╗███████╗██████╗ ███████╗    ████████╗██╗   ██╗ ██████╗ ██████╗  ██████╗ ███╗   ██╗
                ██╔════╝██╔══██╗██╔══██╗████╗ ████║██╔════╝██╔══██╗██╔════╝    ╚══██╔══╝╚██╗ ██╔╝██╔════╝██╔═══██╗██╔═══██╗████╗  ██║
                █████╗  ███████║██████╔╝██╔████╔██║█████╗  ██████╔╝███████╗       ██║    ╚████╔╝ ██║     ██║   ██║██║   ██║██╔██╗ ██║
                ██╔══╝  ██╔══██║██╔══██╗██║╚██╔╝██║██╔══╝  ██╔══██╗╚════██║       ██║     ╚██╔╝  ██║     ██║   ██║██║   ██║██║╚██╗██║
                ██║     ██║  ██║██║  ██║██║ ╚═╝ ██║███████╗██║  ██║███████║       ██║      ██║   ╚██████╗╚██████╔╝╚██████╔╝██║ ╚████║
                ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝       ╚═╝      ╚═╝    ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝
                Made by kelompok suka tidur (Bagas, Edgar, Dave)                                                                                                 \s
                """);

        System.out.println("\u001B[0m");
        System.out.println("""
                Selamat datang di Farmer Tycoon!
                Kamu menjadi seorang tengkulak yang menjual hasil pertanian dan mendapatkan keuntungan.
                Dalam game ini kemampuan berjualan dan manajemen keuangan kamu akan diuji!
                Secara bertahap, komoditi akan terbuka sesuai update.
                Kamu dapat melakukan berbagai upgrade dan bahkan Gacha!
                
                """);

        System.out.println("Sebelum bermain, silahkan lakukan registrasi terlebih dahulu");

        System.out.print("Nama Pertanian Anda = ");
        String namaTempat = scan.nextLine();

        System.out.print("Nama Anda = ");
        String namaUser = scan.nextLine();

        System.out.println("""
                Selamat, Lumbung Anda telah dibuat!
                
                Presiden memberikan Anda hadiah komoditi di awal sebanyak 500 kg masing-masing komoditi 
                dan uang awal sebanyak $5,000 untuk modal awal memulai bisnis pertanian Anda.
                
                Pergunakan hadiah tersebut dengan bijak!
                
                Selamat bekerja....
                """);

        //looping menu
        do{
            long lumbungPadiMain = Komoditi.getLumbungPadi();
            long lumbungJagungMain = Komoditi.getLumbungJagung();
            long lumbungKacangMain = Komoditi.getLumbungKacang();
            long lumbungKapasMain = Komoditi.getLumbungKapas();

            if (komoTamMain == 0){
                lumbungKacangMain = 0;
                lumbungKapasMain = 0;
            } else if (komoTamMain == 1) {
                lumbungKapasMain= 0;
            }

            int cekBadai = powerUp.perlindunganBadai(padiMain,jagungMain,kacangMain,kapasMain);
            if(cekBadai==1){
                padiMain = powerUp.getPadiPU();
                jagungMain = powerUp.getJagungPU();
                kacangMain = powerUp.getKacangPU();
                kapasMain = powerUp.getKapasPU();
            }

            //nama
            System.out.printf("""
                    \n------------------------------------------------------------------------------------------
                    Farm Name : %s
                    Owner     : %s
                    ------------------------------------------------------------------------------------------
                    """,namaTempat,namaUser);

            //status uang dan komoditi
            System.out.printf("""
                    KOMODITI  >> Padi %d kg | Jagung %d kg | Kacang %d kg | Kapas %d kg
                    
                    LUMBUNG   >> Padi %d kg | Jagung %d kg | Kacang %d kg | Kapas %d kg
                    
                    UANG      >> $ %s
                    
                    POWER-UPS >> """,padiMain,jagungMain,kacangMain,kapasMain,lumbungPadiMain,lumbungJagungMain,
                    lumbungKacangMain,lumbungKapasMain,uang);



            PowerUp.tampilPowerUp();
            System.out.print("                    \n" +
                    "------------------------------------------------------------------------------------------\n");

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
