package etac;

public class exa2 {
	//En un arreglo, mostrar los datos de un usuario ( nombre, edad y sexo).
	public static void main(String[]args){ 
		String nombres []={"edgar", "alejandra","efren","alondra"};
		 int edad []={18,24,19,30}; 
		char sexo []={'M','F','M','F'};
		 System.out.println("		los datos de cada persona es..."); System.out.println("			NOMBRES EDAD SEXO");
		 for (int u=0;u<nombres.length;u++){
		 System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]); 
		} 
		}
}
