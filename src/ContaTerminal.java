import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");

        String nome = teclado.nextLine();

        System.out.print("Por favor digite o número da sua Agência!: ");

        String agencia = teclado.nextLine();

        System.out.print("Digite o número da sua conta: ");

        int conta = teclado.nextInt();

        System.out.print("Seu saldo é de 550.98");

        float saldo = teclado.nextFloat();

    }

}
