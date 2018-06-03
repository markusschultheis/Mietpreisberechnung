public class MeinMietpreisBerechner {

    public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {

        double preis = 0;

        if (tage <= 0) {
            throw new UngueltigeTagesanzahlAusnahme();
        }

        if (km < 0) {
            throw new UngueltigeKilometerangabeAusnahme();
        }

        if (tage < 14) {
            preis = tage * 20;
            if (km <= 200) {
                preis += 40;
            } else {
                preis += 40 + (km - 200) * 0.15;
            }
        } else {
            preis = 300 + km * 0.12;
        }
        return (long) (preis * 100);
    }

}
