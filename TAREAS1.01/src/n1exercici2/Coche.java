package n1exercici2;

public class Coche {
	private static final String marca;
	private static String modelo;
	private final int potencia;

	// atributos final y static se pueden inicializar usando el constructor, el
	// atributo final static (marca) no se puede
	public Coche(String modelo, int potencia) {
		Coche.modelo = modelo;
		this.potencia = potencia;
	}

	// Para la variable estática final se inicializa antes de que se complete la
	// carga de la clase.
	// se puede inicializar una variable estática final dentro de un bloque estático
	// porque el bloque estático se ejecuta antes del método main().
	static {
		marca = "Toyota";
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	// para cambiar valor del atributo static
	public static void setModelo(String modelo1) {
		modelo = modelo1;
	}

	// Metodo estatico que retorna un atributo estatico
	public static String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Coche [potencia: " + potencia + " modelo: " + modelo + " marca: " + marca + "]";
	}

	static String frenar() {
		return "El vehiculo esta frenando";
	}

	public String accelerar() {
		return "El vehiculo esta accelerando";
	}

}
