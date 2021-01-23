package etac;
import java.util.*; 
public class exa5 {
	//Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por letra y la suma de sus caracteres.
	public static void main(String[] args) {
		  Scanner dato=new Scanner(System.in);
		 int c=0; 
		 System.out.println("escribe una palabra:");
		 String palabra=dato.nextLine();
		  char caracter[]=new char[palabra.length()];
		  
		 for(int i=0;i<palabra.length();i++){            
		 c=c+1;             
		caracter[i]=palabra.charAt(i);             
		System.out.println(caracter[i]);           
		 } 
		System.out.println("la cantidad de caracteres es : "+c);
		 } 
		
}
