package ppa1;
/**
 * @author Daniel Vazač
 * @version 211118
 */
public class Postava {

    /**
     * Svet
     */
    Svet _svet;
    /**
     * Pozice na mapě a hráče
     */
    int _startX, _startY, _domovX, _domovY, _tedX, _tedY;
    
    /**
     * Konstruktor hráče
     * @param svet
     * @param startX
     * @param startY
     * @param domovX
     * @param domovY
     */
    public Postava(Svet svet, int startX, int startY, int domovX, int domovY){

        _domovX = domovX;
        _domovY = domovY;
        _startX = startX;
        _startY = startY;
        _tedX = startX;
        _tedY = startY;
        _svet = svet;
    } 

    /**
     * Hráč jde
     * @param smer
     * @return
     */
    public boolean jdi(Smer smer){
        switch (smer){
            case SEVER:
               if (_svet.uzemi(_tedX,_tedY-1) == ' '){
                   _tedY--;
                return true;
               }
               break;
            case VYCHOD:
               if (_svet.uzemi(_tedX+1,_tedY) == ' '){
                _tedX++;
                return true;
               }
               break;
            case JIH:
               if (_svet.uzemi(_tedX,_tedY+1) == ' '){
                _tedY++;
                return true;
               }
               break;
            case ZAPAD:
               if (_svet.uzemi(_tedX-1,_tedY) == ' '){
                _tedX--;
                return true;
               }
               break;
        }
        return false;
    }

    /**
     * Kontrola zda je hráč doma
     * @return
     */
    public boolean jeDoma(){
        if (_tedX == _domovX && _tedY == _domovY){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Vykreslí hráče a domeček na mapě
     * @param gui
     */
    public void vykresli(GUI gui){
        gui.zapis(_domovX, _domovY, '^');
        gui.zapis(_tedX, _tedY, '@');
    }
}
