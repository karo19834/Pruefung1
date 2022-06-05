package at.campus02.musikanten;

import java.util.*;

public class Quartett {

	ArrayList<Musikant> musikanten= new ArrayList<>();



	public void add(Musikant m) {
		musikanten.add(m);
	}
	public boolean istQuartett() {
		for (Musikant m: musikanten) {
			if (musikanten.size()==4){
				return true;
			}
		}
		return false;
	}
	
	public int gemeinsamRaeuberVerscheucht() {
		int help=0;
		for (Musikant m:musikanten) {
			help += m.verscheucheRaeuber();
		}
		return help;
	}
	public double durchschnittlicheLautstaerke() {
		double help=0;
		for (Musikant m: musikanten) {
			help += m.spieleMusik() ;
		}
		return help/ musikanten.size();
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
		ArrayList<Musikant> lista = new ArrayList<>();
		for ( Musikant m:musikanten) {
			if (m.spieleMusik()>=von && m.spieleMusik()<=bis){
				lista.add(m);
			}
		}
		return lista;
	}

	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
		HashMap<Integer,Integer> mapa = new HashMap<>();
		for (Musikant m:musikanten) {
			Integer ilosc = mapa.get(m.getAnzahlBeine());
		if (ilosc ==null){
			ilosc=1;
		} else {
			ilosc++;
		}
		mapa.put(m.getAnzahlBeine(), ilosc);
		}
		return mapa;
	}

	@Override
	public String toString() {
		return "Quartett{" +
				"musikanten=" + musikanten +
				'}';
	}

	public void printLautStaerkeAbsteigend() {
		musikanten.sort(new LautstaerkeComparator().reversed());
		for (Musikant m:musikanten) {
			System.out.println(m);
		}
	}
}
