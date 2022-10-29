package ppa1;

import java.util.Scanner;

public class Ppa1u03a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej koeficient a: ");
        double a = sc.nextDouble();
        System.out.print("Zadej koeficient b: ");
        double b = sc.nextDouble();
        System.out.print("Zadej koeficient c: ");
        double c = sc.nextDouble();

        System.out.print("Zadej pocatek intervalu x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Zadej konec intervalu x2: ");
        double x2 = sc.nextDouble();

        sc.close();

        double e = 0.00001;

        /// ax2 + bx + c = 0
        // D = b2 − 4ac

        // x0 = -b/2a

        // x1 = ((-b) - ✓D)/ 2a

        // x2 = ((-b) + ✓D)/ 2a

        double D = (b * 2) - (4 * a * c);

        int reseni = 0;

        if (java.lang.Math.abs(D) <= 0 + e) {

            double y0 = (-1 * b) / (2 * a);

            if (y0 > x1 & y0 < x2) {
                reseni++;
            }

        } else if (java.lang.Math.abs(D) > 0 + e) {

            double y1 = ((-1 * b) - Math.sqrt(D)) / (2 * a);
            double y2 = ((-1 * b) + Math.sqrt(D)) / (2 * a);

            if (y1 > x1 & y1 < x2) {
                reseni++;
            }
            if (y2 > x1 & y2 < x2) {
                reseni++;
            }

        }

        switch (reseni) {
        case 0:
            System.out.print("reseni: neexistuje");
            break;
        case 1:
            System.out.print("reseni: existuje jedno");
            break;
        case 2:
            System.out.print("reseni: existuji dve");
            break;
        }
    }
}