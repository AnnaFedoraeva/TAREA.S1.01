package n1exercici1;

public class DePercusi�n extends Instrumento{
	private static int contador = 1;
	public DePercusi�n(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	static {
		System.out.println("Bloque est�tico de la clase DePercusi�n");

	}
	{
		System.out.println("Bloque de inicio de la clase DePercusi�n");
	}
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		DePercusi�n.contador = contador;
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Est� sonando un instrumento de percusi�n";
	}

}
