import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class Logica {
	PApplet app;
	Persona perso;
	ArrayList<Persona> persona = new ArrayList<Persona>();

	public Logica(PApplet app) {
		this.app = app;
	}

	public void nuevo() {
		perso.pintar();
	}

	// Colaboración de santiago montealegre
	public void cargarTexto() {

		String[] color = app.loadStrings("../data/color.txt");
		String[] info = app.loadStrings("../data/Informacion.txt");
		String[] usu = app.loadStrings("../data/Usuario.txt");

		for (int i = 0; i < usu.length; i++) {
			String[] nombre_ape = usu[i].split(":");

			for (int j = 0; j < info.length; j++) {
				String[] cel_eda_pes = info[j].split("/");
				int cedula = Integer.parseInt(cel_eda_pes[0]);
				int edad = Integer.parseInt(cel_eda_pes[1]);
				int peso = Integer.parseInt(cel_eda_pes[2]);

				for (int k = 0; k < color.length; k++) {
					String[] rgb = color[k].split("/");
					int r = Integer.parseInt(rgb[0]);
					int g = Integer.parseInt(rgb[1]);
					int b = Integer.parseInt(rgb[2]);

					persona.add((new Persona(app, nombre_ape[0], nombre_ape[1], cedula, edad, peso, r, g, b)));
				}
			}
		}

	}

	// No lo pude realizar
	public void teclas() {
		if (app.key == 1) {

		}
		if (app.key == 2) {

		}
		if (app.key == 3) {

		}
		if (app.key == 4) {

		}
	}

}
