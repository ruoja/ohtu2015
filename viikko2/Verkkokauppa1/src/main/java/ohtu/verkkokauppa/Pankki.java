<<<<<<< HEAD
package ohtu.verkkokauppa;

public class Pankki {

    private static Pankki instanssi;

    public static Pankki getInstance() {
        if (instanssi == null) {
            instanssi = new Pankki();
        }

        return instanssi;
    }
    private Kirjanpito kirjanpito;

    private Pankki() {
        kirjanpito = Kirjanpito.getInstance();
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
=======

package ohtu.verkkokauppa;

public interface Pankki {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
}
