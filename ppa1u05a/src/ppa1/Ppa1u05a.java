package ppa1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 1
 */
public class Ppa1u05a {
    /**
     * Vstupní metoda
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Xs: ");
        double Xs = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Ys: ");
        double Ys = sc.nextDouble();
        System.out.print("Ts: ");
        double Ts = sc.nextDouble();

        // double x1 = -3.141592653589793;
        // double x2 = 3.141592653589793;
        // double Xs = 3;
        // double y1 = -3.141592653589793;
        // double y2 = 3.141592653589793;
        // double Ys = 3;
        // double Ts = 2;

        // double x1 = 0;
        // double x2 = 12.566371;
        // double Xs = 40;
        // double y1 = 0;
        // double y2 = 3.141593;
        // double Ys = 10;
        // double Ts = 4;

        double epsilon = 0.0001;

        sc.close();

        double xKrok = (x2 - x1) / (Xs - 1);
        double yKrok = (y2 - y1) / (Ys - 1);
        double tKrok = 1 / (Ts);

        System.out.println("x, y, z, t ");

        for (double t = 0; t < 1 + epsilon; t += tKrok) {
            for (double y = y1; y <= y2 + epsilon; y += yKrok) {               
                for (double x = x1; x <= x2 + epsilon; x += xKrok) {
                    System.out.format(Locale.US, "%.6f, ", x);
                    System.out.format(Locale.US, "%.6f, ", y);
                    double z = Math.sin(Math.sqrt((x*x)+(y*y)) - (2 * Math.PI * t)); 
                    System.out.format(Locale.US, "%.6f, ", z);
                    System.out.format(Locale.US, "%.6f%n", t);
                }
            }
        }
    }
}
