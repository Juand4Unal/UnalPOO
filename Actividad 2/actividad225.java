import java.util.Scanner;

public class actividad225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dato 1: ");
        double dato1 = scanner.nextDouble();
        System.out.print("Ingrese el dato 2: ");
        double dato2 = scanner.nextDouble();
        System.out.print("Ingrese el dato 3: ");
        double dato3 = scanner.nextDouble();
        System.out.print("Ingrese el dato 4: ");
        double dato4 = scanner.nextDouble();

        if (dato1 > dato2 && dato1 > dato3 && dato1 > dato4) {
            System.out.println("Dato 1 es el más grande.");
        } else if (dato2 > dato1 && dato2 > dato3 && dato2 > dato4) {
            System.out.println("Dato 2 es el más grande.");
        } else if (dato3 > dato1 && dato3 > dato2 && dato3 > dato4) {
            System.out.println("Dato 3 es el más grande.");
        } else {
            System.out.println("Dato 4 es el más grande.");
        }
    }
}