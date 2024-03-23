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
        magazzino.aggiungiDispositiviMagazzino(dispositivo);
        assertEquals(1, magazzino.getListaDispositivi().size());
    }

    @Test
    public void testRicercaProduttore() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo = new Dispositivi("smartphone", "apple", "3", "iphone 15", "nuovo", 800, "125 GB", 999);
        magazzino.aggiungiDispositiviMagazzino(dispositivo);
        List<Dispositivi> result = magazzino.ricercaProduttore("apple");
        List<Dispositivi> expected = magazzino.ricercaProduttore("apple");
        assertEquals(expected, result);
    }

    @Test
    public void testCercaPerPrezzo() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo1 = new Dispositivi("tablet", "samnsung", "6", "Galaxy", "bianco", 500.00, "1100", 900.00);
        Dispositivi dispositivo2 = new Dispositivi("notebook", "dell", "14", "Galaxy", "grigio", 700.00, "1100", 1000.00);
        Dispositivi dispositivo3 = new Dispositivi("smartphone", "apple", "5", "Galaxy", "blu", 600.00, "1100", 1200.00);
        List<Dispositivi> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(dispositivo1);
        listaDispositivi.add(dispositivo2);
        listaDispositivi.add(dispositivo3);
        double prezzoDaCercare = 700.0;
        List<Dispositivi> result = magazzino.cercaPerPrezzo(listaDispositivi, prezzoDaCercare);
        List<Dispositivi> expected = new ArrayList<>();
        expected.add(dispositivo2);
        assertEquals(expected, result);


    }

    @Test
    public void testcercaPerPrezzoAcquisto() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo1 = new Dispositivi("tablet", "samnsung", "6", "Galaxy", "bianco", 500.00, "1100", 900.00);
        Dispositivi dispositivo2 = new Dispositivi("notebook", "dell", "14", "Galaxy", "grigio", 700.00, "1100", 1000.00);
        Dispositivi dispositivo3 = new Dispositivi("smartphone", "apple", "5", "Galaxy", "blu", 600.00, "1100", 1200.00);
        List<Dispositivi> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(dispositivo1);
        listaDispositivi.add(dispositivo2);
        listaDispositivi.add(dispositivo3);
        double cercaPrezzoAcquisto = 900.0;
        List<Dispositivi> result = magazzino.cercaPerPrezzoAcquisto(listaDispositivi, cercaPrezzoAcquisto);
        List<Dispositivi> expected = new ArrayList<>();
        expected.add(dispositivo1);
        assertEquals(expected, result);

    }

    @Test
    public void testcercaPerRangePrezzo() {
        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo1 = new Dispositivi("tablet", "samnsung", "6", "Galaxy", "bianco", 500.00, "1100", 900.00);
        Dispositivi dispositivo2 = new Dispositivi("notebook", "dell", "14", "Galaxy", "grigio", 700.00, "1100", 1000.00);
        Dispositivi dispositivo3 = new Dispositivi("smartphone", "apple", "5", "Galaxy", "blu", 600.00, "1100", 1200.00);
        List<Dispositivi> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(dispositivo1);
        listaDispositivi.add(dispositivo2);
        listaDispositivi.add(dispositivo3);
        double prezzoMin = 500.0;
        double prezzoMax = 600.0;
        List<Dispositivi> result = magazzino.cercaPerRangePrezzo(listaDispositivi, prezzoMin, prezzoMax);
        List<Dispositivi> expected = new ArrayList<>();
        expected.add(dispositivo1);
        expected.add(dispositivo3);
        assertEquals(expected, result);
    }

    @Test
    public void testCalcolaSpesaMedia() {

        Magazzino magazzino = new Magazzino();
        Dispositivi dispositivo1 = new Dispositivi("tablet", "samnsung", "6", "Galaxy", "bianco", 500.00, "1100", 900.00);
        Dispositivi dispositivo2 = new Dispositivi("notebook", "dell", "14", "Galaxy", "grigio", 700.00, "1100", 1000.00);
        Dispositivi dispositivo3 = new Dispositivi("smartphone", "apple", "5", "Galaxy", "blu", 600.00, "1100", 1200.00);
        List<Dispositivi> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(dispositivo1);
        listaDispositivi.add(dispositivo2);
        listaDispositivi.add(dispositivo3);
        double result = magazzino.calcolaSpesaMedia(listaDispositivi);
        double expected = (500.00 + 700.00 + 600.00)/3;
        assertEquals(expected,result, 0.001);  // Utilizzo di delta per la comparazione in virgola mobile

    }
}
