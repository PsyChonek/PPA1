/**
 * Třída pojmenovaná po zadání domácího úkolu.
 */
public class Ppa1u01a {
    /**
     * Třída main která vypočítá povrch a délky stran kvádru.
     * @param args -- Vstupní argumenty
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 82;
        int c = 37;
        int s = 2 * (a * b + a * c + b * c);
        int d = 4 * (a + b + c);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("----");
        System.out.println("s = " + s);
        System.out.println("d = " + d);
    }
}