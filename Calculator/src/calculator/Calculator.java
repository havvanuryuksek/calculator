package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        // TODO code application logic here
      Scanner okuyucu =  new Scanner (System.in);
        System.out.println("Hesap Makineme Hosgeldiniz: ");
        System.out.println("hesaplamak istediginiz 2 sayiyi giriniz:");
       int sayiBir = okuyucu.nextInt(); // bir sonraki sayıyı al
       int sayiİki = okuyucu.nextInt();
        System.out.println("hangi islemi yapmak istersiniz? (+,-,*,/)");
        char islem = okuyucu.next().charAt(0); // yani okuduğu ilk karakteri yaz bana
        int sonuc;
        switch(islem){
            
            case '+' :            sonuc = sayiBir + sayiİki;

         
               
            break;
            
            case '-':              sonuc = sayiBir - sayiİki;
  
                            break;

            case '*' :              sonuc = sayiBir * sayiİki;
                System.out.println("Buse asko sonucun geldi : "+sonuc);
 
            break;

            case '/':             sonuc = sayiBir / sayiİki;
; 
                          break;
    
            default : System.out.println("Çarpma, bölme, toplama veya çıkarma islemi seciniz. ");            

        }
          
    }
          
}
