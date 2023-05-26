import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "João Clack Kent";
        String tipoConta = "Conta Corrente";
        double saldo = 1000.00;
        int opcao = 0;

        System.out.println("*******************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*******************************************");

        String menu = """
                Escolha uma opção:
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner sc = new Scanner(System.in);

        while (opcao != 4){
            System.out.println("\n");
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Seu saldo é: " + saldo);
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Seu saldo é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Recebimento realizado com sucesso!");
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
