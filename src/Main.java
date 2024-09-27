import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String dadosNome = "Roberto Jorge";
        String dadosConta = "Corrente";
        double dadosSaldo = 4000.00;
        int operacaoSelecionada = 0;

        String dados = """
                
                ********************************
                
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                
                ********************************""".formatted(dadosNome, dadosConta, dadosSaldo);
        String menu = """
                
                **** Operações ****
                
                1 - Consultar saldos
                2 - Depositar valor
                3 - Sacar valor
                4 - Sair
                
                Digite a opção desejada:""";

        System.out.println(dados);

        while (operacaoSelecionada != 4) {
            System.out.println(menu);
            operacaoSelecionada = leitura.nextInt();
            if (operacaoSelecionada == 1) {
                System.out.println(String.format("O seu saldo é de: R$ %.2f", dadosSaldo));
            } else if (operacaoSelecionada == 2) {
                System.out.println("Digite o valor que você gostaria de depositar:");
                double valorDeposito = leitura.nextDouble();
                dadosSaldo += valorDeposito;
                if (valorDeposito == 1) {
                    System.out.println(String.format("Foi depositado: R$ %.2f", valorDeposito));
                } else {
                    System.out.println(String.format("Foram depositados: R$ %.2f", valorDeposito));
                }
                System.out.println(String.format("O seu saldo foi atualizado para: R$ %.2f", dadosSaldo));
            } else if (operacaoSelecionada == 3) {
                System.out.println("Digite o valor que você gostaria de sacar:");
                double valorSacado = leitura.nextDouble();
                if (valorSacado > dadosSaldo) {
                    System.out.println("A operação não pode ser concluída.");
                    System.out.println("O valor a ser sacado é superior ao que consta no saldo.");
                } else if (valorSacado == 1) {
                    dadosSaldo -= valorSacado;
                    System.out.println(String.format("Foi sacado: R$ %.2f", valorSacado));
                } else {
                    dadosSaldo -= valorSacado;
                    System.out.println(String.format("Foram sacados: R$ %.2f", valorSacado));
                }
                System.out.println(String.format("O seu saldo atualizado é de: R$ %.2f", dadosSaldo));
            } else if (operacaoSelecionada == 4) {
                System.out.println("Obrigado por fazer uso do sistema bancário virtual!");
                System.out.println("As operações foram encerradas com sucesso.");
            } else {
                System.out.println("A opção selecionada é inválida, tente novamente.");
            }
        }
    }
}