import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;
        while (tentativas < 5){
            System.out.println("Tente adivinhar o número secreto: ");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado == numeroSecreto){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (numeroDigitado > numeroSecreto){
                System.out.println("O número secreto é menor");
            } else {
                System.out.println("O número secreto é maior");
            }
            tentativas++;
        }
    }
}
