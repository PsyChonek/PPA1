package ppa1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Daniel Vazač
 * @version 211125
 * Třída pole se stopamy
 */
public class Playlist {
    Stopa _list[];

    /**
     * Konstruktor
     * @param stopy
     */
    public Playlist(Stopa[] stopy) {
        _list = stopy;
    }

    /**
     * Celková dálka playlistu
     * @return
     */
    public int getCelkovaDelka() {
        int delka = 0;

        for (Stopa stopa : _list) {
            delka += stopa.getDelka();
        }

        return delka;
    }

    /**
     * Filtr pro filtrování minimální hodnocení
     * @param minHodnoceni
     * @return
     */
    public Playlist filtrujHodnoceni(double minHodnoceni) {

        int novaDelka = _list.length;
        for (Stopa stopa : _list) {
            if (stopa.getHodnoceni() < minHodnoceni) {
                novaDelka--;
            }
        }

        int addIndex = 0;
        Stopa listNew[] = new Stopa[novaDelka];
        for (Stopa stopa : _list) {
            if (stopa.getHodnoceni() >= minHodnoceni) {
                listNew[addIndex] = stopa;
                addIndex++;
            }
        }

        return new Playlist(listNew);
    }

    /**
     * Vytvoří playlist na určitou délku
     * @param minDelka
     * @return
     */
    public Playlist vyberCelkovouDelku(int minDelka) {
        List<Stopa> list = new ArrayList<Stopa>();
        int sumDelka = 0;
        for (Stopa stopa : _list) {
            list.add(stopa);
            sumDelka += stopa.getDelka();
            if (sumDelka >= minDelka) {
                break;
            }
        }

        if (sumDelka < minDelka) {
            return new Playlist(_list);
        } else {
            return new Playlist(list.toArray(new Stopa[list.size()]));
        }
    }

    /**
     * Zamíchá playlist
     * @return
     */
    public Playlist zamichej() {
        Stopa list[] = Arrays.copyOf(_list, _list.length);

        Random ran = new Random();
        for (int i = 0; i < list.length; i++){
            int nahodnaPozice = ran.nextInt(list.length);
            Stopa tmp = list[nahodnaPozice];
            list[nahodnaPozice] = list[i];
            list[i] = tmp;
        }

        return new Playlist(list);
    }

    /**
     * Vrací seznam stop v playlistu
     */
    public String toString(){
        String result = "";
        for (Stopa stopa : _list) {
            result += stopa.toString() + "\n";
        
        }
        int sec = getCelkovaDelka() % 60;
        int min = getCelkovaDelka() / 60;
        String cas = min+":";
 
        if (sec < 10){
            cas += "0"+sec;
        }
        else{
            cas += sec+"";
        }
        result += String.format("[%s]", cas);

        return result;
    }
}   
