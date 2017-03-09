import processing.core.PApplet;
import processing.core.PConstants;

public class Persona {

	PApplet app;
	String nombre;
	String apellido;
	int cedula;
	int edad;
	int peso;
	int r;
	int g;
	int b;
	int x;
	int y;

	public Persona(PApplet app, String nombre, String apellido, int cedula, int edad, int peso, int r, int g, int b) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void pintar() {
		app.fill(r, g, b);
		app.textSize(17);
		app.textAlign(PConstants.CENTER, PConstants.CENTER);
		app.text("Nombre: " + nombre + " // Apellido: " + apellido + " // CC: " + cedula + " // Edad: " + edad
				+ " // Peso: " + peso, app.width / 2, y);
	}

}
