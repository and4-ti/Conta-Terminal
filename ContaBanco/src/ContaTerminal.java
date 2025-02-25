import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private String agencia = null;
    private int numero = 0;
    private String nomeCliente = null;
    private double saldo = 0.00;
    
    public void criarConta(Scanner scanner) {
        
        while (true) {
            System.out.println("Digite o número da agência com o digito: ");
            String entrada = scanner.nextLine();

            try {
                if (validarCampo(entrada)) {
                    this.agencia = entrada;
                    break;
                } else {
                    throw new QuantidadeDigitosException("Agência: Apenas números com no mínimo quatro digitos e sem separação.");
                }
            }
            catch(QuantidadeDigitosException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.println("Digite o número da conta com o digito: ");
            String conta = scanner.nextLine();

            try {
                if (validarCampo(conta)) {
                    this.numero = Integer.parseInt(conta);
                    break;
                } else {
                    throw new QuantidadeDigitosException("Conta: Apenas números com no mínimo quatro digitos e sem separação.");
                }
            }
            catch(QuantidadeDigitosException e) {
                System.out.println(e.getMessage());
            }
        }
        
        while (true) {
            System.out.println("Digite seu nome completo: ");
            String nome = scanner.nextLine();
            
            if (nome.matches("^[a-zA-Z\\u00C0-\\u00FF '-]{3,}$")) {
                this.nomeCliente = nome;
                break;
            } else {
                System.out.println("Este campo não aceita números e deve conter no mínimo três caracteres.");
            }            
        }

        while (true) {
            System.out.println("Informe o valor de saldo: ");
            String valor = scanner.nextLine();

            try {
                if (!valor.isEmpty()) {
                    this.saldo = Double.parseDouble(valor);
                    break;
                } else {
                    System.out.println("Por favor, digite um valor.");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Aceita apenas números inteiros ou decimais com separação por ponto.");
            }
        }

    }

    public void imprimirDadosConta() {
        System.out.println("Olá, " + this.nomeCliente + "! Obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + formatarAgencia(this.agencia));
        System.out.println("Conta: " + formatarConta(this.numero));
        System.out.println("Seu saldo é de " + formatarSaldo(this.saldo) + " e já está disponível para saque.");
    }

    private String formatarAgencia(String entrada) {
        return entrada.replaceAll("(\\d)(\\d)$", "$1-$2");
    }

    private String formatarConta(int numero) {
        return String.format("%d", numero).replaceAll("(\\d)(\\d)$","$1-$2");
    }

    private String formatarSaldo (double saldo) {
        NumberFormat moedaLocal = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        return moedaLocal.format(saldo);
    }

    private boolean validarCampo(String quantidade) throws QuantidadeDigitosException {
        return quantidade.matches("\\d{4,}");
    }
}
