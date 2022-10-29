package ppa1;

/**
 * @author Daniel Vazač
 * @version 211202
 * 
 * Objekt stopy
 */
public class Stopa {
    private String _title;
    private int _number;
    private int _lenght;

    /**
     * Konstruktor stopy ze čtenáře
     * @param ctenar
     */
    public Stopa(Ctenar ctenar) {
        ctenar.nactiDalsiRadku();
        String element = ctenar.getElement();
        String hodnota = ctenar.getHodnota();

        while (!element.equals("/track")) {

            if (element.equals("title")) {
                _title = hodnota;
            } else if (element.equals("number")) {
                _number = Integer.parseInt(hodnota);
            } else if (element.equals("length")) {
                _lenght = Integer.parseInt(hodnota)/1000;
            }

            ctenar.nactiDalsiRadku();
            element = ctenar.getElement();
            hodnota = ctenar.getHodnota();
        }  
    }

    /***
     * Výpis stopy ve stringu
     */
    public String toString(){
        int minuty = _lenght/60;
        int sec = _lenght%60;

        return String.format("%02d - %s [%d:%02d]", _number,_title,minuty,sec);
    }
}
