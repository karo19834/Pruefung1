package at.campus02.musikanten;

public class Hund extends Musikant{
	protected double bellLautstaerke;

	public Hund(int anzahlBeine, Instrument instrument, double bellLautstaerke) {
		super(anzahlBeine, instrument);
		this.bellLautstaerke = bellLautstaerke;
	}

	@Override
	public int verscheucheRaeuber() {
		if ( instrument.getLautstaerke()> bellLautstaerke  ){
			return (int)Math.floor(instrument.getLautstaerke());
		}
		return (int)Math.floor(bellLautstaerke);
	}

	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke()+bellLautstaerke)/2;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}
	@Override
	public String toString() {
		return "Hund " + bellLautstaerke
				+": " + super.toString();
	}
}
