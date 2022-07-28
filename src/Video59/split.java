package Video59;

public class split {

	public static void main(String[] args) {

		String s = "potato apple lemon orange";

		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		
		System.out.printf("String Original: %s\n", s);
		System.out.printf("\nValor de word1: %s", word1);
		System.out.printf("\nValor de word1: %s", word2);
		System.out.printf("\nValor de word1: %s", word3);
		System.out.printf("\nValor de word1: %s", word4);

	}

}
