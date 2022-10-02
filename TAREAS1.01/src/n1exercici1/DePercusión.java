package n1exercici1;

public class DePercusión extends Instrumento{
	private static int contador = 1;
	public DePercusión(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	static {
		System.out.println("Bloque estático de la clase DePercusión");

	}
	{
		System.out.println("Bloque de inicio de la clase DePercusión");
	}
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		DePercusión.contador = contador;
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de percusión";
	}

}
