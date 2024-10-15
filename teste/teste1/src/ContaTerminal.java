import java.util.Scanner;

public class ContaTerminal {

    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a sua Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ",conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    scanner.close();
    }

}
