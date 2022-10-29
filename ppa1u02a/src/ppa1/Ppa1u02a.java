package ppa1;
import java.util.Scanner;
import java.util.Locale;
/**
 * @author Daniel Vazač
 * @version 1
 */
public class Ppa1u02a {
    /**
     * Vstupní třída s výpočty a výpisem.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cenu vstupenky [Kc]: ");
        double cenaVstupenky = sc.nextInt();
        System.out.print("Zadej cenu klubove karty [Kc]: ");
        double cenaKluboveKarty = sc.nextInt();
        System.out.print("Zadej slevu [%]: ");
        double sleva = sc.nextInt();
 
        System.out.format(Locale.US, "cena vstupenky: %.1f%n", cenaVstupenky);
        System.out.format(Locale.US, "klubova cena: %.1f%n", cenaVstupenky*(1-(sleva/100)));
        System.out.format(Locale.US, "1 akce: %.1f%n", (cenaVstupenky*(1-(sleva/100))) + cenaKluboveKarty);
        System.out.format(Locale.US, "2 akce: %.1f%n", ((cenaVstupenky*(1-(sleva/100)))*2 + cenaKluboveKarty)/2);
        System.out.format(Locale.US, "3 akce: %.1f%n", ((cenaVstupenky*(1-(sleva/100)))*3 + cenaKluboveKarty)/3);

        sc.close();
    }
}