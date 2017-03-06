import processing.core.PApplet;

public class Ejecutable extends PApplet {

	Logica log;

	public static void main(String[] args) {
		PApplet.main("Ejecutable");
	}

	public void settings() {
		size(1000, 500);
	}

	public void setup() {
		log = new Logica(this);
		colorMode(HSB, 100);
	}

	public void draw() {
		background(100);
		log.nuevo();
	}

	public void keyPressed() {
		log.teclas();
	}
}
