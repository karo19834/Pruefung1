package at.campus02.musikanten;

public class Esel  extends  Musikant{
	protected double trittkraft;

	public Esel(int anzahlBeine, Instrument instrument, double trittkraft) {
		super(anzahlBeine, instrument);
		this.trittkraft = trittkraft;
	}

	@Override
	public int verscheucheRaeuber() {
		return (int) Math.floor(trittkraft*anzahlBeine);
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override
	public String toString() {
		return "Esel " + trittkraft
				+": " ;
	}
}
