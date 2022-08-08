import java.util.InputMismatchException;
import java.util.Scanner;

public class havadurumu_etkinlik_oneri {


    public static void main(String[] args){

    try {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava sıcaklığı giriniz : ");
        int sicaklik;
        sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yaqpabilirsiniz.");
        } else if (sicaklik <= 25) {


            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (sicaklik >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            } else {
                System.out.println("Kayak yapmaya gidebilirsiniz.");
            }
        }
    }
        catch(InputMismatchException e){
            System.out.println("Lütfen girdiğiniz değeri kontrol ediniz. Sadece sayısal değer giriniz.");
        }
        finally{
            System.out.println("İşlem sonlandı.");
        }

    }
    }

