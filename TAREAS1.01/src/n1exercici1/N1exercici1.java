package n1exercici1;

public class N1exercici1 {

	public static void main(String[] args) {
		System.out.println("Bloques estáticos se ejecutan una sola vez cuando la clase se carga por primera vez");
		System.out.println("llamando un atributo static (contador): " + DePercusión.getContador());
		
		System.out.println("o creando una instancia:");
		System.out.println("Bloques de inicialización se ejecutan cada vez que se crea una instancia");
		DeViento Tuba = new DeViento("Tuba", 2000);
		DeViento Flauta = new DeViento("Flauta", 1000);
		DeCuerda Guitarra = new DeCuerda("Guitarra", 1500);

		System.out.println("Tuba" + Tuba + " " + Tuba.tocar());
		System.out.println("Flauta" + Flauta + " " + Flauta.tocar());
		System.out.println("Guitarra" + Guitarra + " " + Guitarra.tocar());

	}

}
