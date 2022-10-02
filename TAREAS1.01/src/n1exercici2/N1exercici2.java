package n1exercici2;

public class N1exercici2 {

	public static void main(String[] args) {
		
		// el metodo static se puede llamar sin instanciar un objeto
		String frenar = Coche.frenar();
		System.out.println("Metodo Static. Llamamos al metodo sin instanciar un objeto:");
		System.out.println(frenar);
		// el valor del atributo final static (marca) no se puede modificar
		// podemos acceder al atributo static sin instancia un objeto
		System.out.println(
				"Atributo Final Static. El valor del atributo Marca no se puede modificar y podemos acceder a el sin instancia un objeto:");
		System.out.println(Coche.getMarca());

		// el metodo NO static solo se puede llamar despues instanciar un objeto
		System.out.println("Metodo NO Static. Solo se puede llamar despues de instanciar un objeto:");
		Coche coche1 = new Coche("Corolla", 128);
		Coche coche2 = new Coche("Corolla", 133);
		System.out.println(coche1.toString() + " " + coche2.toString());
		System.out.println(coche1.accelerar());

		// Podemos acceder al atributo static mediante el nombre de la clase
		System.out.println("Atributo Static. Llamamos mediante el nombre de la clase:");
		System.out.println(Coche.getModelo());

		// al atributo static (modelo) podemos cambiar el valor mediante el metodo static
		Coche.setModelo("Yaris");
		// al modificar el valor de atributo static, el valor nuevo se aplica para todos
		// objetos de la clase Coche
		System.out.println("Atributo Static. El nuevo valor aplica a todos los objetos de la clase: ");
		System.out.println("Coche1. Modelo: " + coche1.toString());
		System.out.println("Coche2. Modelo: " + coche2.toString());

		// el valor del atributo final (potencia) no admitirá cambios después de su declaración y asignación de valor.
		System.out.println("Atributo Final. El valor no se puede cambiar: ");
		System.out.println("Coche1. Potencia: " + coche1.getPotencia());
		System.out.println("Coche2. Potencia: " + coche2.getPotencia());
		System.out.println(coche1.toString() + " " + coche2.toString());
	}

}
