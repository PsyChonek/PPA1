package ppa1;

/**
 * @author Daniel Vazač
 * @version 211125
 * Třída stopy
 */
public class Stopa {
    private String _nazev;
    private int _delka;
    private double _hodnoceni;

    /**
     * Konstruktor
     * @param nazev
     * @param delka
     * @param hodnoceni
     */
    public Stopa(String nazev, int delka, double hodnoceni) {
        _nazev = nazev;
        _delka = delka;
        _hodnoceni = hodnoceni;
    }

    /**
     * Getter pro delku stopy
     * @return
     */
    public int getDelka() {
        return _delka;
    }

    /***
     * Getter pro hodnocení
     * @return
     */
    public double getHodnoceni() {
        return _hodnoceni;
    }

    /**
     * Getter pro název
     * @return
     */
    public String getNazev() {
        return _nazev;
    }

    /**
     * Metoda pro vytvoření stringu s názvem hodnocením a délkou
     */
    public String toString() {
        int sec = _delka % 60;
        int min = _delka / 60;
        String cas = min+":";
 
        if (sec < 10){
            cas += "0"+sec;
        }
        else{
            cas += sec+"";
        }


        String hvezdy = "";
        for (int pocet = (int) _hodnoceni / 1; pocet > 0; pocet--) {
            hvezdy += "*";
        }

        if (_hodnoceni % 1 >= 0.75) {
            hvezdy += "*";
        }
        else if (_hodnoceni % 1 >= 0.25) {
            hvezdy += ".";
        }

        return String.format("%s [%s] (%s)", _nazev, cas, hvezdy);
    }

}
