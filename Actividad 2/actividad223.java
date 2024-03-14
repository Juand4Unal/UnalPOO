import java.util.Scanner;
public class actividad223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribir el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Escribir el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Escribir el valor de C: ");
        double C = scanner.nextDouble();

        double discriminante = Math.sqrt(B * B - 4 * A * C);

        double respuesta1 = (-B + discriminante) / (2 * A);
        double respuesta2 = (-B - discriminante) / (2 * A);

        System.out.println(respuesta1);
        System.out.println(respuesta2);
    }
}
