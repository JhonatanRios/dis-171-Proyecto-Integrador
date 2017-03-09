import processing.core.PApplet;

public class Logica {
	PApplet app;
	Persona perso;

	public Logica(PApplet app) {
		this.app = app;
	}

	public void nuevo() {
		perso.pintar();
	}

	public void cargarTexto() {

		String[] color = app.loadStrings("../data/color.txt");
		String[] info = app.loadStrings("../data/Informacion.txt");
		String[] usu = app.loadStrings("../data/Usuario.txt");

		for (int i = 0; i < usu.length; i++) {
			String[] nombre = usu[i].split(":");
			String[] apellido = usu[i].split(":");

			for (int j = 0; j < info.length; j++) {
				String[] parte3 = info[j].split("/");
				String[] parte4 = info[j].split("/");
				String[] parte5 = info[j].split("/");
				int cedula = Integer.parseInt(parte3[j]);
				int edad = Integer.parseInt(parte4[j]);
				int peso = Integer.parseInt(parte5[j]);

				for (int k = 0; k < color.length; k++) {
					String[] parte6 = color[k].split(",");
					String[] parte7 = color[k].split(",");
					String[] parte8 = color[k].split(",");
					int r = Integer.parseInt(parte6[k]);
					int g = Integer.parseInt(parte7[k]);
					int b = Integer.parseInt(parte8[k]);

					perso = new Persona(app, nombre[i], apellido[i], cedula, edad, peso, r, g, b);
				}
			}
		}

	}

	public void teclas() {

	}

}
