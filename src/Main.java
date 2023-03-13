import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.print("Ingresa la cantidad del arreglo: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        Primos primo = new Primos(num);
        primo.IdePrimos();
        primo.mostrarArreglo();

        Fibonacci fibonacci = new Fibonacci(num);
        fibonacci.llenar();
        fibonacci.mostrarArreglo();
    }
}