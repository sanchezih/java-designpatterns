/*
 * Created on 28/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class CocaCola extends BebidaDeColaAbstracta {

	public CocaCola() {
		setNombre("ColaCola");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
