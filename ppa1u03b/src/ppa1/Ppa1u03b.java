package ppa1;

/**
 * @author Daniel Vazač
 * @version 1
 */
public class Ppa1u03b {
    /**
     * Vstupní metoda
     * 
     * @param args
     */
    public static void main(String[] args) {

        java.util.Scanner cs = new java.util.Scanner(System.in);

        // 14:00 -> 0 minut 3:00 -> 780

        int zacatekA = 0;
        int delkaA = 0;
        int zacatekB = 0;
        int delkaB = 0;

        System.out.println("zacatek filmu A: ");
        System.out.print("hodina: ");
        zacatekA = cs.nextInt();
        if (zacatekA < 14) 
        {
            zacatekA = 600 + zacatekA * 60;
        }
        else{
            zacatekA = (zacatekA - 14) * 60;
        }
        System.out.print("minuta: ");
        zacatekA += cs.nextInt();

        System.out.println("delka filmu A: ");
        System.out.print("hodina: ");
        delkaA = cs.nextInt() *60; 
        System.out.print("minuta: ");
        delkaA += cs.nextInt();

        System.out.println("zacatek filmu B: ");
        System.out.print("hodina: ");
        zacatekB= cs.nextInt();
        if (zacatekB < 14) 
        {
            zacatekB = 600 + zacatekB * 60;
        }
        else{
            zacatekB = (zacatekB - 14) * 60;
        }
        System.out.print("minuta: ");
        zacatekB += cs.nextInt();

        System.out.println("delka filmu B: ");
        System.out.print("hodina: ");
        delkaB= cs.nextInt()*60;
        System.out.print("minuta: ");
        delkaB += cs.nextInt();

        int casSkonceniA = zacatekA + delkaA;
        int casSkonceniB = zacatekB + delkaB;



        if (casSkonceniA >= casSkonceniB) {
            System.out.println("doporuceni: to nedas");
        } 
        else {
            int neuvidis = casSkonceniA - zacatekB;

            if (neuvidis <= 0) {
                System.out.println("doporuceni: v pohode");
            } else {
                System.out.println("doporuceni: neuvidis " + neuvidis + " minut");
            }

        }
    }
}
