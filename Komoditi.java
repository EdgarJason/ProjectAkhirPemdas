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
            quan1[0] = 500;
            quan1[1] = lumbungPadi;
        }

      public static int[] quan2 = new int[2];
        {
            quan2[0] = 500;
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

    public int getLumbungPadi(){
        return this.lumbungPadi;
    }
    public int getLumbungJagung(){
        return this.lumbungJagung;
    }
    public int getLumbungKapas(){
        return this.lumbungKapas;
    }
    public int getLumbungKacang(){
        return this.lumbungKacang;
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

    public static void reduceKomoditi(){
        quan1 [0] = (int) quan1 [0] *(2/10);
        quan2 [0] = (int) quan2 [0] *(2/10);
    }

    public static void jualKomoditiPadi(){
        int terjual1;
        terjual1 =  (int) (quan1[0] * Math.random());
        if (quan1[0] == 0){
            System.out.println("Komoditi habis, segera resupply");
        }
        else if (terjual1 >= quan1[0]) {
            terjual1 = quan1[0];

            quan1[0] = quan1[0] - terjual1;
            System.out.printf("Anda berhasil menjual padi sebanyak %dKg\n", terjual1);
            Main.uang += terjual1 * 3;
        }
        else {
            quan1[0] = quan1[0] - terjual1;
            System.out.printf("Anda berhasil menjual padi sebanyak %dKg\n", terjual1);
            Main.uang += terjual1 * 3;
        }

    }
    public static void jualKomoditijagung(){
        int terjual2;

        terjual2 = (int) (quan2[0] * Math.random());
        if (quan2[0] == 0){
            System.out.println("Komoditi habis, segera resupply");
        }
        else if (terjual2 >= quan2[0]) {
            terjual2 = quan2[0];
            quan2[0] = quan2[0] - terjual2;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual2);
            Main.uang += terjual2 * 4;
        }
        else {
            quan2[0] = quan2[0] - terjual2;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual2);
            Main.uang += terjual2 * 4;
        }

    }
    public static void jualKomoditiKapas(){
        int terjual3;
        terjual3 = (int) (quan3[0] * Math.random());
        if(quan3[0] == 0){
            System.out.println("Komoditi habis, segera resupply");
        }
        else if (terjual3 >= quan3[0]) {
            terjual3 = quan3[0];
            quan3[0] = quan3[0] - terjual3;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual3);
            Main.uang += terjual3 * 5;
        }
        else {
            quan2[0] = quan2[0] - terjual3;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual3);
            Main.uang += terjual3 * 4;
        }
    }
    public static void jualKomoditiKacang(){
        int terjual4;
        terjual4 = (int) (quan4[0] * Math.random());
        if(quan4[0]==0){
            System.out.println("Komoditi habis, segera resupply");
        }
        else if (terjual4 >= quan4[0]) {
            terjual4 = quan4[0];
            quan4[0] = quan4[0] - terjual4;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual4);
            Main.uang += terjual4 * 4;
        }
        else {
            quan2[0] = quan2[0] - terjual4;
            System.out.printf("Anda berhasil menjual jagung sebanyak %d kg\n", terjual4);
            Main.uang += terjual4 * 4;
        }
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
