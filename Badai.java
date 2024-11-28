/*
KELOMPOK 11 :
- EDGAR JASON HUSIN / 245150201111047
- DAVE CARNEGIE ONGSAH / 245150200111070
- AL-KHWARIZMI WIDYA BAGASKARA / 245150200111068
 */

public class Badai {
   private static int rows = 5;
   private static int repetitions = 2;

   public static void tampilBadai (){

       for (int rep = 0; rep < repetitions; rep++) {
           for (int i = 0; i < rows; i++) {

               for (int j = 0; j < i; j++) {
                   System.out.print(" ");
               }
               if (i % 2 == 0) {
                   System.out.println("\u001B[31m"+"BADAI DATANG");
               }
               else {
                   System.out.println("\u001B[34m"+"BADAI DATANG");
               }
           }
           for (int i = rows - 2; i >= 0; i--) {

               for (int j = 0; j < i; j++) {
                   System.out.print(" ");
               }
               if (i % 2 == 0) {
                   System.out.println("\u001B[31m"+"BADAI DATANG");
               }
               else{
                   System.out.println("\u001B[34m"+"BADAI DATANG");
               }
           }

       }
       System.out.println("\u001B[0m");
   }

   public static int randomBadai(int x){

       int mulaiBadai = ((int) (Math.random()*99))+1;
       if (mulaiBadai == 1 || mulaiBadai == 2 || mulaiBadai == 3){
           if(x == 0) {
               tampilBadai();
               return 1;
           }
           else {
               return 2;
           }
       }
       else {
           return 0;
       }
   }

}
