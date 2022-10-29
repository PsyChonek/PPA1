package ppa1;
import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 211125
 * 
 * Hlavní třída programu.
 */
public class Ppa1u09 {

    /**
     * Vstupní metoda pro inicializaci
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = vytvorPlaylist(sc);
        Playlist playlist2 = vyberStopy(Double.parseDouble(args[0]),Integer.parseInt(args[1]), playlist);
        if (playlist.getCelkovaDelka() == playlist2.getCelkovaDelka()){
            System.out.println("POZOR! Playlist je kratky");
        }
    }

    /**
     * Metoda pro vytvoření playlistu.
     * @param sc
     * @return
     */
    public static Playlist vytvorPlaylist(Scanner sc) {
        int pocet = Integer.parseInt(sc.nextLine());
        Stopa pole[] = new Stopa[pocet];
        for (int i = 0; i < pocet; i++) {
            String nazev = sc.nextLine();
            int delka = Integer.parseInt(sc.nextLine());
            double hodnoceni = Double.parseDouble(sc.nextLine());

            pole[i] = new Stopa(nazev, delka, hodnoceni);
        }
        return new Playlist(pole);
    }

    /**
     * Filtruje, míchá, vybírá
     * @param minHodnoceni
     * @param minDelka
     * @param playlist
     * @return
     */
    public static Playlist vyberStopy(double minHodnoceni, int minDelka, Playlist playlist) {
        return playlist.filtrujHodnoceni(minHodnoceni).zamichej().vyberCelkovouDelku(minDelka);
    }
}
