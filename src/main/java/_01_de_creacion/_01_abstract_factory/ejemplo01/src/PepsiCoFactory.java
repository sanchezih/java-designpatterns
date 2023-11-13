package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class PepsiCoFactory extends AbstractFactory {

	public BebidaDeCola crearBebidaDeCola() {
		return new Pepsi();
	}

	public BebidaDeNaranja crearBebidaDeNaranja() {
		return new Mirinda();
	}

}
