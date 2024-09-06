import java.util.Scanner;

public class ContadorLetrasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vezes.");
    }
}
