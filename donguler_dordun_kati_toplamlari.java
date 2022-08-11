import java.util.InputMismatchException;
import java.util.Scanner;

public class donguler_dordun_kati_toplamlari {

    public static void main(String[] args){

        try{
            int sayi;
            int toplam=0;
            Scanner inp=new Scanner(System.in);
            do {
                System.out.print("Sayi giriniz :");
                sayi= inp.nextInt();
                if (sayi%4==0){
                    toplam+=sayi;
                }
            }while (sayi%2==0);
            System.out.println("Verilen sayılardan 4'un katı olan sayıların toplamı: " +toplam);
        }
        catch(InputMismatchException e){
            System.out.println("Hatalı bir giris yaptiniz lutfen kontrol ediniz.");
        }
        finally{
            System.out.println("Islem hatasız tamamlandi. ");
        }
    }
}
