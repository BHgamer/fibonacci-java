import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        int fib01 = 0;
        int fib02 = 1;

        boolean pertence = false;

        while (fib01 <= numero) {

            if (fib01 == numero) {
                pertence = true;
                break;
            }

            int proximo = fib01 + fib02;

            fib01 = fib02;
            fib02 = proximo;
        }

        if (pertence) {
            System.out.println(numero + " Pertence à sequência de Fibonacci!");
        } else {
            System.out.println(numero + " Não pertence à sequência de Fibonacci!");
        }

        scanner.close();
    }
}