import java.util.Scanner;

public class Gacha {

    public static Scanner scan = new Scanner(System.in);

    public void Taruhan() {
        System.out.println("""
                Selamat datang, disini Anda akan mempertaruhkan uang Anda!
                Baik kalah maupun menang, silahkan tanggung resikonya!
                """);

        System.out.print("Yakin Anda ingin mempertaruhkan uang Anda? (Y/N) = ");
        String pilihan = scan.next();

        if(pilihan.equalsIgnoreCase("y")) {
            int randomizer = (int) (Math.random() * 8);

            System.out.println(randomizer);

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
                    System.out.println("Yah, kamu ga dapet apa-apa");
                }
                case 4 -> {
                    System.out.println("Kamu diwajibkan bayar pajak sebanyak $1,000");
                    Main.uang -= 1000;
                }
                case 5 -> {
                    System.out.println("Zonk, kamu ga dapet apa-apa");
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
                    System.out.println("Pertanian kamu disantet! Ilmu gelap menghantui pertanian kamu!!");
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
                            System.out.println("Dukunnya gadungan! Lumbungmu dihabiskan oleh mba kunti");
                        }
                        case 2 -> {
                            System.out.println("Lah kok malah dibiarin. Seluruh uangmu jadi hilang dong!");
                            Main.uang = 0;
                        }
                        case 3 -> {
                            System.out.println("Dewa Langit membantumu dan lumbungmu selamat! Bahkan uangmu ditambah $2,000");
                            Main.uang += 2000;
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
