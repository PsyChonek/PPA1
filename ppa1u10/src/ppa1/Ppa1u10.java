package ppa1;

import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 211202
 * 
 * Vstupní třída
 */
public class Ppa1u10 {
    /**
     * Vstupní metoda programu.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ctenar ct = new Ctenar(sc);
        Album al = new Album(ct);
        al.toString();
    }
}
