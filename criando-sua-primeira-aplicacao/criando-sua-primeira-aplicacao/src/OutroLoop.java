import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Digite a avaliação para o filme ou -1 para ( SAIR ): ");
            nota = sc.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Média de avaliação: " + mediaAvaliacao / totalDeNotas);
    }
}
