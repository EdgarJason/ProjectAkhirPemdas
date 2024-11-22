import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerUp {
    public static int powerUpQuantity[] = new int[3];
    public static void setPowerUp (int x, int y, int z ){
        powerUpQuantity[0] = x;
        powerUpQuantity[1] = y;
        powerUpQuantity[2] = z;
    }

    public static void tampilPowerUp (){
        System.out.println("Anda memiliki diskon resupply sebanyak : " + powerUpQuantity[0] );
        System.out.println("Anda memiliki penambah harga jual sebanyak : " + powerUpQuantity[1]);
        System.out.println("Anda memiliki perlindungan badai sebanyak : " + powerUpQuantity[2]);
    }
    public static void perlindunganBadai (){

            Badai badai = new Badai();
            int cek = Badai.randomBadai(powerUpQuantity[2]);
            if (cek == 2 && powerUpQuantity[2] > 0){
                powerUpQuantity[2] -= 1;
            }
    }
    public static long beliPowerUp(long x){
        int pilih =0;
        System.out.println("""
                1. Beli PowerUp diskon resupply ($1000)
                2. Beli PowerUp penambah harga jual ($1000)
                3. Beli PowerUp perlindungan badai ($1000)
                """);

        System.out.print("Pilihan Anda = ");
        Scanner input = new Scanner(System.in);
        pilih = input.nextInt();
        switch ( pilih ){
            case 1:
                if (x < 1000){
                    System.out.println("Uang tidak cukup");
                    break;
                }
                else {
                    powerUpQuantity[0] += 1;
                    x -= 1000;
                    break;
                }
            case 2:
                if (x < 1000){
                    System.out.println("Uang tidak cukup");
                    break;
                }
                else {
                    powerUpQuantity[1] += 1;
                    x -= 1000;
                    break;
                }
            case 3:
                if (x < 1000){
                    System.out.println("Uang tidak cukup");
                    break;
                }
                else {
                    powerUpQuantity[2] += 1;
                    x -= 1000;
                    break;
                }

        }
        return x;
    }
    public long penambahUang (long uang) {
        long tambahUang;
        tambahUang = (long) (uang * 0.5);

        uang += tambahUang;
        System.out.printf("Anda menggunakan Power Up dan mendapatkan penambahan uang sebesar %d sehingga uang anda menjadi %d\n", tambahUang, uang);
        return uang;
    }
    public int getPowerUp1(){
       return powerUpQuantity[1];
    }
    public void setPowerUpQuantity1(int x){
        powerUpQuantity[1] = x;
    }
    public long diskonRE (long uang) {
        if (powerUpQuantity[0] > 0){
            powerUpQuantity[0] -= 1;
            long diskon=200;
            uang += diskon;
            System.out.println("Anda berhasil menghemat "+diskon+" untuk resuply");
        }
        return uang;
    }
}
