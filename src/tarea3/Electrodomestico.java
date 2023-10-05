package tarea3;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumo;
	private double peso;
	
	private static String COLOR = "blanco";
	private static char CONSUMO = 'F';
	private static int PRECIO_BASE = 100;
	private static int PESO = 5;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double pre, double p) {
		this.precioBase = pre;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = p;
	}
	
	public Electrodomestico(double pre, double p, String color, char con) {
		this.precioBase = pre;
		this.peso = p;
		
		if (con == 'A' || con == 'B' || con == 'C' || con == 'D' ||con == 'E' || con == 'F')  {
            this.consumo = con;
        } else {
            System.out.println("Consumo no válido. Se establecerá F por defecto.");
            this.consumo = CONSUMO;
        }
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris"))  {
            this.color = color;
        } else {
            System.out.println("Color no válido. Se establecerá como blanco por defecto.");
            this.color = "blanco";
        }
	}
	
}
