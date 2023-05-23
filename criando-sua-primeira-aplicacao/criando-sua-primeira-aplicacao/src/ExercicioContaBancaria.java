import entidade.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Entre com o número da conta: ");
        conta.setNumero(sc.nextInt());
        System.out.println("Entre com o saldo inicial da conta: ");
        conta.setSaldo(sc.nextDouble());

        while (opcao != 3){
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Digite o valor a ser depositado: ");
                conta.depositar(sc.nextDouble());
                System.out.println("Saldo atualizado: " + conta.getSaldo());
            } else if (opcao == 2){
                System.out.println("Digite o valor a ser sacado: ");
                conta.sacar(sc.nextDouble());
                System.out.println("Saldo atualizado: " + conta.getSaldo());
            } else if (opcao == 3){
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
