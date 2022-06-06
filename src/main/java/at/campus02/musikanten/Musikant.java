package at.campus02.musikanten;

public abstract class Musikant {

     int anzahlBeine;
     Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    abstract int verscheucheRaeuber();
    abstract double spieleMusik();

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Verscheucht: "+ verscheucheRaeuber()
                + ", Musiziert: "+ spieleMusik();
    }
}
