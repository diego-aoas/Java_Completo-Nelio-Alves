/*
	Sintaxe: (condição) ? valor_se_verdadeiro: valor_se_falso
*/

package Video40;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;

		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println("O desconto foi de R$ " + desconto);

	}

}
