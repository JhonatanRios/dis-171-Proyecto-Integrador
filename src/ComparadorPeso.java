import java.util.Comparator;

public class ComparadorPeso implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getPeso() - p2.getPeso();
	}

}
