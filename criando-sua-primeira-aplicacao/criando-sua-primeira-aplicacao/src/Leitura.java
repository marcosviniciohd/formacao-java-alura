import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitor.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitor.nextInt();
        System.out.println("Ano de lançamento do seu filme favorito: " + anoDeLancamento);
        System.out.println("Seu filme favorito é: " + filmeFavorito);
        leitor.close();
    }
}
