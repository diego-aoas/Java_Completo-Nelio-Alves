/*
	a += b; 	== 		a = a + b;
	a -= b; 	== 		a = a - b;
	a *= b; 	== 		a = a * b;
	a /= b; 	==		a = a / b;
	a %= b;		==		a = a % b;
*/

package Video038;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeFuncaoAcumulativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com os minutos utilizados: ");
        int minutos = sc.nextInt();

        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();

    }

}
