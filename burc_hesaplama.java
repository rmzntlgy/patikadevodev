import java.util.*;



public class burc_hesaplama {


    public static void main(String[] args) {
        Scanner tarihTarama = new Scanner(System.in);
        Calendar takvim = new GregorianCalendar();
        boolean isError = false;
        int gun = takvim.get(Calendar.DAY_OF_MONTH);
        int ay = takvim.get(Calendar.MONTH);
        int yil = takvim.get(Calendar.YEAR);
        String burc = "";
        System.out.print("Günü giriniz: ");
        gun = tarihTarama.nextInt();
        System.out.print("Ayi giriniz: ");
        ay = tarihTarama.nextInt();
        System.out.print("Yili giriniz: ");
        yil = tarihTarama.nextInt();


        if (ay == 1) {
            if (gun > 0 && gun <= 21) {
                burc = "Oglak";
            } else if (gun > 0 && gun <= 31) {
                burc = "Kova";
            } else
                isError = true;

        } else if (ay == 2) {
            if (gun > 0 && gun <= 19) {
                burc = "Kova";
            } else if (gun > 0 && gun <= 29) {
                burc = "Balik";
            } else
                isError = true;

        } else if (ay == 3) {
            if (gun > 0 && gun <= 20) {
                burc = "Balik";
            } else if (gun > 0 && gun <= 31) {
                burc = "Koc";
            } else
                isError = true;

        } else if (ay == 4) {
            if (gun > 0 && gun <= 20) {
                burc = "Koc";
            } else if (gun > 0 && gun <= 30) {
                burc = "Boga";
            } else
                isError = true;

        } else if (ay == 5) {
            if (gun > 0 && gun <= 21) {
                burc = "Boga";
            } else if (gun > 0 && gun <= 31) {
                burc = "İkizler";
            } else
                isError = true;

        } else if (ay == 6) {
            if (gun > 0 && gun <= 22) {
                burc = "İkizler";
            } else if (gun > 0 && gun <= 30) {
                burc = "Yengec";
            } else
                isError = true;

        } else if (ay == 7) {
            if (gun > 0 && gun <= 22) {
                burc = "Yengec";
            } else if (gun > 0 && gun <= 31) {
                burc = "Aslan";
            } else
                isError = true;

        } else if (ay == 8) {
            if (gun > 0 && gun <= 22) {
                burc = "Aslan";
            } else if (gun > 0 && gun <= 31) {
                burc = "Basak";
            } else
                isError = true;

        } else if (ay == 9) {
            if (gun > 0 && gun <= 22) {
                burc = "Basak";
            } else if (gun > 0 && gun <= 30) {
                burc = "Terazi";
            } else
                isError = true;

        } else if (ay == 10) {
            if (gun > 0 && gun <= 22) {
                burc = "Terazi";
            } else if (gun > 0 && gun <= 31) {
                burc = "Akrep";
            } else
                isError = true;

        } else if (ay == 11) {
            if (gun > 0 && gun <= 21) {
                burc = "Akrep";
            } else if (gun > 0 && gun <= 30) {
                burc = "Yay";
            } else
                isError = true;

        } else if (ay == 12) {
            if (gun > 0 && gun <= 21) {
                burc = "Yay";
            } else if (gun > 0 && gun <= 31) {
                burc = "Oglak";
            } else
                isError = true;
        }
        if ((ay > 12) || (ay < 1)) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else if (isError) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " + burc);

        }
    }
}
