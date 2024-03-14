import java.util.Scanner;

public class actividad224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double esferaA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double esferaB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double esferaC = scanner.nextDouble();

        if (esferaA > esferaB && esferaA > esferaC) {
            System.out.println("Esfera A es más pesada.");
        } else if (esferaB > esferaA && esferaB > esferaC) {
            System.out.println("Esfera B es más pesada.");
        } else {
            System.out.println("Esfera C es más pesada.");
        }
    }
}
