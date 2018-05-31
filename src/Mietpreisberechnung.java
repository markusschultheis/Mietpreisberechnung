public class Mietpreisberechnung {

    private int mietdauer;
    private double mietpreis;
    private int gefKilometer;

    public Mietpreisberechnung(int mietdauer, int gefKilometer) {
        this.mietdauer = mietdauer;
        this.gefKilometer = gefKilometer;
    }

    public void berechneMietpreis() {

        mietpreis = 0;
        if (mietdauer < 14) {
            mietpreis = mietdauer * 20 * 100;
            if (gefKilometer <= 200) {
                mietpreis += 40 * 100;
            } else {

                if (gefKilometer > 200) {
                    mietpreis += (40 + gefKilometer * 0.15) * 100;
                }
            }
        }

            if (mietdauer >= 14) {
                mietpreis = (300 + gefKilometer * 0.12) * 100;
            }
        }

    public void setMietdauer(int mietdauer) {
        this.mietdauer = mietdauer;
    }

    public void setGefKilometer(int gefKilometer) {
        this.gefKilometer = gefKilometer;
    }

    public double getMietpreis() {
        return mietpreis;
    }

    public int getGefKilometer() {
        return gefKilometer;
    }

    public int getMietdauer() {
        return mietdauer;
    }

    public void setMietpreis(double mietpreis) {
        this.mietpreis = mietpreis;
    }
}

