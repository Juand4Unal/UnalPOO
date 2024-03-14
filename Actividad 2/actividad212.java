import java.util.Scanner;

public class actividad212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String NOM = scanner.nextLine();

        System.out.print("Ingrese horas trabajadas: ");
        int NHT = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el valor de hora de trabajo: ");
        double VHN = Double.parseDouble(scanner.nextLine());

        int HET = 0;
        int HEES = 0;
        double salario;

        if (NHT > 40) {
            HEES = NHT - 40;
            if (HEES > 8) {
                HET = HEES - 8;
                HET = (int) (HET * VHN * 3);
                HEES = (int) (8 * VHN * 2);
            } else {
                HEES = (int) (HEES * VHN * 2);
            }

            salario = (40 * VHN) + HEES + HET;
        } else {
            salario = VHN * NHT;
        }

        System.out.println("EL TRABAJADOR " + NOM + " DEVENGÓ: $" + salario);
    }
}
