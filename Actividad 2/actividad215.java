import java.util.Scanner;

public class actividad215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double PESOA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double PESOB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double PESOC = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        double PESOD = scanner.nextDouble();

        if (PESOA == PESOB && PESOB == PESOC) {
            if (PESOD > PESOA) {
                System.out.println("La esfera D es la diferente.");
            } else {
                System.out.println("La esfera D es la diferente.");
            }
        } else if (PESOA == PESOB && PESOB == PESOD) {
            System.out.println("La esfera C es la diferente.");
            if (PESOC > PESOA) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else if (PESOA == PESOC && PESOC == PESOD) {
            System.out.println("La esfera B es la diferente.");
            if (PESOB > PESOD) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else {
            System.out.println("La esfera A es la diferente.");
            if (PESOA > PESOB) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        }
    }
}