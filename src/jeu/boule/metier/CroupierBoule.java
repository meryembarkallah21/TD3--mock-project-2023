package jeu.boule.metier;

import java.util.HashMap;

public class CroupierBoule implements CasinoInterface{
    private HashMap<String, Integer> lesMisesSimples = new HashMap<String, Integer>();
    private HashMap<Integer, Integer> lesNumeros = new HashMap<Integer, Integer>();
    private int resultat;
    @Override
    public int getNumSorti() {
        return 0;
    }

    @Override
    public int gainOuPerte() {
        int totalGain = 0;

        // Calculate winnings based on the outcome (resultat)
        for (var entry : lesNumeros.entrySet()) {
            int numero = entry.getKey();
            int quantite = entry.getValue();

            if (numero == resultat) {
                totalGain += quantite * 5; // Assuming a fixed payout for correct number
            } else {
                totalGain -= quantite; // Player loses the amount they bet on this number
            }
        }

        // Calculate winnings for simple bets
        for (var entry : lesMisesSimples.entrySet()) {
            String st = entry.getKey();
            int quantite = entry.getValue();

            if ("noir".equals(st) && (resultat % 2 == 0)) {
                totalGain += quantite;
            } else if ("pair".equals(st) && (resultat % 2 == 0)) {
                totalGain += quantite;
            } else if ("passe".equals(st) && (resultat >= 9 && resultat <= 16)) {
                totalGain += quantite;
            } else {
                totalGain -= quantite;
            }
        }

        return totalGain;
    }

    @Override
    public void enregistrerMise(Joueur joueur) {

    }

    @Override
    public int calculerGain(Joueur joueur) {
        return 0;
    }

    @Override
    public void addMiseSimple(String st, Integer i) {
        lesMisesSimples.put(st, i);
    }

    @Override
    public void addMiseNumero(Integer numero, Integer quantite) {
        lesNumeros.put(numero, quantite);
    }

    @Override
    public void indiqueNumeroSorti() {
        resultat = 8;

    }

    @Override
    public void depotMiseSimple(String nomMise, int quantite) {

    }

    @Override
    public void depotMiseNumero(int numero, int quantite) {

    }
}
