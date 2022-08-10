import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args){

        int yil;
        boolean artikYil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = sc.nextInt();
        if (yil % 4 == 0) {


            if (yil % 100 == 0) {


                artikYil = yil % 400 == 0;
            } else {
                artikYil = true;
            }
        }
        else{
                    artikYil = false;
                }
        if (artikYil){
            System.out.println(yil + " bir artik yildir.");}
        else{
            System.out.println(yil + " artik yil degildir.");}
    }
    }

