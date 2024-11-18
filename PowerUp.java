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
        System.out.println("Anda memiliki diskon resuply sebanyak : " + powerUpQuantity[0] );
        System.out.println("Anda memiliki penambah harga jual sebanyak : " + powerUpQuantity[1]);
        System.out.println("Anda memiliki perlindungan badai sebanyak : " + powerUpQuantity[2]);
    }
    public static void perlindunganBadai (int x){
        if (powerUpQuantity[2] > 0){
            powerUpQuantity[2] -= 1;
        }
        else {
            Badai badai = new Badai();
            Badai.randomBadai(x);
        }
    }
    public static long beliPowerUp(long x){
        int pilih =0;
        System.out.print("1. Beli powerup diskon resuply ($1000)" +
                            "2. Beli powerup penambah harga jual ($1000)" +
                            "3. Beli powerup perlindungan badai ($1000)" +
                            "Pilihan anda : " );
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
}
