import java.util.InputMismatchException;
import java.util.Scanner;

public class sayi_siralama_programi {
    public static void main(String[] args){

        try{
            Scanner sc = new Scanner(System.in);
            int gecici;
            int totalArr;
            int islem;
            System.out.print("Dizide kaç tane elaman, giriniz : ");
            totalArr = sc.nextInt();
            int [] dizi = new int[totalArr];


                for (int i = 0; i < totalArr; i++) {
                    System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
                    dizi[i] = sc.nextInt();
                }
                System.out.print("Lütfen islem seciniz:\n1 - Kücükten büyüge siralama\n2 - Büyükten sıralama\nİslem:");
                islem = sc.nextInt();
                if (islem == 1) {

                    System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
                    for(int i = 0; i < (totalArr-1); i++)
                    {
                        for(int j = i+1; j < totalArr; j++)
                        {
                            if(dizi[j] < dizi[i]) {
                                gecici = dizi[i];
                                dizi[i] = dizi[j];
                                dizi[j] = gecici;
                            }
                        }
                    }
                    for(int i = 0; i < totalArr; i++)
                    {
                        System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
                    }
                }else if(islem == 2){

                    System.out.println("Dizinin buyukten kucuge dogru sıralanmıs hali:\n");
                    for(int i = 0; i < (totalArr-1); i++)
                    {
                        for(int j = i+1; j < totalArr; j++)
                        {
                            if(dizi[j] > dizi[i]) {
                                gecici = dizi[i];
                                dizi[i] = dizi[j];
                                dizi[j] = gecici;
                            }
                        }
                    }
                    for(int i = 0; i < totalArr; i++)
                    {
                        System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
                    }
                }

        }
        catch (InputMismatchException e){
            System.out.println("Lütfen girdiğiniz değeri kontrol ediniz. Sayısal değerler dışında bir değer girdiniz.");
        }finally {
            System.out.print("Islem tamamlandi. :)");
        }
    }
}
