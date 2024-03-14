import java.util.Scanner;

public class actividad222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el salario básico del empleado por hora: ");
        int salhora = scanner.nextInt();
        System.out.print("Ingrese las horas trabajadas en el mes: ");
        int horas = scanner.nextInt();

        int salario = salhora * horas;

        if (salario > 450000) {
            System.out.println(nombre);
            System.out.println(salario);
        } else {
            System.out.println(nombre);
        }
    }
}
