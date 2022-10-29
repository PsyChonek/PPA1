package ppa1;
// import java.util.Random;
import java.util.Scanner;


/**
 * @author Daniel Vazač
 * @version 211118
 */
public class Ppa1u08 {
    /**
     * Konzole
     */
    public static Scanner sc = new Scanner(System.in);
    /**
     * Vstupní spouštěcí mětoda
     * @param args
     */
    public static void main(String[] args) {
        
        Svet svet = new Svet(5, 4, new char[] {
            '#','#','#','#','#',
            '#',' ',' ',' ','#',
            '#',' ',' ',' ','#',
            '#','#','#','#','#',
        });
        GUI gui = new GUI(7, 5, sc);

        Postava postava = new Postava(svet, 3, 2, 1, 2);

        spust(gui, svet, postava);
    }

    /**
     * Metoda s nekonečnou smyčkou hry.
     * @param gui = Kde je domeček
     * @param svet = Jak vypadá mapa
     * @param postava = Kde je hráč
     * @return
     */
    public static boolean spust(GUI gui, Svet svet, Postava postava) {
        /// Magic
        svet.vykresli(gui);
        postava.vykresli(gui);
        gui.vykresli();
        /// Pow
        while (true){
            System.out.print("kam dal? ");
            Smer smer = gui.nactiAkci();
            if (smer != null){
                if (postava.jdi(smer)){
                    if(postava.jeDoma()){
                        System.out.println("Konecne doma...");
                        return true;
                    }
                    else{
                        gui.smaz();
                        svet.vykresli(gui);
                        postava.vykresli(gui);
                        
                    }
                }
                else{
                    System.out.println("Asi jsem se ztratil...");
                    return false;
                }
            }
            else{
                System.out.println("Asi jsem se ztratil...");
                return false;
            }
        }
        /// Done
    }
}
