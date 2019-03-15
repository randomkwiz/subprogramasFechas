/*Programa principal*/
/* Alumna: Angela Vazquez Dominguez
 * 
 * 
 * PSEUDOCODIGO 
 * ---FECHAS---
 * modulo: calcularDiasRestantes
 * inicio
 * 	pedirValidarFecha
 * 	calcularDiasQueFaltan*
 * 	mostrarDiasQueFaltan

 * 
 * fin

 * modulo: anteriorFechaValida
 * inicio
 * 	pedirValidarFecha
 * 	calcularAnteriorFechaValida*
 * 	mostrarAnteriorFechaValida

 * 
 * fin
 * 

 * modulo: calcularSemanaAnno
 * inicio
 * 	pedirValidarFecha
 * 	calcularSemanaAnno*
 * 	mostrarSemanaAnno
 * 
 * fin
 * 
 * ------PSEUDOCODIGO PINTAR FIGURAS -----
 * 
 * modulo: pintarPiramide
 * inicio
 * 	pedirCaracter
 * 	pedirNiveles
 * 	mostrarPiramide*
 * fin

 * modulo: pintarPrisma
 * EN CONSTRUCCION
 * 
 * 
 * 
 * */
 import java.util.Scanner;
public class ExamenMenuSubprogramas {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion, opcionFechas, opcionFiguras;
		int dia, mes, anno;
		char caracterPiramide;
		int nivelPiramide;
		
		
		do{
			//mostrarMenuPedirValidarOpcion
			do{
				System.out.println("--------------MENU-----------");
				System.out.println("0. Salir");
				System.out.println("1. Operaciones con fechas");
				System.out.println("2. Pintar figuras");
				opcion=entrada.nextInt();
				}while(opcion < 0 || opcion>2);
			if (opcion != 0){
				switch (opcion){
					case 1: 
					//operacionesFechas
					
					//mostrarMenuFechasPedirValidarOpcion
					do{
						//Resguardo.mostrarSubMenuFechas();
						Fechas.mostrarSubMenuFechas();
						opcionFechas = entrada.nextInt();
						}while(opcionFechas <0 || opcionFechas >3);
					if(opcionFechas != 0 ){
						switch(opcionFechas){
							case 1:
							//calcularDiasRestantes
							int diasRestantes;
							 //	pedirValidarFecha
							 do{
								 System.out.println("INTRODUCE UNA FECHA (SE VALIDARA)");
								 System.out.print("Dia: ");
								 dia=entrada.nextInt();
								 System.out.print("Mes: ");
								 mes=entrada.nextInt();
								 System.out.print("Anno: ");
								 anno=entrada.nextInt();
								 
								 //}while(Resguardo.fechaEsValida(dia,mes,anno));
							 }while(Fechas.fechaEsValida(dia,mes,anno) == false);
								//calcularDiasQueFaltan*
								/*diasRestantes=Resguardo.calcularDiasQueFaltan(dia,mes,anno);*/
								diasRestantes=Fechas.calcularDiasQueFaltan(dia,mes,anno);
							
							
							
							
							
							// 	mostrarDiasQueFaltan
							System.out.println("Dada la fecha "+dia+"/"+mes+"/"+anno+" faltan "+diasRestantes+" para el 31/12 de ese anno.");
								break;
							case 2:
							//anteriorFechaValida
							 //	pedirValidarFecha

							
							 do{
								 System.out.println("INTRODUCE UNA FECHA (SE VALIDARA)");
								 System.out.print("Dia: ");
								 dia=entrada.nextInt();
								 System.out.print("Mes: ");
								 mes=entrada.nextInt();
								 System.out.print("Anno: ");
								 anno=entrada.nextInt();
								 
								 //}while(Resguardo.fechaEsValida(dia,mes,anno));
							 }while(Fechas.fechaEsValida(dia,mes,anno) == false);
							 
							  //calcularAnteriorFechaValida*
							//mostrarAnteriorFechaValida
							//Resguardo.calcularAnteriorFechaValida(dia,mes,anno);
							Fechas.calcularAnteriorFechaValida(dia,mes,anno);
							
								break;
							case 3:
							//calcularSemanaAnno
							 //	pedirValidarFecha

							
							 do{
								 System.out.println("INTRODUCE UNA FECHA (SE VALIDARA)");
								 System.out.print("Dia: ");
								 dia=entrada.nextInt();
								 System.out.print("Mes: ");
								 mes=entrada.nextInt();
								 System.out.print("Anno: ");
								 anno=entrada.nextInt();
								 
								 //}while(Resguardo.fechaEsValida(dia,mes,anno));
							 }while(Fechas.fechaEsValida(dia,mes,anno) == false);
							 
							 Resguardo.calcularSemanaAnno(dia,mes,anno);
								break;
							}
						}
					
						break;
					case 2:
					//pintarFigurasGeometricas
					//mostrarMenuPintarFigurasPedirValidarOpcion
					do{
						//Resguardo.mostrarSubMenuFigurasGeometricas();
						Figuras.mostrarSubMenuFigurasGeometricas();
						opcionFiguras=entrada.nextInt();
						}while(opcionFiguras<0 || opcionFiguras >2);
					if(opcionFiguras != 0 ){
						switch(opcionFiguras){
							case 1:

							//pintarPiramide
							//pedirCaracter
							System.out.println("Introduce un caracter");
							caracterPiramide=entrada.next().charAt(0);
							//pedirValidarNiveles
							do{
							System.out.println("Introduce un nivel (2-9)");
							nivelPiramide=entrada.nextInt();
							}while(nivelPiramide < 2 || nivelPiramide >9);
							/*Resguardo.mostrarPiramide(caracterPiramide, nivelPiramide);*/
							Figuras.mostrarPiramide(caracterPiramide,nivelPiramide);
							
							
								break;
							case 2:
							//pintarPrisma
							System.out.println("MODULO PINTAR PRISMA EN CONSTRUCCION");
								break;
							}
						}						
						
						break;
					}
				
				}
			
			}while(opcion != 0);
		
		
	}
}

