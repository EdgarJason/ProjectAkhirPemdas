/*
KELOMPOK 11 :
- EDGAR JASON HUSIN / 245150201111047
- DAVE CARNEGIE ONGSAH / 245150200111070
- AL-KHWARIZMI WIDYA BAGASKARA / 245150200111068
 */

import java.util.Scanner;

public class PowerUp {
    public static int powerUpQuantity[] = new int[3];
    public static void setPowerUp (int x, int y, int z ){
        powerUpQuantity[0] = x;
        powerUpQuantity[1] = y;
        powerUpQuantity[2] = z;
    }
    private long padiPU;
    private long jagungPU;
    private long kacangPU;
    private long kapasPU;
    public static void tampilPowerUp (){
        System.out.printf(" Diskon Resupply = %d | Penambah Harga Jual = %d | Perlindungan Badai = %d",powerUpQuantity[0],powerUpQuantity[1],powerUpQuantity[2]);
    }
    public int perlindunganBadai (long padi, long jagung, long kacang, long kapas){

            Badai badai = new Badai();
            int cek = Badai.randomBadai(powerUpQuantity[2]);
            if (cek == 2 && powerUpQuantity[2] > 0){
                powerUpQuantity[2] -= 1;
                System.out.println("Badai menerjang pertanian anda tapi untungnya anda punya perlindungan badai," + "\u001B[31m"+"perlindungan badai tersisa " +
                        powerUpQuantity[2]+"\u001B[0m");
                return 0;
            }
            if (cek == 1){
                this.padiPU = (long) (padi *2/10);
                if(padiPU > 0){
                    System.out.println("Badai merusak lumbung anda,\u001B[31m komoditi padi anda berkurang sebanyak "+ (padi-padiPU)+"\u001B[0m");
                }
                this.jagungPU = (long) (jagung *2/10);
                if(jagungPU > 0){
                    System.out.println("Badai merusak lumbung anda,\u001B[31m komoditi jagung anda berkurang sebanyak "+ (jagung-jagungPU)+"\u001B[0m");
                }
                this.kacangPU = (long) (kacang *2/10);
                if (kacangPU > 0){
                    System.out.println("Badai merusak lumbung anda,\u001B[31m komoditi kacang anda berkurang sebanyak "+ (kacang-kacangPU)+"\u001B[0m");
                }
                this.kapasPU = (long) (kapas *2/10);
                if (kapasPU > 0){
                    System.out.println("Badai merusak lumbung anda,\u001B[31m komoditi kapas anda berkurang sebanyak "+ (kapas-kapasPU)+"\u001B[0m");
                }
                return 1;
            }
            return 2;
    }
    public long getPadiPU(){
        return padiPU;
    }
    public long getJagungPU(){
        return jagungPU;
    }
    public long getKacangPU(){
        return kacangPU;
    }
    public long getKapasPU(){
        return kapasPU;
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
