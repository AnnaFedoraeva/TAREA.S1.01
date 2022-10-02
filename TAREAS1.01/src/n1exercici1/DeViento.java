package n1exercici1;

public class DeViento extends Instrumento {
	

	public DeViento(String nombre, float precio) {
		super(nombre, precio);

	}

	{
		System.out.println("Bloque de inicio de la clase DeViento");
	}

	static {
		System.out.println("Bloque estático de la clase DeViento ");

	}
	
	

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de viento";
	}

}
