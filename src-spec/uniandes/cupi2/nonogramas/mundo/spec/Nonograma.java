package uniandes.cupi2.nonogramas.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
@Mundo
public class Nonograma extends _Nonograma
{
	/**
	* <span style="font-size: 12.8px;">Constante que define la cantidad de filas del tablero.</span>
	*/
	public final static Integer NUMERO_FILAS = invalid;
	/**
	* <span style="font-size: 12.8px;">Constante que define la llave del properties.</span>
	*/
	public final static String LLAVE_PROPIEDADES = invalid;
	/**
	* <span style="font-size: 12.8px;">Constante que define la cantidad de columnas del tablero.</span>
	*/
	public final static Integer NUMERO_COLUMNAS = invalid;
	

	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private ArrayList<String> pistasIzquierda;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private ArrayList<String> pistasSuperior;
	

	/**
	* 
	*/
	private ArrayList tablero;
	
	

	/**
	* Método que retorna un String con la cantidad de casillas correctas por cada columna.
	*/
	public String darCantidadCorrectaColumna()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método de extensión 1.</span>
	*/
	public void metodo1()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método de extensión 2.</span>
	*/
	public void metodo2()
	{
	
	}
	
	
	
	/**
	* Método para presionar una casilla dadas sus coordenadas x,y.
	*/
	public int presionarCasilla(int x, int y)
	{
	
	}
	
	/**
	* Método que verifica la solución del nonograma y retorna True si es correcta o False si aún no ha sido resuelto.
	*/
	public Boolean verificarSolucionNonograma()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método que retorna un String con la cantidad de casillas correctas por cada fila.</span>
	*/
	public String darCantidadCorrectaFila()
	{
	
	}
	
	/**
	* Retorna el tablero actual.
	*/
	public Casilla[][] darTablero()
	{
	
	}
	
	
}
