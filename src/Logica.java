import processing.core.PApplet;

public class Logica {
	PApplet app;
	Persona perso;

	public Logica(PApplet app) {
		this.app = app;
	}

	public void nuevo() {

	}

	public void teclas() {

	}

	public void cargarTexto() {
		String[] color = app.loadStrings("../data/color.txt");
		for (int i = 0; i < color.length; i++) {
			String[] r = color[i].split(",");
			String[] g = color[i].split(",");
			String[] b = color[i].split(",");
			
		}
		
	}

}
