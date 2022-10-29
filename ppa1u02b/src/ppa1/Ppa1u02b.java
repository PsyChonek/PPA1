package ppa1;
import java.util.Scanner;
import java.util.Locale;
/**
 * @author Daniel Vazač
 * @version 1
 */
public class Ppa1u02b {
    /**
     * Vstupní metoda programu.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zeptá se na pozice bodů A a D
        System.out.print("Zadej Ax: ");
        double Ax = sc.nextDouble();
        System.out.print("Zadej Ay: ");
        double Ay = sc.nextDouble();
        System.out.print("Zadej Dx: ");
        double Dx = sc.nextDouble();
        System.out.print("Zadej Dy: ");
        double Dy = sc.nextDouble();

        // Vektor DA v poměru vzdálenosti AD / AB = 1 / 2
        double DAx = (Dx-Ax)/2;
        double DAy = (Dy-Ay)/2;

        System.out.format(Locale.US, "DAx = %.3f%n", DAx);
        System.out.format(Locale.US, "DAy = %.3f%n", DAy);

        // Přičte se k bodům B a C vektor DA otočení v protisměru hodinových ručiček.
        double Bx = Ax-DAy;
        double By = Ay+DAx;
        double Cx = Dx-DAy;
        double Cy = Dy+DAx;

        System.out.format(Locale.US, "Bx = %.3f%n", Bx);
        System.out.format(Locale.US, "By = %.3f%n", By);
        System.out.format(Locale.US, "Cx = %.3f%n", Cx);
        System.out.format(Locale.US, "Cy = %.3f%n", Cy);

        sc.close();
    }
}
