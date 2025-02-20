import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private String agencia = null;
    private int numero = 0;
    private String nomeCliente = null;
    private double saldo = 0.00;
    

    public void criarConta(Scanner scanner) {
        
        while (true) {
            System.out.println("Digite o número da agência: ");
            String agencia = scanner.nextLine();
            
            // Verificar se o usuário avançou deixando o campo em branco
            if (!agencia.isEmpty()) {
                this.agencia = agencia;
                break;
            } else {
                System.out.println("Este campo não pode ficar em branco.");
            }
        }

        while (true) {
            System.out.println("Digite o número da conta: ");
            try {
                this.numero = scanner.nextInt();
                scanner.nextLine();
                break;

            } catch(InputMismatchException e) {
                System.out.println("Digite apenas números.");
                scanner.nextLine();
            }
        }
        
        while (true) {
            System.out.println("Digite seu nome completo: ");
            String nomeCliente = scanner.nextLine();
            
            // Verificar se o usuário avançou deixando o campo em branco
            if (!nomeCliente.isEmpty()) {
                this.nomeCliente = nomeCliente;
                break;
            } else {
                System.out.println("Este campo não pode ficar em branco.");
            }
        }

        while (true) {
            System.out.println("Informe o valor de saldo: ");
            try {
                this.saldo = scanner.nextDouble();
                scanner.nextLine();
                break;

            } catch(InputMismatchException e) {
                System.out.println("Esse campo aceita apenas números inteiros e decimais.");
                System.out.println("Se continuar vendo essa mensagem, ao invés de ponto, digite vírgula para separar as casas decimais.");
                scanner.nextLine();
            }
        }

    }

    public void imprimirDadosConta() {
        
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        
        System.out.println("Olá, " + this.nomeCliente + "! Obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Seu saldo é de " + moeda.format(this.saldo) + " e já está disponível para saque.");
    }

}
