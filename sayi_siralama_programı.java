import java.util.InputMismatchException;
import java.util.Scanner;

public class sayi_siralama_programı {
    public static void main(String[] args){

        try{
            Scanner scan = new Scanner(System.in);
            int gecici;
            int totalArr;
            int siralama;
            int [] dizi = new int[totalArr];
            System.out.println("Dizide kaç tane elaman, giriniz : ");
            totalArr = scan.nextInt();
            siralama = scan.nextInt();
            System.out.println("İşlem seçiniz:\n1 - Küçükten büyüğe sıralama.\n2 - Büyükten küçüğe sıralama.");

            if(siralama ==1 ) {
                for (int i = 0; i < totalArr; i++) {
                    System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
                    dizi[i] = scan.nextInt();
                }
                System.out.println("Küçükten büyüğe sıralama:\n");
                for (int i = 0; i < 9; i++) {
                    for (int j = i + 1; j < 10; j++) {
                        if (dizi[j] < dizi[i]) {
                            gecici = dizi[i];
                            dizi[i] = dizi[j];
                            dizi[j] = gecici;
                        }
                    }
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println("Dizinin " + (i + 1) + ". elemanını : " + dizi[i]);
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Lütfen girdiğiniz değeri kontrol ediniz. Sayısal değerler dışında bir değer girdiniz.");
        }
    }
}
