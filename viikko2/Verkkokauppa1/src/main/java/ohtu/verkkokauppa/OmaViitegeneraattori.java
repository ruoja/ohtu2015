package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

public class OmaViitegeneraattori implements Viitegeneraattori {
  
    private int seuraava;
    
    public OmaViitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
