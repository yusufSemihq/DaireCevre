import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int r;
        double pi =3.14;


        Scanner sc = new Scanner(System.in);
        System.out.println("Darienin Yarı Çapını Giriniz :");

        r = sc.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Ceversi :" + cevre);


    }
}