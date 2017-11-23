import java.util.*;
import Jama.util.*;

public class YuriMartins {

	public static String mod(String s, int m) {

		if (s.length() % m == 0) {
		}

		if (s.length() % m != 0) {

			while (s.length() % m != 0) {
				s = s + s.charAt(s.length() - 1);
			}

		}

		return s;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Deseja codificar(1) ou descodificar(2)? ");
		String codec = in.next();

		if (codec.equals("1")) {
			in.nextLine();
			System.out.println("Informe a frase a ser codificada:");

			String lul = in.nextLine();
			String Trocar = lul.toLowerCase().replaceAll(" ", "");
			// System.out.println(Replacelul);
			System.out.println/* batata */("Declare o tamanho da matriz");

			int tamatriz = in.nextInt();
			int cont = 0;
			System.out.println("Informe a Matriz");

			int m = tamatriz;
			int n = m;
			double matriz[][] = new double[m][n];
			Trocar = mod(Trocar, tamatriz);
			for (int a = 0; a < m; a++) {
				for (int b = 0; b < n; b++) {
					matriz[a][b] = in.nextInt();
				}
			}
			
			
			double a, b, c;

			if (tamatriz == 3) {
				while (cont < Trocar.length() / tamatriz) {
					double[] letters = new double[tamatriz];

					letters[0] = Trocar.charAt(0 + cont * 3) - 96;
					letters[1] = Trocar.charAt(1 + cont * 3) - 96;
					letters[2] = Trocar.charAt(2 + cont * 3) - 96;
					cont++;

					a = matriz[0][0] * letters[0] + matriz[0][1] * letters[1]
							+ matriz[0][2] * letters[2];
					b = matriz[1][0] * letters[0] + matriz[1][1] * letters[1]
							+ matriz[1][2] * letters[2];
					c = matriz[2][0] * letters[0] + matriz[2][1] * letters[1]
							+ matriz[2][2] * letters[2];

					if (a >= 26) {

						a = a % 26;
					}
					if (b >= 26) {

						b = b % 26;
					}
					if (c >= 26) {

						c = c % 26;
					}

					char chara3 = (char) (a + 96);
					char charb3 = (char) (b + 96);
					char charc3 = (char) (c + 96);

					if (a != 0) {
						System.out.print(chara3);
					} else if (a == 0) {
						System.out.print("z");
					}

					if (b != 0) {
						System.out.print(charb3);
					} else if (b == 0) {
						System.out.print("z");
					}

					if (c != 0) {
						System.out.print(charc3);
					} else if (c == 0) {
						System.out.print("z");
					}
				}

			}

			if (tamatriz == 2) {
				while (cont < Trocar.length() / 2) {
					double[] letters = new double[tamatriz];

					letters[0] = Trocar.charAt(0 + cont * 2) - 96;
					letters[1] = Trocar.charAt(1 + cont * 2) - 96;

					cont++;
					/*
					 * System.out.println(matriz[0][0]+" "+matriz[0][1]);
					 * System.out.println(matriz[1][0]+" "+matriz[1][1]);
					 */
					a = matriz[0][0] * letters[0] + matriz[0][1] * letters[1];
					b = matriz[1][0] * letters[0] + matriz[1][1] * letters[1];

					if (a >= 26) {

						a = a % 26;
					}
					if (b >= 26) {

						b = b % 26;
					}

					char chara = (char) (a + 96);
					char charb = (char) (b + 96);

					if (a != 0) {
						System.out.print(chara);
					} else if (a == 0) {
						System.out.print("z");
					}

					if (b != 0) {
						System.out.print(charb);
					} else if (b == 0) {
						System.out.print("z");
					}

				}

			}

		} else {

			System.out.println("Informe a Matriz");

			System.out.println("Informe a frase a ser codificada:");

			String lul = in.nextLine();
			String Replacelul = lul.toLowerCase().replaceAll(" ", "");
			// System.out.println(Replacelul);
			System.out.println/* batata */("Declare o tamanho da matriz");

			int tamatriz = in.nextInt();
			int cont = 0;
			
			int m = tamatriz;
			int n = m;
			double matriz[][] = new double[m][n];
			Replacelul = mod(Replacelul, tamatriz);
			for (int a = 0; a < m; a++) {
				for (int b = 0; b < n; b++) {
					matriz[b][a] = in.nextInt();
				}
			}
			
		}
	}

}
