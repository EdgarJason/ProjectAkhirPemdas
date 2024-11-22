import java.util.Scanner;

public class Gacha {

    public static Scanner scan = new Scanner(System.in);

    public void Taruhan() {
        System.out.println("""
                Selamat datang di Gacha, disini Anda akan mempertaruhkan seluruh uang Anda!
                Apapun hasilnya, silahkan tanggung resikonya!
                Anda bisa mendapatkan hadiah yang sangat banyak, tetapi juga hukuman yang sangat berat!
                """);

        System.out.print("Yakin Anda ingin mempertaruhkan uang Anda? (Y/N) = ");
        String pilihan = scan.next();

        if(pilihan.equalsIgnoreCase("y")) {
            int randomizer = (int) (Math.random() * 8);

            switch (randomizer) {
                case 0 -> {
                    long uangKaget = (long) (Math.random() * 100000000);
                    System.out.printf("Wah, kamu mendapat uang kaget sebanyak %d", uangKaget);
                    Main.uang = uangKaget;
                }
                case 1 -> {
                    System.out.println("Ups, kamu terkena denda $500");
                    Main.uang -= 500;
                }
                case 2 -> {
                    System.out.println("Selamat, kamu mendapat hadiah $100,000");
                    Main.uang += 100000;
                }
                case 3 -> {
                    System.out.println("Yah, kamu ga dapet apa-apa, Anda kurang beruntung!");
                }
                case 4 -> {
                    System.out.println("Kamu diwajibkan bayar pajak sebanyak $1,000");
                    System.out.println("""
                            Waduh, coba kasi tau kamu mau gimana....
                            1. Tidak bayar pajak
                            2. Membayar pajak layaknya warga teladan
                            """);

                    System.out.print("Pilihan kamu = ");
                    int pilihan4 = scan.nextInt();

                    switch (pilihan4) {
                        case 1 -> {
                            System.out.println("""
                                    Wah kamu menghindari pajak dan akhirnya ketahuan pemerintah
                                    Hartamu disita semua karena kamu melanggar aturan
                                    """);
                            Main.uang = 0;
                        }
                        case 2 -> {
                            System.out.println("""
                                    Wah pemerintah terkesan dengan warga teladan sepertimu
                                    Kamu mendapat hadiah sebanyak $2,000
                                    """);
                            Main.uang += 2000;
                        }
                        default -> {
                            System.out.println("Pilihanmu salah, tetap bayar pajak ya!");
                            Main.uang -= 1000;
                        }
                    }
                }
                case 5 -> {
                    System.out.println("""
                            Waduh, kamu dipenjara karena dijebak ladang sebelah, bagaimana ini...
                            1. Bayar uang jaminan $3,000
                            2. Tidak bisa bayar uang jaminan, terpaksa masuk penjara
                            3. Telpon kenalan polisi kamu
                            """);

                    System.out.print("Pilihan kamu = ");
                    int pilihan5 = scan.nextInt();

                    switch (pilihan5) {
                        case 1 -> {}
                        case 2 -> {
                            System.out.println("""
                                    Wah, akhirnya kamu masuk penjara, apa yang harus kamu lakukan
                                    1. Menunggu hingga masa penjara selesai
                                    2. Mencoba kabur
                                    3. Menyogok sipir penjara untuk keluar
                                    """);

                            System.out.print("Pilihan kamu = ");
                            int pilihan2 = scan.nextInt();

                            switch (pilihan2){
                                case 1 -> {
                                    System.out.println("""
                                            Waduh, selama kamu dipenjara, pertanianmu tidak terurus dan akhirnya kamu
                                            mengalami kerugian sebanyak $12,000
                                            """);
                                    Main.uang -= 12000;
                                }
                                case 2 -> {
                                    System.out.println("""
                                            Wah, kamu berhasil kabur dengan menggali lubang di tembok
                                            Namun kamu tidak bisa menjalankan pertanian dengan status buronan
                                            Kamu akhirnya perlu mengeluarkan $2,000 sebagai modal awal pertanian.
                                            """);

                                    Main.uang -= 2000;
                                }
                                case 3 -> {
                                    System.out.println("""
                                            Wah, sogok-menyogok... kamu adalah orang Indonesia sejati!
                                            Kamu dibebaskan dan rivalmu dipenjara seumur hidup
                                            Kamu pun diberi ganti rugi sebanyak $100,000
                                            """);

                                    Main.uang += 100000;
                                }
                                default -> {}
                            }
                        }
                        case 3 -> {
                            System.out.println("""
                                    Kamu menelpon kenalan polisimu
                                    Kamu akhirnya dibebaskan, pemilik ladang sebelahmu dipenjara dan akhirnya
                                    kamu mendapatkan uang ganti rugi sebanyak $10,000
                                    """);
                            Main.uang += 10000;
                        }
                        default -> {
                            System.out.println("Pilihanmu salah");
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Asik, uangmu dikali 2");
                    Main.uang *= 2;
                }
                case 7 -> {
                    System.out.println("Lisensi penjualanmu dibekukan, bayar denda $20,000");
                    Main.uang -= 20000;
                }
                case 8 -> {
                    System.out.println("Pertanian kamu disantet kebun sebelah! Ilmu gelap menghantui pertanian kamu!!");
                    System.out.println("""
                            Bagaimana solusinya?
                            1. Minta bantuan dukun dan lakukan ritual
                            2. Biarkan saja
                            3. Minta bantuan Dewa Langit
                            """);

                    System.out.print("Tentukan pilihanmu = ");
                    int pilihanSantet = scan.nextInt();

                    switch (pilihanSantet) {
                        case 1 -> {
                            System.out.println("Dukunnya gadungan! Uangmu habis buat bayar dukun itu!");
                            Main.uang = 0;
                        }
                        case 2 -> {
                            System.out.println("Lah kok malah dibiarin. Seluruh uangmu jadi hilang dong!");
                            Main.uang = 0;
                        }
                        case 3 -> {
                            System.out.println("Dewa Langit membantumu dan lumbungmu selamat! Bahkan uangmu ditambah $20,000");
                            Main.uang += 20000;
                        }
                        default -> {
                            System.out.println("Pilihanmu salah, Tuyul pun menghabiskan semua uangmu");
                            Main.uang *= 0;
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Silahkan coba jika kamu sudah siap!");
        }
    }
}
