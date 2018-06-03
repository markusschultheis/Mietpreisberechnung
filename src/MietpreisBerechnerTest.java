public class MietpreisBerechnerTest extends junit.framework.TestCase {

    protected MietpreisBerechner m;

    public void setUp() {
        m = new MietpreisBerechner();
    }


    public void testA() {

        assertEquals("Die Mietkosten entsprechen nicht den Erwartungen bei 1 Tag, 10km",
                6000, m.berechneMietpreis(1,10));

    }

    public void testB() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 2 Tage, 0km",
                8000, m.berechneMietpreis(2,0));
    }

    public void testC() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 4 Tage, 200km",
                12000, m.berechneMietpreis(4,200));
    }

    public void testD() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 8 Tage, 250km",
                20750, m.berechneMietpreis(8,250));
    }

    public void testE() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 11 Tage, 199km",
                26000, m.berechneMietpreis(11,199));
    }

    public void testF() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 13 Tage, 150km",
                30000, m.berechneMietpreis(13,150));
    }

    public void testG() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 14 Tage, 150km",
                31800, m.berechneMietpreis(14,150));
    }

    public void testH() {

        assertEquals("Der Mietpreis entspricht nicht den Erwartungen bei 20 Tage, 250km",
                33000, m.berechneMietpreis(20,250));
    }
}