package tarea2;

import java.nio.charset.Charset;
import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.contraseña = "";
		this.longitud = 8;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		byte[] array = new byte[longitud];
	    new Random().nextBytes(array);
	    this.contraseña = new String(array, Charset.forName("UTF-8"));
	}
}
