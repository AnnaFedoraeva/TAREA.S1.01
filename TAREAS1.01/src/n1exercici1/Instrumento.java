package n1exercici1;

public abstract class Instrumento {
	private String nombre;
	private float precio;
	
	
	public Instrumento(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", precio=" + precio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public abstract String tocar();
	
	
}


