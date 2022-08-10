package main;

public class Main {

	public static void main(String[] args) {
/////////////////////////////// IF //////////////////////////////////////////////////
		
		int numeroIf = 1337;
		
		if (numeroIf > 0) {
			System.out.println("numeroIf es positivo");
		} else if (numeroIf == 0) {
			System.out.println("numeroIf es 0");
		} else {
			System.out.println("numeroIf es negativo");
		}
		System.out.println("----------------------");
/////////////////////////////// WHILE ///////////////////////////////////////////////
		int numeroWhile = 0;		
		
		while(numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}
		System.out.println("----------------------");
////////////////////////////// DO WHILE /////////////////////////////////////////////
		// reutiliza numeroWhile de ejercicio anterior
		
		do {
			System.out.println(numeroWhile);
			numeroWhile++;
		}while(numeroWhile < 3);
		System.out.println("----------------------");
/////////////////////////////// FOR /////////////////////////////////////////////////
		int numeroFor = 0;

		for (int i = 3; i >= numeroFor ; numeroFor++) {
			System.out.println(numeroFor);
		}
/////////////////////////////// SWITCH //////////////////////////////////////////////
		String estacion = "InViErNo";
		
		switch (estacion.toLowerCase()) {
		case "verano": 
			System.out.println("Es verano");
			break;
		case "otoño": 
			System.out.println("Es otoño");
			break;
		case "invierno": 
			System.out.println("Es invierno");
			break;
		case "primavera": 
			System.out.println("Es primavera");
			break;
		
		default:
			System.out.println("Es invalido");
			break;
		}
		
	}

}
