import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        
        try (Scanner receber = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = receber.nextInt();

            receber.nextLine();

            System.out.println("Digite a agencia: ");
            String agencia = receber.nextLine();

            System.out.println("Digite o nome do cliente: ");
            String nomeCliente = receber.nextLine();

            System.out.println("Digite o saldo da conta: R$ ");
            Double saldoConta = receber.nextDouble();

            System.err.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: "
                    + agencia + ", conta: " + numeroConta + " e seu saldo: R$ " + saldoConta
                    + " já está disponível para saque");
        }
       
    }
}
