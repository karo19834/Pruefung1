package at.campus02.musikanten;

public class Katze extends Musikant{
	protected double kratzKraft;

	public Katze(int anzahlBeine, Instrument instrument, double kratzKraft) {
		super(anzahlBeine, instrument);
		this.kratzKraft = kratzKraft;
	}

	@Override
	public int verscheucheRaeuber() {
		if (anzahlBeine == 3){
			return (int)Math.floor(kratzKraft/2);
		}else if (anzahlBeine<=2){
			return 1;
		}else {
			return (int)Math.floor(kratzKraft);
		}
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	public double getKratzKraft() {
		return kratzKraft;
	}
	@Override
	public String toString() {
		return "Katze " + kratzKraft
				+": "+ super.toString() ;
	}
}
