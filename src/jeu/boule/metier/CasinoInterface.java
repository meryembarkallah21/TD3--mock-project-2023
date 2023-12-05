package jeu.boule.metier;

public interface CasinoInterface {
    int getNumSorti();

    int gainOuPerte();

    void enregistrerMise(Joueur joueur);

    int calculerGain(Joueur joueur);
   public void addMiseSimple(String st,Integer i);
    public void addMiseNumero(Integer numero, Integer quantite);
    public void indiqueNumeroSorti ();
    public void depotMiseSimple(String nomMise, int quantite);

    public void depotMiseNumero(int numero,int quantite);




}
