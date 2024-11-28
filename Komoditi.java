/*
KELOMPOK 11 :
- EDGAR JASON HUSIN / 245150201111047
- DAVE CARNEGIE ONGSAH / 245150200111070
- AL-KHWARIZMI WIDYA BAGASKARA / 245150200111068
 */

import java.util.Scanner;

public class Komoditi {

    public static Scanner scan = new Scanner(System.in);
    public static Upgrade upgrade = new Upgrade();

       public static int lumbungPadi = 1500;
       public static int lumbungJagung = 1500;
       public static int lumbungKapas = 1500;
       public static int lumbungKacang = 1500;

      public static int[] quan1 = new int [2];
        {
            quan1[0] = 0;
            quan1[1] = lumbungPadi;
        }

      public static int[] quan2 = new int[2];
        {
            quan2[0] = 0;
            quan2[1] = lumbungJagung;
        }

    public static int[] quan3 = new int[2];
        {
            quan3[0] = 0;
            quan3[1] = lumbungKapas;
        }

    public static int[] quan4 = new int[2];
        {
            quan4[0] = 0;
            quan4[1] = lumbungKacang;
        }

    public static int getLumbungPadi(){
        return lumbungPadi;
    }
    public static int getLumbungJagung(){
        return lumbungJagung;
    }
    public static int getLumbungKapas(){
        return lumbungKapas;
    }
    public static int getLumbungKacang(){
        return lumbungKacang;
    }

    public void setLumbungPadi(int lumbungPadi){
        this.lumbungPadi = lumbungPadi;
    }

    public void setLumbungJagung(int lumbungJagung){
        this.lumbungPadi = lumbungJagung;
    }

    public void setLumbungKapas(int lumbungKapas){
        this.lumbungPadi = lumbungKapas;
    }

    public void setLumbungKacang(int lumbungKacang){
        this.lumbungPadi = lumbungKacang;
    }

    public static int getJagung(){
        int jagung = quan2[0];
    return jagung;
    }
    public static int getPadi(){
       int padi = quan1[0];
       return padi;
    }

    public static int kacang;
    public static int kapas;

    public static int getKapas(){
        if(upgrade.komoTam==1) {
            kapas = quan3[0];
        }

        return kapas;
    }
    public static int getKacang(){
        if(upgrade.komoTam==2) {
            kacang = quan4[0];
        }

        return kacang;
    }
    public static void setJumlahPadi(int jumlahPadi){
        quan1[0] = jumlahPadi;
    }
    public static void setJumlahJagung(int jumlahJagung){
        quan2[0] = jumlahJagung;
    }
    public static void setJumlahKapas(int jumlahKapas){
        quan3[0] = jumlahKapas;
    }
    public static void setJumlahKacang(int jumlahKacang){
        quan4[0] = jumlahKacang;
    }
}
