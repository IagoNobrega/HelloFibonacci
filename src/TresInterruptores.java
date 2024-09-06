import java.util.Scanner;

public class TresInterruptores {
    public static void main(String[] args) {
        final int ACESA = 1;
        final int APAGADA_QUENTE = 2;
        final int APAGADA_FRIA = 3;

        Scanner scanner = new Scanner(System.in);

        // Primeira ida
        System.out.println("Primeira ida:");
        System.out.println("Ligando o interruptor 1 e esperando...");
        System.out.println("Ligando o interruptor 2 e indo para a sala A...");

        System.out.print("Digite o estado da lâmpada na sala A (1=acesa, 2=apagada e quente, 3=apagada e fria): ");
        int estadoSalaA = scanner.nextInt();
        while (estadoSalaA < 1 || estadoSalaA > 3) {
            System.out.println("Valor inválido. Digite 1, 2 ou 3.");
            System.out.print("Digite o estado da lâmpada na sala A: ");
            estadoSalaA = scanner.nextInt();
        }

        // ... (resto do código)

        // Segunda ida
        System.out.print("Digite o estado da lâmpada na sala B: ");
        int estadoSalaB = scanner.nextInt();
        while (estadoSalaB < 1 || estadoSalaB > 3) {
            System.out.println("Valor inválido. Digite 1, 2 ou 3.");
            System.out.print("Digite o estado da lâmpada na sala B: ");
            estadoSalaB = scanner.nextInt();
        }

        // ... (resto do código)

        scanner.close();
    }
}