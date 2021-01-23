package etac;

public class exa3 {
	
	//Mostrar el promedio de notas de tres cursos 
	public static void main(String args[]) {
		 String materia []={"programacion", "base de datos","redes","Ingles"}; 
		int puntos []={10,7,8,9};
		 System.out.println("Promedio de cada materia");
		 System.out.println("materia");
		 int resultado=(puntos[0]+puntos[1]+puntos[2])/4;
		 for (int s=0;s<materia.length;s++){
		 System.out.println(materia[s] + " "+puntos[s]);  } System.out.println("Su Promedio es : " +resultado);
		  }
}
