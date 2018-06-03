public class MietpreisBerechner {

    public MietpreisBerechner() {

    }

    public long berechneMietpreis(int tage, int km) {

        double preis = 0;

        if (tage < 14) {
            preis = tage * 20;
            if (km<=200) {
                preis += 40;
            } else {
                preis += 40 + (km-200) * 0.15;
            }
        } else {
            preis = 300 + km * 0.12;
        }
        return (long) (preis * 100);
    }

}

