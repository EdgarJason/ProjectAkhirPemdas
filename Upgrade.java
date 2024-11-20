import java.util.Scanner;

public class Upgrade {
    public static Scanner scan = new Scanner(System.in);
    public int komoTam = 0;
    public void UpgradeMain() {
        int lumbung = 1000;
        int quality = 15000;
        int newKomo = 10000;

        System.out.println("Upgrade manakah yang Anda inginkan?");
        System.out.println("""
                1. Tambah Kapasitas Lumbung
                2. Tambah Kualitas Komoditi
                3. Tambah Komoditi Baru
                """);

        int pilUp = scan.nextInt();
        scan.nextLine();

        switch (pilUp) {
            case 1 -> {
                System.out.println("Bisnis yang sudah sangat berkembang membuat Anda harus menambah kapasitas di Lumbung Anda");
                System.out.println("Lumbung Manakah yang mau Anda Upgrade?");
                String in = scan.next();

                if (in.equalsIgnoreCase("padi")) {
                    int x = UpLumbungPadi(lumbung);
                } else if (in.equalsIgnoreCase("jagung")) {
                    int x = UpLumbungJagung(lumbung);
                } else if (in.equalsIgnoreCase("kacang")) {
                    int x = UpLumbungKacang(lumbung);
                } else if (in.equalsIgnoreCase("Kapas")) {
                    int x = UpLumbungKapas(lumbung);
                }
            }

            case 2 -> {
                System.out.println("Sama dengan kehidupan, jualan hasil pertanian juga perlu upgrade kualitas, Upgrade kualitas komoditimu sehingga harga jual juga semakin tinggi");
                int b = UpKualitas(quality);
            }

            case 3 -> {
                System.out.println("Dalam hidup, terkadang diperlukan penambahan aspek aspek yang dapat menambah warna kehidupan. Sama seperti iyu, tambahkan komoditi baru sehingg variasi hasil komoditi Anda lebih banyak");
                UpKomo(newKomo);
            }
        }
    }

    private int UpLumbungPadi(int harga) {

        int hargabaru = 1000;
        int kapasitasLumbungPadi = Komoditi.lumbungPadi;
        System.out.printf("harga untuk upgrade adalah %d dollar\n", harga);
        System.out.println("Apakah Anda yakin?(Y/N)");
        scan.nextLine();
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < harga) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                hargabaru += (harga * 0.45);
                Main.uang -= hargabaru;
                kapasitasLumbungPadi+=1000;
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("kapasitas lumbung Anda sekarang adalah "+kapasitasLumbungPadi);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
        return hargabaru;
    }
    private int UpLumbungJagung(int harga) {

        int hargabaru = 1000;
        int kapasitasLumbungPadi = Komoditi.lumbungPadi;
        System.out.printf("harga untuk upgrade adalah %d dollar\n", harga);
        System.out.println("Apakah Anda yakin?(Y/N)");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < harga) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                hargabaru += (harga * 0.45);
                Main.uang -= hargabaru;
                kapasitasLumbungPadi+=1000;
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("kapasitas lumbung Anda sekarang adalah "+kapasitasLumbungPadi);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
        return hargabaru;
    }
    private int UpLumbungKacang(int harga) {

        int hargabaru = 1000;
        int kapasitasLumbungPadi = Komoditi.lumbungPadi;
        System.out.printf("harga untuk upgrade adalah %d dollar\n", harga);
        System.out.println("Apakah Anda yakin?(Y/N)");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < harga) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                hargabaru += (harga * 0.45);
                Main.uang -= hargabaru;
                kapasitasLumbungPadi+=1000;
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("kapasitas lumbung Anda sekarang adalah "+kapasitasLumbungPadi);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
        return hargabaru;
    }
    private int UpLumbungKapas(int harga) {

        int hargabaru = 1000;
        int kapasitasLumbungPadi = Komoditi.lumbungPadi;
        System.out.printf("harga untuk upgrade adalah %d dollar\n", harga);
        System.out.println("Apakah Anda yakin?(Y/N)");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < harga) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                hargabaru += (harga * 0.45);
                Main.uang -= hargabaru;
                kapasitasLumbungPadi+=1000;
                System.out.println("Uang Anda sekarang " + Main.uang);
                System.out.println("kapasitas lumbung Anda sekarang adalah "+kapasitasLumbungPadi);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
        return hargabaru;
    }

    private int UpKualitas(int quality) {

        int hargaKuan = 15000;

        System.out.printf("harga untuk upgrade adalah %d dollar\n", quality);
        System.out.println("Apakah Anda yakin?(Y/N)");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < quality) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                hargaKuan += (quality * 0.5);
                Main.uang -= hargaKuan;
                System.out.println("Uang Anda sekarang " + Main.uang);
            }
        } else {
            System.out.println("Anda akan kembali");
        }
        return hargaKuan;
    }

    private int UpKomo(int komo) {

        int hargaKomo = 10000;


        System.out.printf("Harga untuk upgrade adalah %d dollar", hargaKomo);
        System.out.println("Apakah Anda yakin?(Y/N)");
        String t = scan.nextLine();

        if (t.equalsIgnoreCase("y")) {
            if (Main.uang < hargaKomo) {
                System.out.println("Tidak dapat melakukan penambahan karena uang tidak cukup");
            } else {
                komoTam++;
                if (komoTam == 1) {
                    System.out.println("Komoditas Selanjutnya Anda adalah Kacang");
                    hargaKomo += (komo + 20000);
                    Main.uang -= hargaKomo;
                    System.out.println("Sisa uang Anda+ " + Main.uang);
                } else if (komoTam == 2) {
                    System.out.println("Komoditas Selanjutnya Anda adalah Kapas");
                    hargaKomo += (komo + 70000);
                    Main.uang -= hargaKomo;
                    System.out.println("Sisa uang Anda+ " + Main.uang);
                } else {
                    System.out.println("Komoditas Anda sudah maksimal");
                }
            }

        }
        return hargaKomo;
    }
    public int getKomoTam(){
        return komoTam;
    }
}
