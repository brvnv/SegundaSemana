package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 * 
 * Vari�veis usadas:
 * numeroPrimo - N�mero que ser� checado, e impresso, caso seja primo. Inicializa-se com 1.
 * primoDivisor - N�mero primo que ser� utilizado na checagem se numeroPrimo � de fato um n�mero primo. Inicializa-se com 2, e ao longo do c�digo ser� substituido pelos pr�ximos n�meros primos.
 */
public class Primo {
	public static void main(String[] args) {
		int primoDivisor=1;
	for (int numeroPrimo=1; numeroPrimo<=100; numeroPrimo++) {
//		if(numeroPrimo%primoDivisor!=0) {
			System.out.println(numeroPrimo/primoDivisor);
//			System.out.println(numeroPrimo%primoDivisor);
			System.out.println(numeroPrimo);
			primoDivisor=numeroPrimo;
//		}
	}
	}
}