package ohtu.verkkokauppa;

<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
public class Kauppa {

    private Varasto varasto;
    private Pankki pankki;
    private Ostoskori ostoskori;
    private Viitegeneraattori viitegeneraattori;
    private String kaupanTili;

<<<<<<< HEAD
    public Kauppa() {
        varasto = Varasto.getInstance();
        pankki = Pankki.getInstance();
        viitegeneraattori = Viitegeneraattori.getInstance();
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = varasto.haeTuote(id); 
        varasto.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (varasto.saldo(id)>0) {
            Tuote t = varasto.haeTuote(id);             
=======
    @Autowired
    public Kauppa(Varasto varasto, Pankki pankki, Viitegeneraattori viitegeneraattori) {
        this.varasto = varasto;
        this.pankki = pankki;
        this.viitegeneraattori = viitegeneraattori;
        this.kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new OmaOstoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = varasto.haeTuote(id);
        varasto.palautaVarastoon(t);
        ostoskori.poista(t);
    }

    public void lisaaKoriin(int id) {
        if (varasto.saldo(id) > 0) {
            Tuote t = varasto.haeTuote(id);
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
            ostoskori.lisaa(t);
            varasto.otaVarastosta(t);
        }
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattori.uusi();
        int summa = ostoskori.hinta();
<<<<<<< HEAD
        
=======

>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
        return pankki.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
