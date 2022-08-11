import java.util.Scanner;

public class dongu_dort_ve_bes_kuvvetleri {

    public static void main(String[] args){

        int kuvvet, sayi, sonuc=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kacinci kuvvete kadar hesaplanacak: ");
        kuvvet = scan.nextInt();
        System.out.print("Us almak istediginiz sayiyi giriniz: ");
        sayi = scan.nextInt();
        while(kuvvet != 0){
            sonuc = sonuc*sayi;
            kuvvet--;
            System.out.println(sonuc);
        }

    }
}
