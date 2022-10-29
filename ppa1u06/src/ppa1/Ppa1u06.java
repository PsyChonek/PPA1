package ppa1;

import java.util.Scanner;

public class Ppa1u06 {
    /**
     * Vstupní metoda programu
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo = nactiPrirozeneCislo(sc);
        cislo = jeSoucetPrvocisel(cislo);
    }

    /**
     * Metoda, která pro dané číslo zjistí, zda se jedná o prvočíslo či nikoliv.
     * 
     * @param cislo
     * @return
     */
    public static boolean jePrvocislo(int cislo) {
        if (cislo == 0 || cislo == 1){
            return false;
        }

        for (int i = 2; i < cislo; i++) {
            if (cislo % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Metoda, která spočítá, zda je možné číslo předané v parametru vyjádřit jako
     * součet dvou prvočísel a pokud ano, vrátí větší (či roven) ze sčítanců, v
     * opačném případě vrátí 0.
     * 
     * @param cislo
     * @return
     */
    public static int jeSoucetPrvocisel(int cislo) {
        boolean reseniExistuje = false;
        boolean konec = false;
        int a = 0;
        int b = 0;

        /**
         * Brute force
         */
        while (!konec) {
            a++;
            b = a;
            while ( b < cislo || (a + b) < cislo){
                if (a + b == cislo) {
                    if (jePrvocislo(a) && jePrvocislo(b)){
                        konec = true;
                        reseniExistuje = true;
                        break;
                    }
                }
                b++;
            }
            if (a > cislo) {
                konec = true;
                reseniExistuje = false;
            }   
        }
        if (reseniExistuje){
            System.out.println("Lze rozlozit: " + a +" + "+b);
            if (a>=b){
                return a;
            }
            else{
                return b;
            }
        }
        System.out.println("Nelze rozlozit.");
        return 0;
    }

    /**
     * Metoda pro oddělení vstupu od zbytku programu, která bude z předaného
     * scanneru sc načítat celá čísla, dokud uživatel nezadá přirozené číslo.
     * 
     * @param sc
     * @return
     */
    public static int nactiPrirozeneCislo(Scanner sc) {
        
        System.out.print("Zadej prirozene cislo: ");
        int cislo = sc.nextInt();
        while (cislo < 1) {
            System.out.print("Zadej prirozene cislo: ");
            cislo = sc.nextInt();
        }

        return cislo;
    }

}
