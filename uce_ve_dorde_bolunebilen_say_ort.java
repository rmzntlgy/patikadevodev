import java.util.Scanner;

public class uce_ve_dorde_bolunebilen_say_ort {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0, islem = 0;

        System.out.print("Sayi giriniz : ");
        sayi = scanner.nextInt();

        double ortalama;

        for(int i =0; i<=sayi; i++){
            if(i % 3 == 0 && i % 4 == 0 && i>0){
                toplam = toplam + i;
                islem++;

            }
        }
        ortalama = toplam / islem;
        System.out.println("0 dan Girilen Sayıya kadar 3 ve 4 e bölünebilen sayıların ortalaması : " +ortalama);


    }
}
