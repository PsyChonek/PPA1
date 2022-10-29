/**
 * Metoda úkolu
 */
public class Ppa1u01b {
    /**
     * Vstupní metoda která i provádí výpočty a výpis.
     * @param args
     */
    public static void main(String[] args) {

        int hSize = 345;
        int vSize = 194;
        int hResolution = 1920;
        int vResolution = 1080;

        double hPPI = hResolution / (hSize * 0.0393700787);
        double vPPI = vResolution / (vSize * 0.0393700787);
        double rPPI = hPPI / vPPI;
        double pitch = (1 / hPPI) * 25.4;
        double width = pitch * 200;
        double height = pitch * 100;

        String display = "Aspire VX5-591G";
        String url = "https://www.notebookcheck.net/Acer-Aspire-VX-15-VX5-591G-7300HQ-GTX-1050-Full-HD-Laptop-Review.223526.0.html";

        System.out.println("hSize [mm] = " + hSize);
        System.out.println("vSize [mm] = " + vSize);
        System.out.println("hResolution [pixels] = " + hResolution);
        System.out.println("vResolution [pixels] = " + vResolution);
        System.out.println("---------------------");
        System.out.println("hPPI = " + hPPI);
        System.out.println("vPPI = " + vPPI);
        System.out.println("rPPI = " + rPPI);
        System.out.println("pitch [mm] = " + pitch);
        System.out.println("width [mm] = " + width);
        System.out.println("height [mm] = " + height);
        System.out.println("display = " + display);
        System.out.println("url = " + url);
    }
}
