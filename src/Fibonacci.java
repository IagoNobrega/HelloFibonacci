class Fibonacci {
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1;
        while (b <= num) {
            if (b == num) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        int numero = 21; // Substitua por qualquer número que desejar

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}