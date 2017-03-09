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
		app.text(nombre, 20, 30 + (y * 30));
		app.text(apellido, 40, 30 + (y * 30));
		app.text(cedula, 70, 30 + (y * 30));
		app.text(edad, 80, 30 + (y * 30));
		app.text(peso, 100, 30 + (y * 30));
	}

}
