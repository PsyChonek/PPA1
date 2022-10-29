package ppa1;

import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 1
 */
public class Ppa1u05b {
    /**
     * Vstupní metoda
     * 
     * @param args
     */
    public static void main(String[] args) {

        // a2 + b2= c2

        // a < b
        // nesoudělná

        Scanner sc = new Scanner(System.in);

        System.out.print("c: ");

        int c = sc.nextInt();
        int a = 0;
        int b = 1;

        boolean konec = false;

        /**
         * Brute force
         */
        while (!konec) {
            a++;
            b = a + 1;
            while ((b < c) || ((a * a) + (b * b) < (c * c))) {
                if ((a * a) + (b * b) == (c * c)) {
                    konec = true;

                    for (int i = 2; i <= c; i++) {
                        if(a%i == 0 && b%i == 0 && c%i ==0){
                            konec = false;
                        }
                    }

                    if (konec){
                        System.out.println(a + "^2" + " + " + b + "^2 = " + c + "^2");
                        break;
                    }
                }
                b++;
            }
            if (a > c) {
                konec = true;
                System.out.println("Reseni neexistuje.");
            }
        }

    }
}
