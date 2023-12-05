package jeu.boule.metier;

public class Joueur {
    private int mise;
    private int numeroChoisi;
    private CasinoInterface laDoublure;

    public Joueur() {
        // Constructeur par défaut
    }

    public void setLeCasino(CasinoInterface casino) {
        this.laDoublure = casino;
    }

    public int aGagneOuPerdu() {
        return laDoublure.gainOuPerte();
    }

    public int getNumeroSorti() {
        return laDoublure.getNumSorti();
    }

}
