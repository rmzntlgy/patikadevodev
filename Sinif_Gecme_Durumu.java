import java.util.Scanner;

public class Sinif_Gecme_Durumu {
    public static void main(String[] args) {
        int matNot, kimyaNot, fizikNot, bioNot, geoNot;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        matNot = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimyaNot = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizikNot = input.nextInt();

        System.out.println("Biyoloji Notunuzu Giriniz: ");
        bioNot = input.nextInt();

        System.out.println("Geometri Notunuzu Giriniz: ");
        geoNot = input.nextInt();

        if (matNot < 0 || matNot > 100) {
            matNot = 0;
        } else if ((fizikNot < 0 || fizikNot > 100)) {
            fizikNot = 0;
        } else if ((kimyaNot < 0 || kimyaNot > 100)) {
            kimyaNot = 0;
        } else if ((bioNot < 0 || bioNot > 100)) {
            bioNot = 0;
        } else if ((geoNot < 0 || geoNot > 100)) {
            geoNot = 0;
        }
        float ortalamaNot = ((matNot+fizikNot+kimyaNot+bioNot+geoNot)/5);

        System.out.println("Ortalamanız : " + ortalamaNot);

        if (ortalamaNot>=55){
            System.out.println("Tebrikler geçtiniz.");
        }else{
            System.out.println("Mevcut sınıfınıza devam etme hakkı kazandınız. :) ");

    }


    }
}
