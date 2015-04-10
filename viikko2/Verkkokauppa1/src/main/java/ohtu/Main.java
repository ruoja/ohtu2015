package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
<<<<<<< HEAD
=======
import ohtu.verkkokauppa.OmaKirjanpito;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        Kauppa kauppa = new Kauppa();
=======
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        Kirjanpito kirjanpito = (OmaKirjanpito) ctx.getBean("omaKirjanpito");
        Kauppa kauppa = (Kauppa) ctx.getBean("kauppa");
        
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
<<<<<<< HEAD
        for (String tapahtuma : Kirjanpito.getInstance().getTapahtumat()) {
=======
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
            System.out.println(tapahtuma);
        }
    }
}
