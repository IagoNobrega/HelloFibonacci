public class SequenciasNumericas {



    public static int proximoImpar(int ultimo) {
        return ultimo + 2;
    }

    public static int proximaPotenciaDeDois(int ultimo) {
        return ultimo * 2;
    }

    public static int proximoQuadradoPerfeito(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 1) * (raiz + 1);
    }

    public static int proximoQuadradoPar(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 2) * (raiz + 2);
    }

    public static int proximoFibonacci(int anterior , int atual) {
        return anterior + atual;
    }

    public static int proximaSequenciaAlternante(int ultimo) {
        // Uma possível implementação para a sequência alternante
        // Assumindo que a sequência começa com 2 e alterna entre adicionar e subtrair 2
        if (ultimo % 4 == 0) {
            return ultimo - 2;
        } else {
            return ultimo + 1;
        }
    }

    public static void main(String[] args) {
        // Exemplos de uso:
        int resultado;

        // Sequência a)
        resultado = proximoImpar(7);
        System.out.println("Próximo elemento da sequência a): " + resultado);

        // Sequência b)
        resultado = proximaPotenciaDeDois(64);
        System.out.println("Próximo elemento da sequência b): " + resultado);

        //Sequêcia C)
        resultado = proximoQuadradoPerfeito(36);
        System.out.println("Próximo elemento da sequência b): " + resultado);

        // Sequêcia D
        resultado = proximoQuadradoPar(64);
        System.out.println("Próximo elemento da sequência b): " + resultado);
        
        //Sequêcia E)
        int anterior = 5;
        int atual = 8;
        resultado = proximoFibonacci (anterior, atual);
        System.out.println("Próximo elemento da sequência b): " + resultado);

        // Sequência f) (
        resultado = proximaSequenciaAlternante(19);
        System.out.println("Próximo elemento da sequência f): " + resultado);

    }


}