import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double area = 3.1416 * radio * radio;
        double longitud = 2 * radio;
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del circulo es: " + longitud);
        
        scanner.close();
    }
}