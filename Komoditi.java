import java.util.Scanner;

public class Komoditi {

    public static Scanner scan = new Scanner(System.in);

       private static int lumbungPadi = 1500;
       private static int lumbungJagung = 1500;

        String komo1 = "Padi";
        String komo2 = "Jagung";

      private static int[] quan1 = new int [2];
    { quan1[0] = 500;
        quan1[1] = lumbungPadi;}

      private static int[] quan2 = new int[2];
    {quan2[0] = 500;
        quan2[1] = lumbungJagung;}

    public static void reduceKomoditi(){
        quan1 [0] = (int) quan1 [0] *(2/10);
        quan2 [0] = (int) quan2 [0] *(2/10);
    }

    public static void jualKomoditi(){
        int terjual1,terjual2,terjual3,terjual4;
        terjual1 =  (int) (quan1[0] * Math.random());
        terjual2 = (int) (quan2[0] * Math.random());
        quan1 [0] = quan1 [0]  - terjual1;
        quan2 [0] = quan2 [0]  - terjual2;

        System.out.printf("Anda berhasil menjual padi sebanyak %dKg\n", terjual1);
        System.out.printf("Anda berhasil menjual jagung sebanyak %dKg\n", terjual2);
    }
    public static int getJagung(){
        int jagung = quan1[0];
    return jagung;
    }
    public static int getPadi(){
       int padi = quan2[0];
       return padi;
    }
}
