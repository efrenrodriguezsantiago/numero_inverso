package etac;

import java.util.Scanner;

public class ejercicio2 {
	//HACER UN PROGRAMA (ProgArreg.cpp) EN java QUE PIDA EL PROCESO PARA N CALIFICACIONES Y LOS DATOS DESPLEGANDO AL FINAL SU PROMEDIO.
	
	public static void main(String[]arg) {
	
		Scanner r = new Scanner (System.in);
		System.out.println("ingresa la canitidad de nota por promedio");
		float notas = 0;
		float cn = r.nextFloat();//es la cantidad de notas
		float acumu=0;
		
		
		while(acumu <= cn) {
			System.out.println("ingresa la calificacion "+acumu);
			float n=r.nextFloat();
			notas+=n;
		cn++;	
		}
		
		float promedio = notas /cn;
		System.out.println("el promedio es: "+promedio);
		
		
		
	}
	
	
}
