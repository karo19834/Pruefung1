package at.campus02.musikanten;

import java.util.*;

public class Quartett {

	ArrayList<Musikant> musikanten= new ArrayList<>();



	public void add(Musikant m) {
		musikanten.add(m);
	}


	public boolean istQuartett() {
		return musikanten.size()==4;
	}
	
	public int gemeinsamRaeuberVerscheucht() {
		Iterator<Musikant> it = musikanten.iterator();
		int temp=0;
		while (it.hasNext()){
			temp += it.next().verscheucheRaeuber();
		}
		return temp;
	}


	public double durchschnittlicheLautstaerke() {
		double temp=0;
		if (musikanten.isEmpty()){
			return 0;
		}
		for (Musikant m: musikanten) {
			temp += m.spieleMusik() ;
		}
		return temp/ musikanten.size();
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
		musikanten.sort(new LautstaerkeComparator());
		for (Musikant m:musikanten) {
			System.out.println(m.toString());
		}
	}
}
