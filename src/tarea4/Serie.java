package tarea4;

public class Serie {
	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.num_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String tit, String creador) {
		this.titulo = tit;
		this.num_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String tit, String creador, int num, String gen) {
		this.titulo = tit;
		this.num_temporadas = num;
		this.entregado = false;
		this.genero = gen;
		this.creador = creador;
	}
}
