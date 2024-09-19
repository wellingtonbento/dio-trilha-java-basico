import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira o nome do titular da conta: ");
        String nomeDoTitularDaConta = scanner.nextLine();

        System.out.print("Insira a agencia da conta: ");
        String agenciaDaConta = scanner.next();

        System.out.print("Insira o numero da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.print("Inserir um saldo para conta: ");
        double saldoDaConta = scanner.nextDouble();

        System.out.println();

        System.out.println("Olá "
                + nomeDoTitularDaConta + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agenciaDaConta + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta
                + " já está disponível para saque");
    }
}