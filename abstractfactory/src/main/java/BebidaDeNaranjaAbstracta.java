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
public abstract class BebidaDeNaranjaAbstracta {
	private int cantidadDeNaranjas = 0;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeNaranjas() {
		return cantidadDeNaranjas;
	}

	public void setCantidadDeNaranjas(int cantidadDeNaranjas) {
		this.cantidadDeNaranjas = cantidadDeNaranjas;
	}

	public abstract void preparar();

}
