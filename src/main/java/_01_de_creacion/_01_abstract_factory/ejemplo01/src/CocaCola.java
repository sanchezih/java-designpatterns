package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class CocaCola extends BebidaDeCola {

	public CocaCola() {
		setNombre("ColaCola");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
