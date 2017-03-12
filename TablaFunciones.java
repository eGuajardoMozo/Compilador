/*
	MAGU Tabla de variables
	Adrián Martínez A01280252
	Estefanía Guajardo A00813202
*/

import java.util.Hashtable;
import java.lang.String;

class TablaFunciones extends TablaVariables
{
	  
	public static Hashtable tablafunc1 = new Hashtable(); 	//Tabla que almacenara las funciones
	public static Hashtable tablafunc2 = new Hashtable();	//Tabla que almacenara los parametros
	public static TablaVariables tabla = new TablaVariables()	;
	  
	// Agregar a la tabla de funciones de un parametro el nombre de la funcion, o sobreescribir su valor si ya estaba en la tabla
	public static void asignarFuncionUnParametro(Token id, Token param) {	
		Hashtable variables = tabla.getTable(); 
		tablafunc1.put(id.image, tablafunc2);
		tablafunc2.put(param, variables.get(param.image));
		System.out.println("Se guardo funcion: " + id.image + " con el parametro " + param.image);
	}
	
	// Agregar a la tabla de funciones de un parametro el nombre de la funcion, o sobreescribir su valor si ya estaba en la tabla
	public static void asignarFuncionCeroParametros(Token id) {	 
		tablafunc1.put(id.image, 0);
		System.out.println("Se guardo funcion: " + id.image + " sin parametros ");
	}
	
 }
  
  