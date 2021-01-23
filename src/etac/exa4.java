package etac;
import java.util.*; 
public class exa4 {
	public static void main(String[] args) { 
		//Ingresar por teclado 10 números en un arreglo y mostrar el numero mayor y el numero menor.
		Scanner Scanner = new Scanner(System.in);
		 int mayor = 0; int menor = 0;
		 int[] numero = new int[11]; 
		for (int i = 0+1; i < 11; i++) {
		 System.out.print("digite el número " + (i) + " a evaluar :"); numero[i] = Scanner.nextInt(); 
		} 
		for (int i = 1; i < numero.length; i++) {
		 if (mayor < numero[i]) { 
		mayor = numero[i];
		 } } menor = mayor; 
		for (int i = 1; i < numero.length; i++) {
		if (menor > numero[i]) {
		 menor = numero[i]; 
		} 
		}
		 System.out.println(" el numero mayor es " + mayor + " el numero menor es :" + menor);
	 }
}