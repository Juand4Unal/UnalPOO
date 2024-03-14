import java.util.Scanner;

public class actividad213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        float VALCOMP = Float.parseFloat(scanner.nextLine());
        System.out.print("Color de la bolita: ");
        String COLOR = scanner.nextLine().toUpperCase();

        float VALPAG;
        int PDES;

        switch (COLOR) {
            case "BLANCO":
                PDES = 0;
                VALPAG = VALCOMP;
                break;
            case "VERDE":
                PDES = 10;
                VALPAG = VALCOMP - ((VALCOMP * 10) / 100);
                break;
            case "AMARILLO":
                PDES = 25;
                VALPAG = VALCOMP - ((VALCOMP * PDES) / 100);
                break;
            case "AZUL":
                PDES = 50;
                VALPAG = VALCOMP - ((VALCOMP * PDES) / 100);
                break;
            case "ROJO":
                PDES = 100;
                VALPAG = VALCOMP - ((VALCOMP * PDES) / 100);
                break;
            default:
                System.out.println("Color no válido");
                return;
        }

        System.out.println(VALPAG);
    }
}
