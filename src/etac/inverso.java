package etac;

import java.util.Scanner;

public class inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
        int num[] = new int[5];
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i]=numero.nextInt();            
        }
        System.out.println("Imprimiendo orden inverso.");
        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.println("Indice  " + i + " =" + num[i]);
        }
	}

}
