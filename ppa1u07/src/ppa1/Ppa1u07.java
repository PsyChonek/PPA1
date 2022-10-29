package ppa1;
import java.util.Scanner;

/**
 * @author Daniel Vazac
 * @version 211111
 */
public class Ppa1u07 {
    /**
     * Vstupní bod programu. Načte první postavu a zbraň pro levou a pravou ruku.
     * Načte druhou postavu a zbraň pro levou a pravou ruku. Obě postavy vyzbrojí a
     * spustí souboj, ve kterém začíná útočit první postava.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Postava postava1 = nactiPostavu(sc);
        Zbran leva = nactiZbran(sc);
        Zbran prava = nactiZbran(sc);
        vyzbrojPostavu(postava1, leva, prava);
        postava1.toString();
        Postava postava2 = nactiPostavu(sc);
        leva = nactiZbran(sc);
        prava = nactiZbran(sc);
        vyzbrojPostavu(postava2, leva, prava);
        postava2.toString();

        System.out.println("Vitez: " + souboj(postava1, postava2).toString());
    }

    /**
     * Načte postavu
     * 
     * @param sc
     * @return
     */
    public static Postava nactiPostavu(Scanner sc) {
        String nazev = sc.nextLine();
        int sila = Integer.valueOf(sc.nextLine());
        int hbitost = Integer.valueOf(sc.nextLine());
        int vitalita = Integer.valueOf(sc.nextLine());
        Postava postava = new Postava(nazev, sila, hbitost, vitalita);
        return postava;
    }

    /**
     * Načte zbraň
     * 
     * @param sc
     * @return
     */
    public static Zbran nactiZbran(Scanner sc) {
        String nazev = sc.nextLine();
        if (nazev.equals("")) {
            return null;
        }
        int utok = Integer.valueOf(sc.nextLine());
        int obrana = Integer.valueOf(sc.nextLine());
        return new Zbran(nazev, utok, obrana);
    }

    /**
     * Vyzbrojí postavu
     * 
     * @param postava postava
     * @param leva    zbran do leva
     * @param prava   zbran do prava
     */
    public static void vyzbrojPostavu(Postava postava, Zbran leva, Zbran prava) {
        postava.vezmiZbran(Ruka.LEVA, leva);
        postava.vezmiZbran(Ruka.PRAVA, prava);
    }

    /**
     * Ultimátní souboj postav
     * 
     * @param postava1 První
     * @param postava2 Druhá
     * @return
     */
    public static Postava souboj(Postava postava1, Postava postava2) {
        boolean isWinner = false;
        Postava winner = postava1;
        while (!isWinner) {
            postava2.branSe(postava1.zautoc());
            if (postava2.jeZiva()) {
                postava1.branSe(postava2.zautoc());
                if (!postava1.jeZiva()) {
                    isWinner = true;
                    winner = postava2;
                }
            } else {
                isWinner = true;
                winner = postava1;
            }
        }
        return winner;
    }
}