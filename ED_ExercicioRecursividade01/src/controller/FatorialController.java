package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int fatorial(int n) {

		// Condi��o de parada n = 1
		// Enquanto o n for > que 1, o c�lculo ser� executado 
		if (n == 1) {
			// Quando chegar a n = 1, retornar� o valor 1 
			return 1;
		} else {
			// O resultado ficar� armazenado na fun��o fatorial e depois ser� decrementado em 1
			return n * fatorial(n - 1);
		}

	}
}
