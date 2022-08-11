import java.util.InputMismatchException;
import java.util.Scanner;

public class basamaktoplama {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int a, b, c=0;
            System.out.print("Sayı Giriniz :");
            a = input.nextInt();

            while (a!=0) {


                b = a%10;
                a/=10;
                c+=b;

            }
            System.out.println("Sayı basamaklarının toplamı: " + c);
        }


        catch(InputMismatchException e){
            System.out.println("Hatalı bir giris yaptiniz lutfen kontrol ediniz.");
        }
        finally{
            System.out.println("Islem hatasız tamamlandi. ");
        }
    }
}
