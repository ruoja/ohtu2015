<<<<<<< HEAD
package ohtu.verkkokauppa;

public class Viitegeneraattori {

    private static Viitegeneraattori instanssi;

    public static Viitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori();
        }

        return instanssi;
    }
    
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
=======

package ohtu.verkkokauppa;

public interface Viitegeneraattori {

    int uusi();
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
}
