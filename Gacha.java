import java.util.Scanner;

public class Gacha {

    public static Scanner scan = new Scanner(System.in);

    public void Taruhan() {
        System.out.println("""
                Selamat datang, disini Anda akan mempertaruhkan uang dan pertanian Anda!
                Baik kalah maupun menang, silahkan tanggung resikonya!
                """);

        System.out.print("Yakin Anda ingin mempertaruhkannya? (Y?N) = ");
        String pilihan = scan.next();

        if(pilihan.equalsIgnoreCase("y")) {
            int randomizer = (int) (Math.random() * 10);

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
                    System.out.println("Yah, lumbung kamu habis dimakan tikus!");

                }
                case 4 -> {
                    System.out.println("Selamat, ada hujan Padi sebanyak 100 kg");

                }
                case 5 -> {
                    System.out.println("Zonk, kamu ga dapet apa-apa");
                }
                case 8 -> {
                    System.out.println("Asik, uangmu dikali 2");
                    Main.uang *= 2;
                }
                case 9 -> {
                    System.out.println("Lisensi penjualanmu dibekukan, bayar denda $20,000");
                    Main.uang -= 20000;
                }
                case 10 -> {
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
                            System.out.println("Lah kok malah dibiarin. Seluruh uangmu jadi hilang!");
                            Main.uang = 0;
                        }
                        case 3 -> {
                            System.out.println("Dewa membantumu dan lumbungmu selamat! Bahkan uangmu bertambah $2,000");
                            Main.uang += 2000;
                        }
                        default -> {
                            System.out.println("Pilihanmu salah, Tuyul pun mencuri uangmu sebanyak $20,000");
                            Main.uang -= 1500;
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
