public class Badai {
   private static int rows = 10;
   private static int repetitions = 5;

   public static void tampilBadai (){

       for (int rep = 0; rep < repetitions; rep++) {
           for (int i = 0; i < rows; i++) {

               for (int j = 0; j < i; j++) {
                   System.out.print(" ");
               }
               if (i % 2 == 0) {
                   System.out.println("\u001B[31m"+"BADAI");
               }
               else {
                   System.out.println("\u001B[34m"+"BADAI");
               }
           }
           for (int i = rows - 2; i >= 0; i--) {

               for (int j = 0; j < i; j++) {
                   System.out.print(" ");
               }
               if (i % 2 == 0) {
                   System.out.println("\u001B[31m"+"BADAI");
               }
               else{
                   System.out.println("\u001B[34m"+"BADAI");
               }
           }
       }
   }
   public static void randomBadai(int x){
       int mulaiBadai = (int) Math.random()*100;
       if (mulaiBadai == 1 || mulaiBadai == 2 || mulaiBadai == 3){
           tampilBadai();
           Komoditi komoditi = new Komoditi();
           Komoditi.reduceKomoditi();
       }
   }

}
