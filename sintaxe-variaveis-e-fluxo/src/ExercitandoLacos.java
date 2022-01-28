
public class ExercitandoLacos {

	public static void main(String[] args) {

		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna ++) {
				if (coluna > linha) {
					break;
				}
				System.out.println(coluna);
			}
			
			System.out.println();
		}
		
	}

}
