import java.util.Scanner;

public class SenteciaCiclica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Patrón 1: ");
        int contador = 0;
        do {
            System.out.println("*.*.*");
            contador++;
        } while (contador < numero);

        System.out.println("Patrón 2: ");
        contador = 0;
        do {
            System.out.println("****");
            int fila = 0;
            do {
                System.out.println("*   *");
                fila++;
            } while (fila < 2);
            System.out.println("****");
            contador++;
        } while (contador < numero);
    }
}
