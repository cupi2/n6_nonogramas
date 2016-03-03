package uniandes.cupi2.nonogramas.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class Casilla extends _Casilla
{

	

	/**
	* Atributo que describe el estado actual de la casilla.
	*/
	@Atributo(genGet=true, genSet=true)
	private int estadoActual;
	/**
	* <span style="font-size: 12.8px;">Atributo que describe el estado solución de la casilla.</span>
	*/
	@Atributo(genGet=true, genSet=true)
	private int estadoSolucion;
	

	

	/**
	* 
	*/
	public void Casilla(int parameter)
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método que cambia el estado actual de la casilla.</span>
	*/
	public void cambiarEstadoActual()
	{
	
	}
	
	
}

