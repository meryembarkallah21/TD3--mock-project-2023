package jeu.boule.test;

import jeu.boule.metier.CasinoInterface;
import jeu.boule.metier.Joueur;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JoueurTest {
    static Joueur joueur;
    static CasinoInterface laDoublure = mock(CasinoInterface.class);
    @BeforeAll
    static void setUpBeforeClass() throws Exception{

    }

    @BeforeEach
    void setUp() {
        joueur = new Joueur();
        laDoublure = mock(CasinoInterface.class);
        joueur.setLeCasino(laDoublure);
    }

    @Test
    void testGagne() {
        // On suppose que c'est le joueur n'a joué que sur le 8 avec
        // 3 jetons et que le 8 sort
        System.out.println("Le joueur n'a joué que sur le 8 avec 3 jetons et le 8 est sorti");
        when(laDoublure.getNumSorti()).thenReturn(8);
        when(laDoublure.gainOuPerte()).thenReturn(21);
        int gagneOuPerdu = joueur.aGagneOuPerdu();
        System.out.println("Le joueur a gagné : "
                + gagneOuPerdu + " parce que le numéro sorti est : " + joueur.getNumeroSorti());
        assertEquals(21, gagneOuPerdu);
        System.out.println("fin de testGagne");
    }

    @Test
    void testPerdu() {
        // On suppose que c'est le joueur n'a joué que sur le 8 avec
        // 3 jetons et que le 9 est sorti
        System.out.println("Le joueur n'a joué que sur le 8 avec 3 jetons et le 9 est sorti");
        when(laDoublure.getNumSorti()).thenReturn(9);
        when(laDoublure.gainOuPerte()).thenReturn(-3);
        int gagneOuPerdu = joueur.aGagneOuPerdu();
        System.out.println("Le joueur a gagné : "
                + gagneOuPerdu + " parce que le numéro sorti est : " + joueur.getNumeroSorti());
        assertEquals(-3, gagneOuPerdu);
        System.out.println("fin de testPerdu");
    }

    @Test
    void getNumeroSorti() {
        // Test method implementation here
    }
}