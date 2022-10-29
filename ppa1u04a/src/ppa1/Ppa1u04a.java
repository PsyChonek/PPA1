package ppa1;

import java.text.Format;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 1.0
 */
public class Ppa1u04a {
    /**
     * Vstupní metoda a celý úkol.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        double a = sc.nextDouble();
        System.out.print("b=");
        double b = sc.nextDouble();
        System.out.print("c=");
        double c = sc.nextDouble();
        System.out.print("x1=");
        double x1 = sc.nextDouble();
        System.out.print("x2=");
        double x2 = sc.nextDouble();
        sc.close();

        double delta = 1.0 / 1024;

        int max = 0;
        int min = 0;

        double hodnotaFunkce;

        // f(x) = cos(x) + a ∙ cos(b ∙ x + c)

        boolean isRasing = true;

        double predchoziKrok = Math.cos(x1-delta) + (a * Math.cos((b * x1-delta) + c));

        if (predchoziKrok > Math.cos(x1) + (a * Math.cos((b * x1) + c)))
        {
                isRasing = false;
        }

        for (double i = x1 + delta; i <= x2+ delta; i += delta) {
            hodnotaFunkce = Math.cos(i) + (a * Math.cos((b * i) + c));

                if (hodnotaFunkce < predchoziKrok && isRasing) {
                    max++;
                    isRasing = false;
                }
                if (!isRasing && hodnotaFunkce > predchoziKrok) {
                    min++;
                    isRasing = true;
                }

                predchoziKrok = hodnotaFunkce;
            

        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
