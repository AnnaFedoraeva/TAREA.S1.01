package n1exercici1;

public class DeCuerda extends Instrumento {
	

	public DeCuerda(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	static {
		System.out.println("Bloque static de la clase DeCuerda ");

	}
	{
		System.out.println("Bloque de inicio de la clase DeCuerda");
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de cuerda";
	}

}
