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

	public Persona(PApplet app, String nombre, String apellido, int cedula, int edad, int peso, int r, int g, int b,
			int y) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
		this.y = y;
	}

	public void pintar(PApplet app) {
		app.fill(r, g, b);
		app.textSize(17);
		app.textAlign(PConstants.CENTER, PConstants.CENTER);
		app.text("Nombre: " + nombre + " // Apellido: " + apellido + " // CC: " + cedula + " // Edad: " + edad
				+ " // Peso: " + peso, 50, y);
	}

	public int compareTo(Persona p) {
		if (this.apellido.equals(p.getApellido())) {
			return 0;
		}
		return this.apellido.compareTo(p.getApellido());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
