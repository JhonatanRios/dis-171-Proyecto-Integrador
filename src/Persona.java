import processing.core.PApplet;

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
		app.text(nombre, 20, 30 + y);
		app.text(apellido, 20, 30 + y);
		app.text(nombre, 20, 30 + y);
		app.text(nombre, 20, 30 + y);
		app.text(nombre, 20, 30 + y);
		app.text(nombre, 20, 30 + y);
		app.text(nombre, 20, 30 + y);

	}

}
