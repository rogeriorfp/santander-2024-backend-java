import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o número agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o saldo da conta: ");
            float saldo = scanner.nextFloat();

            System.out.printf(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível",
                    nome, agencia, numero, saldo);
        }
    }
}
