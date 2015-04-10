package ohtu.lyyrakortti;

public class Kassapaate {
<<<<<<< HEAD
=======

>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
    private int myytyjaLounaita;
    public static final int HINTA = 5;

    public Kassapaate() {
        this.myytyjaLounaita = 0;
    }
<<<<<<< HEAD
    
    public void lataa(Lyyrakortti kortti, int summa){
        kortti.lataa(summa);
    }
    
    public void ostaLounas(Lyyrakortti kortti) {
        kortti.osta(HINTA);
        myytyjaLounaita++;
=======

    public void lataa(Lyyrakortti kortti, int summa) {
        if (summa > 0) {
            kortti.lataa(summa);
        }
    }

    public void ostaLounas(Lyyrakortti kortti) {
        if (kortti.getSaldo() >= HINTA) {
            kortti.osta(HINTA);
            myytyjaLounaita++;
        }
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
    }

    public int getMyytyjaLounaita() {
        return myytyjaLounaita;
    }
}
