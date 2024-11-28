/*
KELOMPOK 11 :
- EDGAR JASON HUSIN / 245150201111047
- DAVE CARNEGIE ONGSAH / 245150200111070
- AL-KHWARIZMI WIDYA BAGASKARA / 245150200111068
 */

import java.util.Scanner;

public class Upgrade {
    public static Scanner scan = new Scanner(System.in);
    public int komoTam = 0;

    private int lumbungPadi = 1000;
    private int lumbungJagung = 1250;
    private int lumbungKacang = 1500;
    private int lumbungKapas =2000;
    private int quality = 15000;
    private int komo = 30000;

    public Upgrade() {
    }

    public void UpgradeMain() {
        System.out.println("Upgrade manakah yang Anda inginkan?");
        System.out.println("""
                1. Tambah Kapasitas Lumbung
                2. Tambah Kualitas Komoditi
                3. Tambah Komoditi Baru
                """);

        System.out.print("Masukkan pilihan Anda = ");
        int pilUp = scan.nextInt();
        scan.nextLine();

        switch (pilUp) {
            case 1 -> {
                System.out.println("Bisnis yang sudah sangat berkembang membuat Anda harus menambah kapasitas di Lumbung Anda");
                System.out.print("Lumbung Manakah yang mau Anda Upgrade? ");
                String in = scan.nextLine();

                if (in.equalsIgnoreCase("padi")) {
                    UpLumbungPadi();
                } else if (in.equalsIgnoreCase("jagung")) {
                    UpLumbungJagung();
                } else if (in.equalsIgnoreCase("kacang")) {
                    if(komoTam<1) {
                        System.out.println("Anda belum membuka komoditi ini, buka terlebih dahulu!");
                    }
                    else {
                        UpLumbungKacang();
                    }
                } else if (in.equalsIgnoreCase("kapas")) {
                    if(komoTam<2) {
                        System.out.println("Anda belum membuka komoditi ini, buka terlebih dahulu!");
                    }
                    else {
                        UpLumbungKapas();
                    }
                }
            }

            case 2 -> {
                System.out.println("Sama dengan kehidupan, jualan hasil pertanian juga perlu upgrade kualitas, Upgrade kualitas komoditimu sehingga harga jual juga semakin tinggi");
                UpKualitas();
            }

            case 3 -> {
                System.out.println("Dalam hidup, terkadang diperlukan penambahan aspek-aspek yang dapat menambah warna kehidupan. Sama seperti itu, tambahkan komoditi baru sehingga variasi hasil komoditi Anda lebih banyak");
                UpKomo();
            }
        }
    }

    private void UpLumbungPadi() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", lumbungPadi);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < lumbungPadi) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                Main.uang -= lumbungPadi;
                Komoditi.lumbungPadi += 1000;
                lumbungPadi += (lumbungPadi * 0.45);
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("Kapasitas lumbung Padi Anda sekarang adalah " + Komoditi.lumbungPadi);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
    }

    private void UpLumbungJagung() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", lumbungJagung);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < lumbungJagung) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                Main.uang -= lumbungJagung;
                Komoditi.lumbungJagung += 1000;
                lumbungJagung += (lumbungJagung * 0.45);
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("Kapasitas lumbung Jagung Anda sekarang adalah " + Komoditi.lumbungJagung);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
    }

    private void UpLumbungKacang() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", lumbungKacang);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < lumbungKacang) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                Main.uang -= lumbungKacang;
                Komoditi.lumbungKacang += 1000;
                lumbungKacang += (lumbungKacang * 0.45);
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("Kapasitas lumbung Kacang Anda sekarang adalah " + Komoditi.lumbungKacang);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
    }

    private void UpLumbungKapas() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", lumbungKapas);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < lumbungKapas) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                Main.uang -= lumbungKapas;
                Komoditi.lumbungKapas += 1000;
                lumbungKapas += (lumbungKapas * 0.45);
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("Kapasitas lumbung Kapas Anda sekarang adalah " + Komoditi.lumbungKapas);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
    }

    private void UpKualitas() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", quality);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < quality) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                Main.uang -= quality;
                quality += (quality * 0.5);
                System.out.println("Uang Anda sekarang " + Main.uang);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
    }

    private void UpKomo() {
        System.out.printf("Harga untuk upgrade adalah %d dollar\n", komo);
        System.out.print("Apakah Anda yakin?(Y/N): ");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < komo) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                komoTam++;
                if (komoTam == 1) {
                    System.out.println("Komoditas Selanjutnya Anda adalah Kacang");
                    System.out.println("Selamat, Anda sudah membuka Kacang");
                    Main.uang -= komo;
                    komo += 70000;
                    System.out.println("Sisa uang Anda: " + Main.uang);
                } else if (komoTam == 2) {
                    System.out.println("Komoditas Selanjutnya Anda adalah Kapas");
                    System.out.println("Selamat, Anda sudah membuka Kapas");
                    Main.uang -= komo;
                    System.out.println("Sisa uang Anda: " + Main.uang);
                } else {
                    System.out.println("Komoditas Anda sudah maksimal");
                }
            }
        }
    }

    public int getKomoTam() {
        return komoTam;
    }
    public int getLumbungPadi(){
        return lumbungPadi;
    }

    public int getLumbungJagung() {
        return lumbungJagung;
    }

    public int getLumbungKacang() {
        return lumbungKacang;
    }

    public int getLumbungKapas() {
        return lumbungKapas;
    }
}
