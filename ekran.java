package paket;
import java.util.Scanner;
public class ekran {
    public void yaz() {
        VeritabaniBagla vt =new VeritabaniBagla();
        String kullaniciAdi;
        int sifre;
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz.");
        kullaniciAdi = scanner.next();
        System.out.println("Sifrenizi giriniz.");
        sifre = scanner.nextInt();

    }while(!(vt.kullaniciDogrula(kullaniciAdi,sifre)));


    }


}
