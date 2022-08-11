import java.util.InputMismatchException;
import java.util.Scanner;

public class Dongu_kombinasyon {
    public static void main(String[] args){

        try {
            int a, b, aFactorial = 1, bFactorial = 1, abFactorial = 1;
            Scanner scan = new Scanner(System.in);
            System.out.print("C(a,b) formatında a degeri icin giris yapiniz :");
            a = scan.nextInt();
            System.out.print("C(a,b) formatında b degeri icin giris yapiniz :");
            b = scan.nextInt();

            for (int i = 1; i <= a; i++) {

                aFactorial = aFactorial * i;

            }
            for (int x = 1; x <= b; x++) {
                bFactorial = bFactorial * x;
            }
            for (int k = 1; k <= (a - b); k++) {
                abFactorial = abFactorial*k;
            }
            System.out.println("Sonuc : "+(aFactorial/(bFactorial*abFactorial)));
        }


        catch(InputMismatchException e){
            System.out.println("Hatalı bir giris yaptiniz lutfen kontrol ediniz.");
        }
        finally{
            System.out.println("Islem hatasız tamamlandi. ");
        }
    }
}
