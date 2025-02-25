import java.util.Locale;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.of("pt", "BR"));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());
        // scanner.useLocale(Locale.of("pt", "BR"));

        ContaTerminal conta = new ContaTerminal();

        conta.criarConta(scanner);
        conta.imprimirDadosConta();
        scanner.close();
        
    }
}
