
package ohtu.verkkokauppa;

import java.util.ArrayList;

<<<<<<< HEAD
public class Kirjanpito {
    private static Kirjanpito instance;

    public static Kirjanpito getInstance() {
        if ( instance==null) {
            instance = new Kirjanpito();
        }

        return instance;
    }

    private ArrayList<String> tapahtumat;

    private Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }

    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
=======
public interface Kirjanpito {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
}
