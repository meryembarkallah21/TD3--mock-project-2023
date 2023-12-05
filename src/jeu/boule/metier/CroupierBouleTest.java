package jeu.boule.metier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CroupierBouleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void getNumSorti() {
    }

    @Test
    void gainOuPerte() {
        CroupierBoule croupier = new CroupierBoule();
        croupier.addMiseNumero(8, 3);
        croupier.addMiseNumero(9, 3);
        croupier.addMiseSimple("noir", 5);
        croupier.addMiseSimple("pair", 2);
        croupier.addMiseSimple("passe", 15);

        croupier.indiqueNumeroSorti(); // Simulate the ball landing on a number

        int result = croupier.gainOuPerte();

        // Expected gain for the provided bets when the ball lands on number 8
        assertEquals(40, result);
    }


    @Test
    void enregistrerMise() {
    }

    @Test
    void calculerGain() {
    }

    @Test
    void addMiseSimple() {
    }

    @Test
    void addMiseNumero() {
    }

    @Test
    void indiqueNumeroSorti() {
    }

    @Test
    void depotMiseSimple() {
    }

    @Test
    void depotMiseNumero() {
    }
}