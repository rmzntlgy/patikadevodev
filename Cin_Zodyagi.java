import java.util.Scanner;

public class Cin_Zodyagi {
    public static void main(String[] args){

        int dogumYili;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        dogumYili = sc.nextInt();

        if (dogumYili%12 == 0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (dogumYili%12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (dogumYili%12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Kopek");
        } else if (dogumYili%12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } else if (dogumYili%12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (dogumYili%12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Okuz");
        } else if (dogumYili%12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } else if (dogumYili%12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavsan");
        } else if (dogumYili%12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        } else if (dogumYili%12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yilan");
        } else if (dogumYili%12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        } else if (dogumYili%12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
