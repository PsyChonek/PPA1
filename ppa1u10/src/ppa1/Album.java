package ppa1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Vazač
 * @version 211202
 * 
 * Objekt alba
 */
public class Album {
    private List<Stopa> stopy = new ArrayList<Stopa>();
    private String _title;
    private int _count;

    /**
     * Konstruktor alba ze čtenáře
     * @param ctenar
     */
    public Album(Ctenar ctenar){

        ctenar.nactiDalsiRadku();
        String element = ctenar.getElement();
        String hodnota = ctenar.getHodnota();  

        while (!element.equals("/release")) {

            if (element.equals("title")) {
                _title = hodnota;
            } 
            else if (element.equals("track-list")) {
                _count = Integer.parseInt(ctenar.getAtribut("count"));
            }    
            else if (element.equals("track")){
                stopy.add(new Stopa(ctenar));
            }

            ctenar.nactiDalsiRadku();
            element = ctenar.getElement();
            hodnota = ctenar.getHodnota();
        }
    }

    /**
     * Výpis ve stringu
     */
    public String toString(){
        String result = _title+"\n\n";

        for (Stopa stopa : stopy) {
            result += stopa.toString() + "\n"; 
        }
        
        return result;
    }
}
