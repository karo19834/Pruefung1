package at.campus02.musikanten;

public class Hahn extends Musikant{
	protected int flugWeite;

	public Hahn(int anzahlBeine, Instrument instrument, int flugWeite) {
		super(anzahlBeine, instrument);
		this.flugWeite = flugWeite;
	}

	@Override
	public int verscheucheRaeuber() {
		if (flugWeite<2){
			return (int) Math.floor(instrument.getLautstaerke());
		}else if (flugWeite == 2){
			return 6;
		}else if (flugWeite==3){
			return 5;
		}else if (flugWeite==4){
			return 4;
		}else if (flugWeite==5){
			return 3;
		}else if (flugWeite==6){
			return 2;
		}else {
			return 1;
		}
	}

	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke()+2)/flugWeite;
	}

	public int getFlugWeite() {
		return flugWeite;
	}
	@Override
	public String toString() {
		return "Hahn " + flugWeite
				+": " ;
	}
}
