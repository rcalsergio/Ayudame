import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testVelocidadOrbital() {
        // Velocidad orbital en órbita baja terrestre (~400 km sobre la Tierra)
        double v = Main.velocidadOrbital(6771, 5.972e24);
        assertTrue(v > 7.6 && v < 7.9, "La velocidad orbital debería estar alrededor de 7.7 km/s");
    }

    @Test
    void testCalcularEmpuje() {
        double empuje = Main.calcularEmpuje(250, 3000);
        assertEquals(750000, empuje, "El empuje debería ser 250 * 3000 = 750000 N");
    }

    @Test
    void testNumeroOrbita() {
        assertEquals(3, Main.numeroOrbita("Tierra"));
        assertEquals(4, Main.numeroOrbita("marte"));
        assertEquals(-1, Main.numeroOrbita("Pluton"));
    }

    @Test
    void testPromedioAltitudes() {
        double[] sats = {400, 550, 20200, 35786};
        double promedio = Main.promedioAltitudes(sats);
        assertEquals(14234, Math.round(promedio), "El promedio debería ser aproximadamente 14234 km");
    }

    @Test
    void testConvertirTiempo() {
        assertEquals("02:44:36", Main.convertirTiempo(9876));
        assertEquals("00:00:05", Main.convertirTiempo(5));
        assertEquals("01:00:00", Main.convertirTiempo(3600));
    }
}