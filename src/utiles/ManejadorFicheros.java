package utiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JOptionPane;

/**
 * Clase para trabajar con distintos ficheros de texto
 *
 */
public class ManejadorFicheros {

	/// PROPIEDADES
	private BufferedReader bufferLectura;
	private BufferedWriter bufferEscritura;
	private File archivo;
	private Properties propiedades;
	private String rutaPropiedades;
	
	/// CONSTRUCTOR
	public ManejadorFicheros() {
		this.bufferLectura		= null;
		this.bufferEscritura 	= null;
		this.archivo 			= null;
		this.propiedades 	 	= new Properties();		
	}
	
	/// METODOS

	public static void main(String[] args)
    {
		int[][] tablero ={
        		{0,0,0,3,9,0,0,7,2},
        		{0,0,0,0,0,0,0,9,5},
        		{0,7,0,0,0,5,3,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,1,0,0,2,0,0},
        		{0,0,7,0,4,8,0,1,0},
        		{0,6,9,0,0,0,0,5,0},
        		{0,3,0,0,0,9,8,0,0},
        		{5,0,8,7,0,0,0,4,0},
        		};
    }
}