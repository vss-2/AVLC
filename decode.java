		Scanner in = new Scanner(System.in);
		System.out.println("informe a frase a ser decodificada"); 
		String frase = in.nextLine();
		System.out.println("informe o tamanho da matriz");
		int tamatrizd = in.nextInt();
		System.out.println("Informe a Matriz");

		int m = tamatrizd;
		int n = m;
		double matriz[][] = new double[m][n];

		for (int a = 0; a < m; a++) {
			for (int b = 0; b < n; b++) {
				matriz[a][b] = in.nextInt();
			}
		}
		int contde=0;
		if (tamatrizd == 3) {
			while (contde < frase.length() / tamatrizd) {
				double[][] letters = new double[1][tamatrizd];

				letters[1][0] = frase.charAt(0 + contde * 3) - 96;
				letters[1][1] = frase.charAt(1 + contde * 3) - 96;
				letters[1][2] = frase.charAt(2 + contde * 3) - 96;
				contde++;


				Matrix A = new Matrix(matriz);
				Matrix b = new Matrix(letters);
				Matrix x = A.solve(b);
				double z = x.get(0,0);
				double y = x.get(1, 0);
				double w = x.get(2,0);
				if (z >= 26) {

					z = z % 26;
				}
				if (y >= 26) {

					y = y % 26;
				}
				if (w >= 26) {

					w = w % 26;
				}

				char chara3 = (char) (z + 96);
				char charb3 = (char) (y + 96);
				char charc3 = (char) (w + 96);

				if (z != 0) {
					System.out.print(chara3);
				} else if (z == 0) {
					System.out.print("z");
				}

				if (y != 0) {
					System.out.print(charb3);
				} else if (y == 0) {
					System.out.print("z");
				}

				if (w != 0) {
					System.out.print(charc3);
				} else if (w == 0) {
					System.out.print("z");
				}
				contde++;
			}

		}
		if (tamatrizd == 2) {
			while (contde < frase.length() / tamatrizd) {
				double[][] letters = new double[tamatrizd][1];

				letters[0][0] = frase.charAt(0 + contde * 2) - 96;
				letters[1][0] = frase.charAt(1 + contde * 2) - 96;

				Matrix A = new Matrix(matriz);
				Matrix b = new Matrix(letters);
				Matrix x = A.solve(b);
				double z = x.get(0,0);
				double y = x.get(1,0);

			
				if (z>0){
					
					z = z % 26;
				
				} else {
					
					while (z<0){
						z += 26;
					}
					
				}

				if (y > 0){
					y = y % 26;
				} else {
					while (y<0){
						y += 26;
					}
				}
					
					
					
				char chara3 = (char) (z + 96);
				char charb3 = (char) (y + 96);

				if (z != 0) {
					System.out.print(chara3);
				} else if (z == 0) {
					System.out.print("z");
				}
				if (y != 0) {
					System.out.print(charb3);
				} else if (y == 0) {
					System.out.print("z");
				}
				contde++;
			}

		}


	}

}
