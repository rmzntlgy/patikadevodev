import java.util.InputMismatchException;
import java.util.Scanner;

public class UCAK_BILETI_HESAPLAMA {

    public static void main(String[] args) {
        try {
            int yas, mesafe, secim;
            double tutar;
            Scanner tara = new Scanner(System.in);
            System.out.print("Yasiniz: ");
            yas = tara.nextInt();
            System.out.print("Mesafeyi KM cinsinden giriniz.");
            mesafe = tara.nextInt();
            System.out.print("Secim yapiniz:\n1 - Tek yonlu ucus\n 2 - Gidis donus");
            secim = tara.nextInt();
            if (secim == 1) {
                if (yas <= 12) {
                    tutar = mesafe * (0.10) * 0.50;
                    System.out.println("Toplam Tutar: " + tutar);
                } else if (yas > 12 && yas <= 24) {
                    tutar = mesafe * (0.10) * 0.90;
                    System.out.println("Toplam Tutar: " + tutar);
                } else if (yas >= 65) {
                    tutar = mesafe * (0.10) * 0.70;
                    System.out.println("Toplam Tutar: " + tutar);
                } else {
                    tutar = mesafe * (0.10);
                    System.out.println("Toplam Tutar: " + tutar);
                }
            } else if (secim == 2) {
                if (yas <= 12) {
                    tutar = 2*mesafe * (0.10) * 0.50;
                    System.out.println("Toplam Tutar: " + tutar);

                } else if (yas > 12 && yas <= 24) {
                    tutar = 2 * mesafe * (0.10) * 0.90;
                    System.out.println("Toplam Tutar: " + tutar);
                } else if (yas >= 65) {
                    tutar = 2 * mesafe * (0.10) * 0.70;
                    System.out.println("Toplam Tutar: " + tutar);
                } else {
                    tutar = 2 * mesafe * (0.10);
                    System.out.println("Toplam Tutar: " + tutar);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Lütfen girdiğiniz değeri kontrol ediniz. Sayısal değerler dışında bir değer girdiniz.");
        } finally {
            System.out.print("İslem tamamlandı.");
        }
    }
}


