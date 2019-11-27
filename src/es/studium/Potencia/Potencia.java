package es.studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args)
	{
		 int base, exp, i,resultado;
		 //Creamos el objeto que nos permite leer por teclado
		
		 Scanner teclado = new Scanner(System.in);
		 resultado=1;
		 System.out.println("Dame la base:");
		 base= teclado.nextInt();


		 System.out.println("Dame el exponente :");
		 exp= teclado.nextInt();
		 for(i=1;i<=exp; i++)
{resultado=resultado*base;
}

System.out.println("El resultado es: "+ resultado);
teclado.close();

		
	}}