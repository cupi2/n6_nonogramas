package uniandes.cupi2.nonogramas.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.nonogramas.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "Nonograma")
public class InterfazNonograma extends _InterfazNonograma
{

	/**
	* <span style="font-size: 12.8px;">Constante que tiene como valor la ubicación de la imagen casilla en rellena.</span>
	*/
	public final static String RUTA_IMAGEN_CASILLA_RELLENA = "data/imagenes/casilla_rellena.png";
	/**
	* Constante que tiene como valor la ubicación de la imagen casilla en blanco.
	*/
	public final static String RUTA_IMAGEN_CASILLA_BLANCO = "data/imagenes/casilla_blanco.png";
	

	/**
	* Archivo de propiedades con la configuración del tablero cargado
	*/
	private Properties configuracionJuego; 	
	
	/**
	* Clase principal del mundo.
	*/
	private Mundo_Nonograma nonograma; 	
	
	/**
	* <span style="font-size: 12.8px;">Constante que tiene como valor la ubicación de la imagen casilla en rellena.</span>
	*/
	private String RUTA_IMAGEN_CASILLA_RELLENA="data/imagenes/casilla_rellena.png"; 	
	
	/**
	* Constante que tiene como valor la ubicación de la imagen casilla en blanco.
	*/
	private String RUTA_IMAGEN_CASILLA_BLANCO="data/imagenes/casilla_blanco.png"; 	
	
	

	/**
	* 
	*/
	private PanelExtension panelExtension;
	
	/**
	* 
	*/
	private PanelTablero panelTablero;
	
	/**
	* 
	*/
	private Nonograma mundo_Nonogramas;
	
	/**
	* 
	*/
	private PanelImagen panelImagen;
	
	/**
	* 
	*/
	private PanelSuperiorPistas panelSuperiorPistas;
	
	/**
	* 
	*/
	private PanelIzquierdoPistas panelIzquierdoPistas;
	
	

	/**
	* 
	*/
	public InterfazNonograma()
	 {

	 }


	/**
	* 
	*/
	public void reiniciarJuego()
	{
	
	}
	
	/**
	* 
	*/
	public void presionarCasilla()
	{
	
	}
	
	
	/**
	* <span style="font-size: 12.8px;">Método que retorna un String con la cantidad de casillas correctas por cada columna.</span>
	*/
	public String calcularCorrectasColumna()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método para presionar una casilla dadas sus coordenadas x,y.</span>
	*/
	public int presionarCasilla(int x, int y)
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Método que retorna un String con la cantidad de casillas correctas por cada fila.</span>
	*/
	public String calcularCorrectasFila()
	{
	
	}
	
	/**
	* Método&nbsp;
	*/
	public void cargarJuego()
	{
	
	}
	
	



    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = mundo_Nonogramas.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = mundo_Nonogramas.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
    * Este método ejecuta la aplicación, creando una nueva interfaz.
    * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
    */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazNonograma interfaz = new InterfazNonograma( );
        interfaz.setVisible( true );
    }
}
