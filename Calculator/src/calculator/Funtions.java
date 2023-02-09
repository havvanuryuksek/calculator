package calculator;
public class Funtions {
    public static void main (String[]args){
        int top1= 7;
        int top2= 6;
       int donenCevap = toplama(top1, top2); // ya da direkt 3, 5 de alttakine atasın hani top1 2 ye gerek kalmadan
        System.out.println(donenCevap);
        System.out.println(merhaba(" Havva"));
        System.out.println(yilBul (23));
        bye ();
        bye ();
    } public static int toplama (int sayi1, int sayi2){
        int cevap;
        cevap = sayi1+ sayi2;
       return cevap; 
    }public static String merhaba(String ad){
        return "Merhaba" + ad;
    }public static String yilBul(int yas){
        int yil= 2021-yas;
        yil--; return yil + "Yilinda dogdunuz.";
    }public static void bye (){ // hiç argüman almama
        System.out.println("Gorusuruz");   
    }
}
