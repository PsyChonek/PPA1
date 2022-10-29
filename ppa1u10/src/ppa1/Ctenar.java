package ppa1;

import java.util.Scanner;
/**
 * @author Daniel Vazač
 * @version 211202
 * 
 * Načítač dat
 */
public class Ctenar {

    private Scanner _sc;

    private String _radka;

    /**
     * Konstruktor čtenáře
     * @param sc
     */
    public Ctenar(Scanner sc) {
        _sc = sc;
    }

    /**
     * Další řádek
     */
    public void nactiDalsiRadku() {
        _radka = _sc.nextLine();
    }

    /**
     * element ze řádku
     * @return
     */
    public String getElement() {
        String element = _radka.substring(_radka.indexOf("<")+1, _radka.indexOf(">"));       
        try{
            return element.substring(0, element.indexOf(" "));
        }
        catch (Exception e) 
        {
            return element;
        }
    }

    /**
     * hodnota ze řádku
     * @return
     */
    public String getHodnota() {
        String hodnota = _radka.substring(_radka.indexOf("<"), _radka.lastIndexOf("<")); 
        return hodnota.substring(hodnota.indexOf(">")+1, hodnota.length());
    }

    /**
     * hodnota atributu
     * @param nazev
     * @return
     */
    public String getAtribut(String nazev) {
        String atribut = _radka.substring(_radka.indexOf(nazev+"="));
        atribut = atribut.split("\"")[1];
        return atribut;
    }
}
