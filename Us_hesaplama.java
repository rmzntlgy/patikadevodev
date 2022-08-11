import java.util.Scanner;

public class Us_hesaplama {

    public static void main(String[] args){

        int kuvvet, sayi, sonuc=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi = scan.nextInt();
        System.out.print("Kuvvetini giriniz : ");
        kuvvet = scan.nextInt();
        for(int i =1;i<=kuvvet;i++) {
            sonuc*=sayi;

        }
        System.out.print("Sonuc: " + sonuc);
        }

    }

