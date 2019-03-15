
public class Fechas {
	

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
				System.out.println("--------------MENU FECHAS-----------");
				System.out.println("0. Salir al menu principal");
				System.out.println("1. Calcular dias restantes");
				System.out.println("2. Anterior fecha valida");
				System.out.println("3. Calcular semana del anno");
		}



/* Estudio interfaz:
 * Necesidades: un año, pasado por valor
 * Devoluciones: un boolean, pasado asociado al nombre
 * Necesidades/Devoluciones: --
 * Requisitos: --
 * 
 * Interfaz:
 * Prototipo: boolean esBisiesto(int anno)
 * Comentario: subprograma que indica si un año es bisiesto o no
 * Formula: un año es bisiesto si es divisible entre 400 o bien es divisible entre 4 pero no entre 100. el año debe ser superior o igual a 1582
 * Precondiciones: 
 * Entrada: entero año
 * Salida: boolean 
 * Entrada/Salida: --
 * Postcondiciones: asociado al nombre se devuelve un boolean como true si el año es bisiesto y como false si no lo es 
 * */
	public static boolean esBisiesto(int anno){
		boolean bisiesto=false;
		
		if ( anno >= 1582 && (anno % 400 ==0 || (anno %4 == 0 && anno %100 != 0) )) {
			bisiesto=true;
			}
	
		
		return bisiesto;
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
	boolean fechaValida=false;
	
	if (dia>= 1 && dia<=31 && (mes >= 1 || mes <= 12) && anno >= 1582 ){
		
		/* Meses con 31: 1,3,5,7,8,10,12
		 * Meses con 30: 4,6,9,11
		 * Meses con 28 o 29: 2
		 * */
		switch (mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				fechaValida=true;			
				break;
			case 2:
				if (dia <= 28  || ( dia==29 && esBisiesto(anno) ) ) {
					fechaValida=true;
				}
			
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia <=30){
					fechaValida=true;
					}
				break;
			
			
			}
		
		
		
		}
	
	
	return fechaValida;
	
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
	public static int calcularDiasQueFaltan (int proxDia, int proxMes, int anyo){
		

	
	
		int contador;
		
		for (contador=0; (proxDia < 31 || proxMes < 12  );contador++){
			switch (proxMes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (proxDia == 31){
					proxDia=1;
					proxMes++;	
						
				} else {
					proxDia++;
					}			
				break;
			case 2:
				if (proxDia <= 28  || (proxDia==29 && esBisiesto(anyo)) ) {
					proxDia=1;
					proxMes++;
				}else {
					proxDia++;
					}
			
				break;
			case 4:
			case 6:
			case 9:
			case 11:
			if (proxDia == 30){
					proxDia=1;
					proxMes++;		
				} else {
					proxDia++;
					}
				break;
			
			
				} //cierra el switch
		} //cierra el for
		
		return contador;
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
		int prevDay, prevMonth, prevYear;
		prevDay=day;
		prevMonth=month;
		prevYear=year;
		
		/* Meses que si es dia 1, pasan a un mes con 31 dias: 1, 2, 4, 6, 8,9,11
		 * Meses que si es dia 1, pasan a un mes con 30 dias: 5, 7, 10,12
		 * Meses que si es dia 1, pasan a un mes con 28 o 29 dias: 3
		 * */
		
		switch (month){
			case 1:
			case 2:
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:
				/*Meses que si es 1 y le restas uno, pasan al dia 31*/	
				if (day == 1 && month == 1){
					prevDay=31;
					prevMonth=12;
					prevYear--;
				}else if (day == 1 ){
					prevDay=31;
					prevMonth--;

						
				} else {
					prevDay--;
					}
					
				break;
			case 3:
			/*Mes que si es dia 1 y le restas uno, pasa al dia 28 o 29*/
			if (day == 1 && esBisiesto(year)){
				prevDay=29;
				prevMonth--;
			}else if (day == 1 & !esBisiesto(year)){
				prevDay=28;
				prevMonth--;
			}else {
				prevDay--;
				}
			
				break;
			case 5:
			case 7:
			case 10:
			case 12:
			/*Meses que si es dia 1 y le restas uno, pasan al dia 30*/
			
				if (day == 1){
					prevDay=30;
					prevMonth--;
				} else {
					prevDay--;
					}
				break;
			
			
			}
			
			if (prevYear < 1582) {
				System.out.println("Te has ido demasiado atras, el anno no puede ser menor a 1582");
			}else {
					
			System.out.println("Fecha original: "+day+"/"+month+"/"+year);
			System.out.println("Fecha con un dia menos: "+prevDay+"/"+prevMonth+"/"+prevYear);
			}
		
		
		
		
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



}

