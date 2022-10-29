package ppa1;

/**
 * @author Daniel Vazač
 * @version 211118
 */
public class Svet {

    /**
     * Pole s mapou
     */
    char[][] _svetMapa;

    /**
     * Konstruktor světa
     * @param sirka
     * @param vyska
     * @param data
     */
    public Svet(int sirka, int vyska, char[] data){
        _svetMapa = new char[vyska][sirka];
        for (int indexSveta = 0; indexSveta < data.length; indexSveta++){
                _svetMapa[indexSveta / sirka][indexSveta % sirka] = data[indexSveta];
        }
    }    

    /**
     * Zkontroluje zda nová pozice je valdiní
     * @param x
     * @param y
     * @return
     */
    public char uzemi(int x, int y){
        if (x >= 0 && y >= 0 && x  < _svetMapa[0].length && y < _svetMapa.length){
            if (y > _svetMapa.length || x > _svetMapa[0].length){
                return 0;
            }
            else {
                return _svetMapa[y][x];
            }
        }
        else{
            return 0;
        }
    }

    /**
     * Vykreslí mapu na GUI
     * @param gui
     */
    public void vykresli(GUI gui){
        for (int ra = 0; ra < _svetMapa.length; ra++){
                for (int sl = 0; sl < _svetMapa[ra].length; sl++){
                gui.zapis(sl, ra, _svetMapa[ra][sl]);
            }
        }
    }


}
