package decreacion.singleton.src;

public class Singleton {
	private static Singleton singleton = null;
	private String nombre;

	private Singleton(String nombre) {
		this.nombre = nombre;
		System.out.println("Creando el objeto " + nombre);
	}

	public static Singleton getInstance(String nombre) {
		if (singleton == null) {
			System.out.println("Generando un nuevo singleton");
			singleton = new Singleton(nombre);
		} else {
			System.out.println("Retornando el singleton");
		}
		return singleton;
	}

	@Override
	public String toString() {
		return "Objeto " + nombre + ": " + super.toString();
	}
}