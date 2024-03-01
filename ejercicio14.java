import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();
        
        double numeron = Math.abs(numero);
        
        System.out.println("Numero negativo: " + numero);
        System.out.println("Numero positivo: " + numeron);
        
        scanner.close();
    }
}