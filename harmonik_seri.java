import java.util.Scanner;

public class harmonik_seri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        double result=0.0;
        System.out.print("N Sayisini giriniz : ");
        n = inp.nextInt();

        for(double i=1;i<=n;i++)
        {
            result+=(1/i);
        }
        System.out.print(result);
    }
}
