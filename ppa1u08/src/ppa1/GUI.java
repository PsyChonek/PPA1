package ppa1;

import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 211118
 */
public class GUI {
    /**
     * Pole char s GUI
     */
    char[][] _guiMapa;
    /**
     * Konzole
     */
    Scanner _sc;

    /**
     * Konstruktor gui
     * 
     * @param sirka velikost
     * @param vyska velikost
     * @param sc    konzole
     */
    public GUI(int sirka, int vyska, Scanner sc) {
        _guiMapa = new char[vyska][sirka];
        _sc = sc;
    }

    /**
     * Smaže GUI
     */
    public void smaz() {
        for (int ra = 0; ra < _guiMapa.length; ra++){
            for (int sl = 0; sl < _guiMapa[ra].length; sl++){
                _guiMapa[ra][sl] = ' ';
            }
        }
    }

    /**
     * Zapíše na GUI
     * 
     * @param x
     * @param y
     * @param znak
     */
    public void zapis(int x, int y, char znak) {
        _guiMapa[y][x] = znak;
    }

    /**
     * Vykreslí GUI
     */
    public void vykresli() {
        for (int ra = 0; ra < _guiMapa.length; ra++){
            for (int sl = 0; sl < _guiMapa[ra].length; sl++){
                System.out.print(_guiMapa[ra][sl]);
            }
            System.out.println();
        }
    }

    /**
     * Načte akci
     * 
     * @return
     */
    public Smer nactiAkci() {
        switch (_sc.nextLine()) {
        case "8":
            return Smer.SEVER;
        case "6":
            return Smer.VYCHOD;
        case "2":
            return Smer.JIH;
        case "4":
            return Smer.ZAPAD;
        default:
            return null;
        }
    }
}
