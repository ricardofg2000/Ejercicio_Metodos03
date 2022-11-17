package unico;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que calcule y muestre el área o el volumen de un
		 * cilindro, según se especifique. Para distinguir un caso de otro se le pasará
		 * un número 1 (para área) o 2 (para volumen). Además, hemos de pasarle al
		 * método el radio de la base y la altura.
		 * 
		 * Área total: 2 PI r (h+r)
		 * 
		 * Volumen: PI r^2 h
		 */
		int opc;
		double radio;
		double altura;
		String unidad;

		Util.escribir("Programa para calcular área o volumen de un cilindro");
		Util.escribir("");

		unidad = Util.leerString("Unidades de los valores(ejemplo→cm): ");
		radio = Util.leerDouble("Introduzca el valor del radio: ");
		altura = Util.leerDouble("Introduzca el valor de la altura: ");

		Util.escribir("Especifique la operación que quiere realizar: ");
		Util.escribir("1-Calcular el area");
		Util.escribir("2-Calcular el volumen");
		opc = Util.leerInt("");

		switch (opc) {
		case 1:
			CalArea(radio, altura, unidad);
			break;
		case 2:
			CalVol(radio, altura, unidad);
			break;

		}

	}

	static void CalVol(double r, double h) {
		final double PI = 3.1416;
		double vol;

		vol = PI * r * r * h;
		Util.escribir("El valor del volumen es " + vol);
	}

	static void CalVol(double r, double h, String unid) {
		final double PI = 3.1416;
		double vol;

		vol = PI * r * r * h;
		Util.escribir("El valor del volumen es " + vol + " " + unid + " al cubo");
	}

	static void CalArea(double r, double h) {
		final double PI = 3.1416;
		double area;

		area = 2 * PI * r * (h + r);
		Util.escribir("El valor del área es " + area);
	}

	static void CalArea(double r, double h, String unid) {
		final double PI = 3.1416;
		double area;

		area = 2 * PI * r * (h + r);
		Util.escribir("El valor del área es " + area + " " + unid + " cuadrados");
	}

}
