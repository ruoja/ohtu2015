
package ohtu.verkkokauppa;

public interface Ostoskori {

    int hinta();

    void lisaa(Tuote t);

    void poista(Tuote t);
    
}
