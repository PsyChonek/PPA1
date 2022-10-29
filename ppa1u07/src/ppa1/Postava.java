package ppa1;

/**
 * @author Daniel Vazac
 * @version 211111
 */
public class Postava {
    private String jmeno;
    private int sila;
    private int hbitost;
    private int vitalita;
    private int zdravi;
    private Zbran levaRuka;
    private Zbran pravaRuka;

    /**
     * Konstruktor
     * 
     * @param jmeno    Jmeno postavy
     * @param sila     Síla postavy
     * @param hbitost  Hbitost postavy
     * @param vitalita Vitalita postavy
     */
    public Postava(String jmeno, int sila, int hbitost, int vitalita) {
        this.jmeno = jmeno;
        this.sila = sila;
        this.hbitost = hbitost;
        this.vitalita = vitalita;
        this.zdravi = vitalita;
    }

    /**
     * Vezme zbran
     * 
     * @param ruka  do jaké ruky
     * @param zbran jakou zbraň
     * @return
     */
    public boolean vezmiZbran(Ruka ruka, Zbran zbran) {
        if (ruka == Ruka.LEVA && levaRuka == null && zbran != null) {
            levaRuka = zbran;
            return true;
        } else if (ruka == Ruka.PRAVA && pravaRuka == null && zbran != null) {
            pravaRuka = zbran;
            return true;
        } else {
            return false;
        }
    }

    private int obrana() {
        int obrana = hbitost;
        if (levaRuka != null) {
            obrana += levaRuka.getObrana();
        }
        if (pravaRuka != null) {
            obrana += pravaRuka.getObrana();
        }
        return obrana;
    }

    /**
     * Metoda pro obranu
     * 
     * @param utok postava se brání
     * @return Kolik si ubrala
     */
    public int branSe(int utok) {
        int obrana = obrana();

        obrana = utok - obrana;
        if (obrana > 0) {
            zdravi -= obrana;
            System.out.println("Braní se: " + jmeno + " obrana: " + obrana() + " dostal: " + obrana);
            return obrana;
        } else {
            System.out.println("Braní se: " + jmeno + " obrana: " + obrana() + " dostal: " + 0);
            return 0;
        }
    }

    /**
     * Postava utočí
     * 
     * @return za kolik zautočí
     */
    public int zautoc() {
        int utok = sila;
        if (levaRuka != null) {
            utok += levaRuka.getUtok();
        }
        if (pravaRuka != null) {
            utok += pravaRuka.getUtok();
        }
        return utok;
    }

    /**
     * Je postava ještě na živu?
     * 
     * @return
     */
    public boolean jeZiva() {
        if (zdravi > 0) {
            System.out.println("Je živá?: " + jmeno + " stav: true protože zdraví: " + zdravi);
            return true;
        } else {
            System.out.println("Je živá?: " + jmeno + " stav: false protože zdraví: " + zdravi);
            return false;
        }
    }

    /**
     * Postava ve formátu textu
     */
    public String toString() {
        String postava = String.format("%s [%d/%d] (%d/%d) ", jmeno, zdravi, vitalita, zautoc(), obrana());
        System.out.println(postava);
        return postava;
    }
}
