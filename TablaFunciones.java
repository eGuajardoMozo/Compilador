/*
	MAGU Tabla de variables
	Adrián Martínez A01280252
	Estefanía Guajardo A00813202
*/

import java.util.Hashtable;
import java.lang.String;

class TablaFunciones
{
	  
	public static Hashtable tabla = new Hashtable(); 	//Tabla que almacenara las funciones
	public static Hashtable tabla2 = new Hashtable();	//Tabla que almacenara los parametros
	  
	// Agregar a la tabla de funciones el nombre de la funcion, o sobreescribir su valor si ya estaba en la tabla
	public static void asignarValor(Token id, int param) {	
		tabla.put(id.image, tabla2);
		tabla2.put(param, getValor(param));
		System.out.println("Funcion: " + id.image + " con parametros " + getValor(param));
	}

	// Obtener el valor de una variable
	public static int getValor(int id){
		return (Integer)tabla2.get(id);
	}

	
 }
  
  