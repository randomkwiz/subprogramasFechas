/*Resguardo*/


public class Resguardo {
	

/* Estudio interfaz:
 * Necesidades: -- 
 * Devoluciones: --
 * Necesidades/Devoluciones: --
 * Requisitos: --
 * 
 * Interfaz:
 * Prototipo: void mostrarSubMenuFechas ()
 * Comentario: pinta el menu de operaciones con fechas en pantalla
 * Precondiciones: --
 * Entrada: --
 * Salida: --
 * Entrada/Salida: --
 * Postcondiciones: nada, pinta en pantalla el menu de fechas
 * */
	public static void mostrarSubMenuFechas (){
		System.out.println("MENU OPERACIONES CON FECHAS EN RESGUARDO");
		}

/* Estudio interfaz:
 * Necesidades: -- 
 * Devoluciones: --
 * Necesidades/Devoluciones: --
 * Requisitos: --
 * 
 * Interfaz:
 * Prototipo: void mostrarSubMenuFigurasGeometricas ()
 * Comentario: pinta el menu de pintar figuras geometricas en pantalla
 * Precondiciones: --
 * Entrada: --
 * Salida: --
 * Entrada/Salida: --
 * Postcondiciones: nada, pinta en pantalla el menu de pintar figuras geometricas
 * */
	public static void mostrarSubMenuFigurasGeometricas (){
		System.out.println("MENU PINTAR FIGURAS GEOMETRICAS EN RESGUARDO");
		}




//Plantilla
/* Estudio interfaz:
 * Necesidades: 
 * Devoluciones: --
 * Necesidades/Devoluciones: --
 * Requisitos: --
 * 
 * Interfaz:
 * Prototipo: 
 * Comentario: 
 * Precondiciones: --
 * Entrada: --
 * Salida: --
 * Entrada/Salida: --
 * Postcondiciones: 
 * */


/* Estudio interfaz:
 * Necesidades: un año, pasado por valor
 * Devoluciones: un boolean, pasado asociado al nombre
 * Necesidades/Devoluciones: --
 * Requisitos: --
 * 
 * Interfaz:
 * Prototipo: boolean esBisiesto(int anno)
 * Comentario: subprograma que indica si un año es bisiesto o no
 * Formula: un año es bisiesto si es divisible entre 400 o bien es divisible entre 4 pero no entre 100. Ademas debe ser superior o igual a 1582
 * Precondiciones: --
 * Entrada: entero año
 * Salida: boolean 
 * Entrada/Salida: --
 * Postcondiciones: asociado al nombre se devuelve un boolean como true si el año es bisiesto y como false si no lo es 
 * */
	public static boolean esBisiesto(int anno){
		System.out.println("EN RESGUARDO ANNO BISIESTO");
		
		return false;
		}


/* Estudio interfaz:
 * Necesidades: fecha en formato dia, mes y año. Parámetros pasados por valor
 * Devoluciones: booleano que dira si la fecha es valida o no, parámetro devuelto asociado al nombre
 * Necesidades/Devoluciones: 
 * Requisitos: 
 * 
 * Interfaz:
 * Prototipo: boolean fechaEsValida (int dia, int mes, int anno)
 * Comentario: subprograma que indica si una fecha dada es valida o no
 * Precondiciones: 
 * Entrada: entero dia, entero mes, entero anno
 * Salida: boolean 
 * Entrada/Salida: --
 * Postcondiciones: asociado al nombre se devolverá un boolean que tendrá el valor true si la fecha es valida y false si no lo es
 * */
 
public static boolean fechaEsValida (int dia, int mes, int anno){
	System.out.println("EN RESGUARDO FECHA VALIDA");
	return false;
	
	}

/* Estudio interfaz:
 * Necesidades: una fecha en formato dia, mes y año. Parametros pasados por valor
 * Devoluciones: dias que faltan para el 31 de diciembre de ese año. Parametro pasado asociado al nombre
 * Necesidades/Devoluciones: --
 * Requisitos: la fecha de entrada debe ser valida
 * 
 * Interfaz:
 * Prototipo: int calcularDiasQueFaltan (int dia, int mes, int anyo)
 * Comentario: calcula los dias que faltan para el 31 de diciembre de ese año
 * Precondiciones: la fecha es valida
 * Entrada: una fecha en formato dia, mes y año
 * Salida: entero dias
 * Entrada/Salida: --
 * Postcondiciones: asociado al nombre se devuelve la cantidad de dias que faltan para el 31 de diciembre de ese año
 * */
	public static int calcularDiasQueFaltan (int dia, int mes, int anyo){
		System.out.println("EN RESGUARDO DIAS QUE FALTAN");
		return 0;
		}



/* Estudio interfaz:
 * Necesidades: una fecha en formato dia, mes y año. Parametros pasados por valor
 * Devoluciones:  --
 * Necesidades/Devoluciones: otra fecha en formato dia, mes y año. Parametros pasados por referencia.
 * Requisitos: la fecha de entrada debe ser valida
 * 
 * Interfaz INTERMEDIA:
 * Prototipo: void calcularAnteriorFechaValida (int day, int month, int year, ref int prevDay, ref int prevMonth, ref int prevYear )
 * Comentario: calcular la fecha valida anterior (resta un dia a la fecha de entrada)
 * Precondiciones: la fecha es valida
 * Entrada: una fecha en formato dia, mes y año
 * Salida: 
 * Entrada/Salida: otra fecha en formato dia, mes y año
 * Postcondiciones: por referencia se devuelve la fecha inmediatamente anterior a la fecha de entrada
 * 
 * Interfaz JAVA:
 * Prototipo: void calcularAnteriorFechaValida (int day, int month, int year)
 * Comentario: calcular la fecha valida anterior (resta un dia a la fecha de entrada) y MOSTRARLA EN PANTALLA
 * Precondiciones: la fecha es valida
 * Entrada: una fecha en formato dia, mes y año
 * Salida: nada porque pintara en pantalla la fecha
 * Entrada/Salida: --
 * Postcondiciones: pintara en pantalla la fecha resultante
 * */
	public static void calcularAnteriorFechaValida (int day, int month, int year){
		System.out.println("EN RESGUARDO FECHA ANTERIOR");
		
		}



/* Estudio interfaz:
 * Necesidades: una fecha en formato dia, mes y año. Parametros pasados por valor
 * Devoluciones: numero de la semana del año. Parametro devuelto asociado al nombre
 * Necesidades/Devoluciones: --
 * Requisitos: la fecha de entrada debe ser valida
 * 
 * Interfaz:
 * Prototipo: int calcularSemanaAnno (int dia, int mes, int anyo)
 * Comentario: calcula la semana del año que es
 * Precondiciones: la fecha es valida
 * Entrada: una fecha en formato dia, mes y año
 * Salida: entero semana del año
 * Entrada/Salida: --
 * Postcondiciones: asociado al nombre se devuelve la semana del año que es
 * */
	public static int calcularSemanaAnno (int dia, int mes, int anyo){
		System.out.println("EN RESGUARDO SEMANA DEL ANNO");
		return 0;
		}








/* Estudio interfaz:
 * Necesidades: un caracter y un numero de niveles (minimo 2, maximo 9)que son parámetros pasados por valor
 * Devoluciones: nada, pinta en pantalla
 * Necesidades/Devoluciones: 
 * Requisitos: El caracter puede ser cualquiera pero para pintarlo debera ser imprimible
 * 
 * Interfaz:
 * Prototipo: void mostrarPiramide (char caracter, int niveles)
 * Comentario: pinta una piramide con un numero determinado de niveles y caracteres
 * Precondiciones: 
 * Entrada: un caracter y un numero 
 * Salida: nada, pinta en pantalla
 * Entrada/Salida: 
 * Postcondiciones: se pintara en pantalla la piramide 
 * */
	public static void mostrarPiramide (char caracter, int niveles){
		
		System.out.println("EN RESGUARDO PINTAR PIRAMIDE");
		}


}

