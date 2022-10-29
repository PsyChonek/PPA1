package ppa1;
/**
 * @author Daniel Vazac
 * @version 211111
 */
public class Zbran {
    private String nazev;
    private int utok = 0;
    private int obrana = 0;

    /**
     * Konstruktor pro vytvoření zbraně
     */
    public Zbran(String nazev, int utok, int obrana) {
        this.nazev = nazev;
        this.utok = utok;
        this.obrana = obrana;
    }
    /**
     * Vrátí utočnou sílu
     * @return
     */
    public int getUtok(){
        return utok;
    }
    /**
     * Vrátí obranou sílu
     * @return
     */
    public int getObrana(){
        return obrana;
    }
    /**
     * Zbran v textovém formátu.
     */
    public String toString(){
        return nazev + " ("+utok+"/"+obrana+")";
    }
}
