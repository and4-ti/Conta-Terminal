import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        conta.criarConta(scanner);
        conta.imprimirDadosConta();

    }
}
