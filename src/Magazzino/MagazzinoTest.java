package Magazzino;
import Dispositivi.Dispositivi;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MagazzinoTest {

    @Test
    public void testAggiungiDispositivi() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo = new Dispositivi();
        magazzino.aggiungiDispositivi(dispositivo);
        assertEquals(1, magazzino.getListaDispositivi().size());
    }
    @Test
    public void testRicercaProduttore() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo = new Dispositivi("smartphone", "apple", "3", "iphone 15", "nuovo", 800, "125 GB", 999);
        magazzino.aggiungiDispositivi(dispositivo);
        List<Dispositivi> result = magazzino.ricercaProduttore("apple");
        List<Dispositivi> expected = magazzino.ricercaProduttore("apple");
        assertEquals(expected, result);
    }
}
